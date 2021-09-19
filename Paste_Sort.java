package org.itstep;

import java.util.Arrays;

// двухмерные массивы - сортировка, вставка - Insertion sort
public class Paste_Sort {
    public static int a[] = {5,3,2,5,2,8,4,2,1,9};
    public static void main (String[] args){

        for (int i=1; i<a.length; i++) {
            int spec = a[i];
            int j;
            for (j = i; j > 0 && spec < a[j - 1]; j--)
                a[j] = a[j - 1];
            a[j] = spec;
        }
        System.out.println(Arrays.toString(a));
    }
}
