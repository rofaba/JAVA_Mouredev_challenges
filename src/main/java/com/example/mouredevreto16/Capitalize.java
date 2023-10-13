package com.example.mouredevreto16;

import java.util.ArrayList;
import java.util.List;

public class Capitalize {
    public void converter(String s){
        char[] resultchart = s.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : resultchart) {
            charList.add(c);
        }
        System.out.println(charList);
    }

}
