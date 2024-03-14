package com.hana.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class MyDate2 {
    public static void main(String[] args){
        Date date = new Date();

        // zoneId는 해당 지역이름/도시이름 입력
        LocalDate localDate = date.toInstant().atZone(ZoneId.of("Africa/Cairo")).toLocalDate();
        System.out.println(localDate);

        LocalDateTime localDatetime = date.toInstant().atZone(ZoneId.of("Africa/Cairo")).toLocalDateTime();
        System.out.println(localDatetime);
    }
}
