package com.example.demo.config;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 时间工具类
 * @author xiaoyueya
 */
public class TimeUtils {

    /**
     * 获取没有连接符的日志类型
     * @return
     */
    public static String getCurrentShortDate(){
       return new SimpleDateFormat("yyyyMMdd", Locale.CHINESE).format(Calendar.getInstance().getTime());
    }

    /**
     * 获取带连接符的日期类型
     * @return
     */
    public static String getCurrentNormalDate(){
        return new SimpleDateFormat("yyyy-MM-dd", Locale.CHINESE).format(Calendar.getInstance().getTime());
    }

    /**
     * 获取当年的年份
     * @return
     */
    public static int getCurrentYear(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getYear();
    }

    /**
     * 获取当年的月份
     * @return
     */
    public static int getCurrentMonth(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getMonthValue();
    }

    /**
     * 获取当前年份的后两位
     * @return
     */
    public static String getCurrentShortYear(){
        return new SimpleDateFormat("yy", Locale.CHINESE).format(Calendar.getInstance().getTime());
    }

    /**
     * 获取当前年份的后两位
     * @return
     */
    public static String getCurrentShortMouth(){
        return new SimpleDateFormat("MM", Locale.CHINESE).format(Calendar.getInstance().getTime());
    }

    /**
     * 获取当前的年和月
     * @return
     */
    public static String getCurrentYearAndMonth(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return String.format("%d-%d",localDateTime.getYear(),localDateTime.getMonthValue());
    }

    /**
     * 生成年月
     * @return
     */
    public static String getCurrentShortYearAndMonth(){
        return new SimpleDateFormat("yyMM", Locale.CHINESE).format(Calendar.getInstance().getTime());
    }



    /**
     * 获取当前时间
     * @return
     */
    public static Date getCurrentDate(){
        return new Date();
    }


    /***
     * 判断字符串是否是 HH:mm:ss 格式
     * @param dateTime 字符串
     * @return boolean 是否包含日期格式
     */
    public static boolean inclusionTime(String dateTime){
        String format = "\\s+([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
        Pattern pattern = Pattern.compile(format);
        Matcher matcher = pattern.matcher(dateTime);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * 获取当前日期在本月是第几周
     * @return
     */
    public static int getWeekOfMonth(){
        Calendar calendar = Calendar.getInstance();
        int weekNum = calendar.get(Calendar.WEEK_OF_MONTH)+1;
        return weekNum;
    }


}
