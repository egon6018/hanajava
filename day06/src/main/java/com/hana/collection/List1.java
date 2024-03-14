package com.hana.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List1 {
    public static void main(String[] args){
        // List<> list = 를 하면 여러가지 list객체를 만들기가 가능!
        // => new Vector<>();해도 되고,new LinkedList<>();를 해도 되고, new ArrayList<>();를 해도 된다.

        // 근데 만약 ArrayList<> list=를 하게 되면 ArrayList객체밖에 만들지 못함

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.toString());
        System.out.println();

        for(String s:list){
            System.out.println(s);
        }
        System.out.println();

        // 위의 코드를 아래로 람다함수를 이용하여 한줄로 구현 가능
        list.stream().forEach((s)->System.out.println(s));
        System.out.println();


        // list.contains() => 있냐 없냐. boolean으로 리턴됨
        list.remove("B"); // remove() => 특정한 것을 삭제해줌
        list.stream().forEach((s)->System.out.println(s));
        System.out.println();

        list.add("D");
        list.add("E");

        System.out.println(list.indexOf("A")); // indexOf() => 해당하는 애가 몇번째에 존재하는지
        System.out.println();

        String result = list.get(list.indexOf("A"));
        System.out.println(result);
    }
}
