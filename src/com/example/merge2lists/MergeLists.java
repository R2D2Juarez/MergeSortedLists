package com.example.merge2lists;

import java.util.ArrayList;
import java.util.List;

public class MergeLists {

    //Merge 2 sorted lists to another resultant sorted list

    public static void main(String[] args){

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        List<Integer> mergedList = new ArrayList<>();

        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);

        secondList.add(6);
        secondList.add(7);
        secondList.add(8);
        secondList.add(9);
        secondList.add(10);

        mergedList.addAll(firstList);
        mergedList.addAll(secondList);

        for (int i = 0; i < mergedList.size(); i++){
            System.out.println(mergedList.get(i));
        }
    }

}


