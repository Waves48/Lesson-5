package org.itstep;

import java.util.Arrays;

// двухмерные массивы
public class Two_dimensions {
    private static int num_rows = 5; // private, public, protected, default(not spelled)
    private static int num_cols = 5; //
    private static int[][] arr = new int[num_rows][num_cols];

    public static void main(String[] args) {
    //    fillorder();
    //    Arr2StringAligned();
        fillorderud();
        for (int i = 0; i < num_rows; i++)
            for (int j = 0; j < num_cols; j++)
                arr[i][j] = i * num_cols + j + 1;
    }

    public static void fillorder() {
        StringBuilder result = new StringBuilder();
        String separator = ",";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result.append(arr[i][j]);
                if (j != arr[i].length - 1)
                    result.append(separator);

            }
            result.append("\n");
        }
    }

    public static String Arr2StringAligned() {
        StringBuilder result = new StringBuilder();
        String Pad = "     ";
        for (int i = 0; i < num_rows; i++) {
            for (int j = 0; j < num_cols; j++) {
                String sNumber = Integer.toString(arr[i][j]);
                String sPadded = Pad.substring(sNumber.length()) + sNumber;
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPadded);
            }
            result.append("\n");
        }
        return result.toString();
    }
    public static void fillorderud() {
        for (int i = 0; i < num_rows; i++)
            for (int j = 0; j < num_cols; j++) {
                arr [i][j] = i * num_rows +i +1;

            }
        System.out.println(Arrays.toString(arr));
        }
        // четная / нечетная if (i%2 == 0)
    // for (j<0, j<num_rows, j++)
    // else if ()
    }