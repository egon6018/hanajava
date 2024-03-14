package com.hana.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args){
        List<CustDto> list = new ArrayList<>();

        // CustDto클래스의 객체를 만들어서 멤버변수에 값을 집어넣을 수 있다.
        list.add(CustDto.builder().id("id01").pwd("pwd01").name("James01")
                                .age(20).money(30000L).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id02").pwd("pwd02").name("James02")
                                .age(21).money(31000L).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id03").pwd("pwd03").name("James03")
                                .age(22).money(32000L).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id04").pwd("pwd04").name("James04")
                                .age(23).money(33000L).regdate(LocalDate.parse("2024-01-02")).build());
        list.add(CustDto.builder().id("id05").pwd("pwd05").name("James05")
                                .age(24).money(34000L).regdate(LocalDate.parse("2024-01-02")).build());


        // 그냥 단순하게 돌리는것은 list.forEach()해도 되고
        // stream쓸꺼면 list.stream().forEach((c)->System.out.println(c));를 하는 거고
        list.forEach((c)->System.out.println(c));

        System.out.println("--------------------------------------------------------------------");

        for(CustDto c:list){ // 한번에
            System.out.printf(" 고객정보: %s %d %,d원 %s \n",
                    c.getId(), c.getAge(), c.getMoney(),
                    c.getRegdate());
        }

        for(CustDto c:list){ // 연,월,일로 분해
            System.out.printf(" 고객정보: %s %d %,d원 %s년 %s월 %s일 \n",
                    c.getId(), c.getAge(), c.getMoney(),
                    c.getRegdate().getYear(), c.getRegdate().getMonthValue(), c.getRegdate().getDayOfMonth());
        }


        System.out.println("--------------------------------------------------------------------------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일");

        for(CustDto c:list){ // 연,월,일로 분해
            System.out.printf(" 고객정보: %s %d %,d원 %s \n",
                    c.getId(), c.getAge(), c.getMoney(),
                    c.getRegdate().format(formatter) // 내가 만든 데이터로 format하겠다
            );
        }
    }
}
