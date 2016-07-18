package com.jiakaiyang.common.java.date.utils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 日期相关操作工具类
 * TODO getFirstDayInMonth(),getFirstDayInYear(),getFirstMonth(),getLastDayInMonth(),getLastDayInYear(),getLastMonth()
 */
public class DateUtils {
    /**
     * 根据一个日期时间段获取该段时间中间的日期的列表,按月份进行划分
     * @param dBegin
     * @param dEnd
     * @return
     */
    public static List<Date> findDates(Date dBegin, Date dEnd) {
        List lDate = new ArrayList();
        lDate.add(dBegin);
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
        // 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            lDate.add(calBegin.getTime());
        }
        return lDate;
    }

    /**
     * 根据年月日获取date
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static Date getDate (int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        return calendar.getTime();
    }
}
