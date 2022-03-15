package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tab1 = {1,2,3,4,5,};
        int[] tab2 = {2,4,6,8,10};

        int[] sum = sum_Array(tab1, tab2);

        System.out.println(Arrays.toString(sum));
        System.out.println(Arrays.toString(sum_Array(tab1, new int[]{1} )));
    }

    public static int[] sum_Array(int[] tab1, int[] tab2) {
        int[] tab_combined = new  int[tab1.length];
        if (tab1.length != tab2.length)
            return new int[]{};
        else {
            for (int i = 0; i < tab1.length; i++) {
                tab_combined[i] = tab1[i] + tab2[i];
            }
        }
        return tab_combined;
    }
}

