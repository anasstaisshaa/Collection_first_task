package com.JavaCore.collection;

import java.util.ArrayList;

public class Runner {
    public ArrayList<Integer> oddValues(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer integer : list) {
            if(integer % 2 != 0){
                newList.add(integer);
            }
        }
        return newList;
    }
}
