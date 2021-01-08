package com.datastructure;

import java.util.Arrays;

public class Heaps {

    private int[] arr;

    public Heaps(int[] arr) {
        this.arr = arr;
    }

    public boolean isValidMaxHeap(){
        for (int i = 0; i < arr.length; i++){
            int leftIndex = (2*i) + 1;
            if (leftIndex < arr.length && arr[i] < arr[leftIndex])
                return false;

            int rightIndex = (2*i) + 2;
            if (rightIndex < arr.length && arr[i] < arr[rightIndex])
                return false;
        }

        return true;
    }

    public boolean isValidMinHeap(){
        for (int i = 0; i < arr.length; i++){
            int leftIndex = (2*i) + 1;
            if (leftIndex < arr.length && arr[i] > arr[leftIndex])
                return false;

            int rightIndex = (2*i) + 2;
            if (rightIndex < arr.length && arr[i] > arr[rightIndex])
                return false;
        }

        return true;
    }

    public void deleteElement(int element){

    }

    @Override
    public String toString() {
        return "Heaps{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
