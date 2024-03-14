package com.hana.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class List4 {
    public static void main(String[] args){
        Set<String> setData = new HashSet<>();
        setData.add("A");
        setData.add("C");
        setData.add("B");
        setData.add("C");
        setData.add("A");
        System.out.println(setData);

        // 1~100까지 랜덤한 숫자를 중복 없이 10개 발생시켜라
        Set<Integer> randomNum = new HashSet<>();
        Random random = new Random();

        for(int i=0;i<10;i++) {
            randomNum.add(random.nextInt(100)+1);
        }

        System.out.println(randomNum);
        randomNum.stream().sorted().forEach((c)->System.out.printf(c+" "));
    }
}
