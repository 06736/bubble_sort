package com.company;

public class Main {

    public static void main(String[] args) {
        int[] list = {20,4,69,13,42, 51,60};

        System.out.println(bubble(list));
        for(int i = 0; i<list.length;i++) {
            System.out.println(list[i]);
        }

    }
    public static int[] bubble(int[] list){
        for(int i = 0;i<list.length-1;i++){
            for(int j = 0;j<list.length-i-1;j++){
                System.out.println(list[i]);System.out.println(list[i+1]);
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;


                }
            }
        }
        return list;
    }

}
