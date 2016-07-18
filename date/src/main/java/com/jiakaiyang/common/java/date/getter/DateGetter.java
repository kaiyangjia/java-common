package com.jiakaiyang.common.java.date.getter;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 获取某些典型的日期
 * TODO getFirstDayInMonth(),getFirstDayInYear(),getFirstMonth(),getLastDayInMonth(),getLastDayInYear(),getLastMonth()
 */
public class DateGetter {

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
