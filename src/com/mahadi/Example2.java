package com.mahadi;

/**
 * Created by Mahadi on 2/5/2018.
 */
public enum Example2 {

   // WINTER(20),SUMMER(50);


    WINTER(20){
        @Override
        public String dispSeasion(){

            return "winter";
        }
    },SUMMER(50){
        @Override
        public String dispSeasion(){

            return "summer";
        }
    };
    public int value;

    Example2(int i) {

        this.value = i;
    }

    public abstract String dispSeasion();
}

class Apps{

    public static void main(String[] args) {

        for (Example2 e : Example2.values()){
            //System.out.println(e + "  "+e.value);
            System.out.println(e + "  "+e.value + " "+e.dispSeasion());
        }
    }
}
