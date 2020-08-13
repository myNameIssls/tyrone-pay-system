package cn.tyrone.pay.common.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * 时间工具类
 */
public class DateUtil {

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(Pattern.NORM_DATE_PATTERN.getPattern());
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println(format);
    }

    /**
     * 获取日期格式化器
     * @param pattern
     * @return
     */
    private static DateTimeFormatter getDateTimeFormatter(Pattern pattern){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern.getPattern());
        return dateTimeFormatter;
    }

    /**
     * 获取当前日期字符
     * 默认日期格式: yyyy-MM-dd
     * @return
     */
    public static String getLocalDate(){
        String currentTime = getLocalDateTime(Pattern.NORM_DATE_PATTERN);
        return currentTime;
    }

    /**
     * 获取当前时间字符
     * 默认日期格式: yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String getLocalDateTime(){
        String currentTime = getLocalDateTime(Pattern.NORM_DATETIME_PATTERN);
        return currentTime;
    }

    /**
     * 获取指定日期格式的日期字符串
     * @param pattern
     * @return
     */
    public static String getLocalDateTime(Pattern pattern){
        DateTimeFormatter dateTimeFormatter = getDateTimeFormatter(pattern);
        LocalDateTime localDateTime = LocalDateTime.now();
        String currentTime = localDateTime.format(dateTimeFormatter);
        return currentTime;
    }

    /**
     * 日期格式枚举类
     */
    public enum Pattern{

        NORM_DATE_PATTERN("yyyy-MM-dd"),
        NORM_DATETIME_PATTERN("yyyy-MM-dd HH:mm:ss"),
        NORM_DATE_CLOSE_FORMAT("yyyyMMdd"),
        NORM_DATETIME_CLOSE_PATTERN("yyyyMMddHHmmss")
        ;

        Pattern(String pattern) {
            this.pattern = pattern;
        }

        /**
         * 日期格式
         */
        private String pattern;

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }
    }

}
