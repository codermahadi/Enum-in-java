package com.mahadi;

/**
 * Created by Mahadi on 2/5/2018.
 */
public enum Example2 {

    WINTER(20),SUMMER(50);


    public int value;

    Example2(int i) {

        this.value = i;
    }
}

class Apps{

    public static void main(String[] args) {

        for (Example2 e : Example2.values()){
            System.out.println(e + "  "+e.value);
        }
    }
}
