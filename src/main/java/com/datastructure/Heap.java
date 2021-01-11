package com.datastructure;

import java.util.Arrays;

public class Heap {

    private int[] arr;

    public Heap(int[] arr) {
        this.arr = arr;
    }

    public void remove(int element){

        if (element == this.arr[0]){
            boolean fistElementGreater = this.arr[0] > this.arr[this.arr.length - 1];

            chantePosition(0, this.arr.length - 1);

            this.arr = Arrays.copyOf(this.arr, this.arr.length - 1);

            if (fistElementGreater)
                orderMaxHeap();
            else
                orderMinHeap();
        }


    }

    public void insert(int element){
        boolean fistElementGreater = this.arr[0] > this.arr[this.arr.length - 1];

        int newArr[] = Arrays.copyOf(this.arr, this.arr.length + 1);

        newArr[this.arr.length] = element;
        this.arr = newArr;

        for (int i = arr.length - 1; i > -1; i--){
            int prevIndex = (i-1) / 2;
            if (prevIndex < arr.length) {
                if (fistElementGreater && arr[i] > arr[prevIndex]) {
                    chantePosition(i, prevIndex);
                }

                if (!fistElementGreater && arr[i] < arr[prevIndex]) {
                    chantePosition(i, prevIndex);
                }
            }
        }
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

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    private void orderMaxHeap(){
        for (int i = 0; i < arr.length; i++){

            int leftIndex = (2 * i) + 1;
            if (leftIndex < arr.length && arr[i] < arr[leftIndex]) {
                chantePosition(i, leftIndex);
            }

            int rightIndex = (2 * i) + 2;
            if (rightIndex < arr.length && arr[i] < arr[rightIndex]) {
                chantePosition(i, rightIndex);
            }

        }
    }

    private void orderMinHeap(){
        for (int i = 0; i < arr.length; i++){

            int leftIndex = (2 * i) + 1;
            if (leftIndex < arr.length && arr[i] > arr[leftIndex]) {
                chantePosition(i, leftIndex);
            }

            int rightIndex = (2 * i) + 2;
            if (rightIndex < arr.length && arr[i] > arr[rightIndex]) {
                chantePosition(i, rightIndex);
            }

        }
    }

    private void chantePosition(int i, int prevIndex){
        int temp = arr[prevIndex];
        arr[prevIndex] = arr[i];
        arr[i] = temp;
    }

}
