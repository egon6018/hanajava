package com.hana.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class MyDate {
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getYear());
        System.out.println(d.getMonth());

        System.out.println("----------------------------------------------");

        LocalDate localNow = LocalDate.now();
        System.out.println(localNow);

        // 특정 날짜의 localDate를 만들 수 있음!
        LocalDate localDate1 = LocalDate.of(2024,3,14); // of는 (연,월,일)
        LocalDate localDate2 = LocalDate.parse("2024-03-14"); // parse는 무조건 연-월-일 형식으로!
        System.out.println(localDate1);
        System.out.println(localDate2);

        System.out.println("----------------------------------------------");

        LocalDateTime localTimeNow = LocalDateTime.now();
        System.out.println(localTimeNow);

        // 시,분,초까지 쓰고 싶으면
        LocalDateTime localTime1 = LocalDateTime.of(2024,03,11,11,11,11);
        LocalDateTime localTime2 = LocalDateTime.parse("2024-03-11T11:11:11");
        System.out.println(localTime1);
        System.out.println(localTime2);
    }
}
