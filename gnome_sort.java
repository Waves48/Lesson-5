package org.itstep;

import java.util.Arrays;

// двухмерные массивы - сортировка, gnomes
public class gnome_sort {
    public static int a[] = {5,3,2,5,2,8,4,2,1,9};
    public static void main (String[] args){

        for (int i=1; i<a.length-1; i++)
            for (int j=i; j>0 && a[j-1]>a[j]; j--)
                swap (j-1, j);
        System.out.println(Arrays.toString(a));
    }
    public static void swap (int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j] = temp;
    }
}
