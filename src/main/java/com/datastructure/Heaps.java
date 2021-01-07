package com.datastructure;

import java.util.Arrays;

public class Heaps {

    private int[] arr;

    public Heaps(int[] arr) {
        this.arr = arr;
    }

    /*public boolean isValid(){

        for (int i = 0; i < arr.length; i++)


        return true;
    }*/

    public int minValue(){
        if (arr[arr.length - 1] < arr[0])
            return arr[arr.length - 1];
        return arr[0];
    }

    public int maxValue(){
        if (arr[0] > arr[arr.length - 1])
            return arr[0];
        return arr[arr.length - 1];
    }

    public int insert(){

    }

    @Override
    public String toString() {
        return "Heaps{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
