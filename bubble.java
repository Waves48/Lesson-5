package org.itstep;

import java.util.Arrays;

// двухмерные массивы - сортировка, пузыри
public class bubble {
    public static int a[] = {5,3,2,5,2,8,4,2,1,9};
    public static void main (String[] args){

        for (int i=0; i<a.length-1; i++)
            for (int j=0; j<a.length-1-i; j++)
            if (a[j]>a[j+1])
                swap(j, j+1);
        System.out.println(Arrays.toString(a));
    }
    public static void swap (int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j] = temp;
    }
}
