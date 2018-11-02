package com.example.mike.fridaytest;

import java.util.Arrays;

public class CustomArrayList<T> {

    T[] data = (T[]) new Object[0];

    public void add( T a ){
        T newData[] = (T[]) new Object[data.length+1];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        newData[newData.length-1] = a;
        data = newData;
    }

    public T get( int index ){
        return data[index];
    }

    public void remove(int index){
        T newData[] = (T[]) new Object[data.length-1];

        int counterNew = 0;
        int counterOld = 0;
        boolean skipped = false;

        while ( counterNew < newData.length ){
            if ( counterNew == index && !skipped ){
                counterOld++;
                skipped = true;
                continue;
            }
            newData[counterNew] = data[counterOld];
            counterNew++;
            counterOld++;
        }
        this.data = newData;
    }

    public void removeLast(){
        remove(data.length-1);
    }

    public int size(){
        return this.data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
