package com.hana.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args){
        List<UserDto> list = new ArrayList<>();
        list.add(new UserDto("id01","pwd01","james01",10,20000,LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id02","pwd02","james02",10,20000,LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id03","pwd03","james03",10,20000,LocalDate.parse("2024-03-14")));


        // get()은 몇번째꺼를 가져와라, indexof()는 해당 객체가 몇번째에 있는지
        // id02 삭제해보기
//        for(UserDto u:list){
//            if(u.getId().equals("id03")){
//                list.remove(u);
//                break;
//            }
//        }

        // id03을 이름을 '말숙이'으로 수정해보기
//        for(UserDto u:list){
//            if(u.getId().equals("id03")){
//                u.setName("말숙이");
//                break;
//            }
//        }

        // id03 정보를 조회하라
        for(UserDto u:list){
            if(u.getId().equals("id03")){
                System.out.println(u);
            }
        }

        System.out.println("--------------------------------------------------------------------------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일");

        for(UserDto c:list){ // 연,월,일로 분해
            System.out.printf(" 고객정보: %s %d %,d원 %s %s \n",
                    c.getId(), c.getAge(), c.getMoney(),
                    c.getRegdate().format(formatter), // 내가 만든 데이터로 format하겠다
                    c.getName()
            );
        }
    }
}
