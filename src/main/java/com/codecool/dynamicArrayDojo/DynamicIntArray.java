package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {
    private int size;
    private int lastIndex;
    private int[] array;

    public DynamicIntArray(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public DynamicIntArray() {
        this.array = new int[0];
    }

    public void add(int number) {
        this.size += 1;
        this.lastIndex = size - 1;
        int[] newArray = new int[size];

        if (this.size != 1 ) {
            int index = 0;

            for (int element : this.array) {
                newArray[index] = element;
                index++;
            }
        }

        newArray[this.lastIndex] = number;
        this.array = newArray;
    }

    public void remove(int number) {
        int newSize = this.size - 1;
        int[] newArray = new int[newSize];

        int j = 0;
        for (int i = 0; i < this.size; i++) {

            if (this.array[i] != number) {
                newArray[j] = this.array[i];
                j++;
            }
        }

        this.array = newArray;
        this.size = newSize;
    }

    public void insert(int index, int number) {
        int newSize = this.size + 1;
        int lastIndex = newSize - 1;
        int[] newArray = new int[newSize];

        if (index <= this.size) {

            int j = 0;
            for (int i = 0; i < newSize; i++) {
                if (i == index) {
                    newArray[i] = number;
                } else {
                    newArray[i] = this.array[j];
                    j++;
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.array[i];
            }
            newArray[lastIndex] = number;
        }
        this.array = newArray;
        this.size = newSize;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int num : this.array) {
            sb.append(" ");
            sb.append(num);
        }

        String arrayToStr = sb.toString();

        return arrayToStr;
    }
}
