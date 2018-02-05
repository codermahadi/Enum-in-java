package com.mahadi;

/**
 * Created by Mahadi on 2/5/2018.
 *
 * An enum is a data type which contains fixed set of constants
 * The enum constants are static and final implicitly.
 * enum may implements many interface but cannot extend any class
 * enum can be defined within or outsite of the class
 *
 */


public class EnumExample1 {

    public enum Season{
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {

        for (Season s : Season.values()){

            System.out.println(s);

        }
    }
}
