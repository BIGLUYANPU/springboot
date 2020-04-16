package com.example.demo.config;

/**
 * @author xiaoyueya
 */
public interface Constants {

    String EMPTY = "";

    /**
     * 分隔符
     */
    String SEPARATOR = ",";

    /**
     * 冒号
     */
    String COLON = ":";

    /**
     * int 0
     */
    Integer ZERO = 0;

    /**
     * map默认值大小
     */
    Integer DEFAULT_LOAD_FACTOR = 16;

    /**
     * 默认页面索引
     */
    Integer PAGE_INDEX = 1;

    /**
     * 默认页面大小
     */
    Integer PAGE_SIZE = 15;

    /**
     * 时间格式
     */
    String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期类型
     */
    String SHORT_DATE_FORMAT = "yyyy-MM-dd";

    /**
     * KD装配形式
     */
    String ASSEMBLY_FORM_FOR_KD = "KD";

    /**
     * 整车装配形式
     */
    String ASSEMBLY_FORM_FOR_CBU = "CBU";

    /**
     * 中划线链接符
     */
    String LINE_THROUGH = "-";
    /**
     * 用户类型：经销商
     */
    Integer USER_TYPE_1 = 1;

    /**
     * 系统生成excel格式
     */
    String EXCEL_SUFFIX = ".xlsx";

    /**
     * zip扩展名
     */
    String ZIP_SUFFIX = ".zip";

    /**
     * 最大接手多少数据
     */
    Integer EXCEL_MAX_ROWS = 65535;

    /**
     * feign调用成功状态
     */
    Integer SUCCESS_STATUS = 200;

    /**
     * 默认语言
     */
    String defaultLang = "zh-cn";

    /**
     * 平台码
     */
    String PLAT_FORM_CODE = "international-sales";
}
