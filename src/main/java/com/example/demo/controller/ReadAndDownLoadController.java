package com.example.demo.controller;

import com.example.demo.service.Office2PDF;
import com.example.demo.util.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

@ComponentScan
@RestController
@RequestMapping("/test")
public class ReadAndDownLoadController {


    //base路径
    @Value("${BASE_PATH}")
    private  String BASE_PATH ;

    /**
     *
     * @return choose页面
     */
    @RequestMapping("/choose")
    public String chooseFile(){
        return "ShowChoose";
    }

    /**
     *
     * @param res 响应对象
     * @param fileName 请求预览文件名
     * @throws Exception
     */
    @RequestMapping(value = "/readFile/{fileName}",method = RequestMethod.GET)
    public void readFileName(HttpServletResponse res , @PathVariable(value = "fileName") String fileName) throws Exception{
        InputStream in = null;
        OutputStream out = null;
        String filePath =  fileHandler(fileName);
        //判断是pdf还是word还是excel
        //若是pdf直接读 否则转pdf 再读  //
        try{
            if(filePath != null){
                in = new FileInputStream(filePath);
            }
            res.setContentType("application/pdf");
            //显示文档
            res.setHeader("Content-Disposition", "inline;fileName=XXXX.pdf");
            out = res.getOutputStream();
            byte[] b = new byte[1024];
            int len = 0;
            while((len = in.read(b)) != -1){
                out.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }

    /**
     * 文件处理
     * @param fileName
     * @return
     */
    public String fileHandler(String fileName){
        String fileSuffix = FileUtil.getFileSuffix(fileName);
        System.out.println(fileSuffix);
        if("pdf".equals(fileSuffix))
        {
            return BASE_PATH + fileName;
        }
        else
        {
            return Office2PDF.openOfficeToPDF(BASE_PATH + fileName).getAbsolutePath();
        }

    }
}
