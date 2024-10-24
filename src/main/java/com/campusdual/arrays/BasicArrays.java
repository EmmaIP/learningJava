package com.campusdual.arrays;

public class BasicArrays {
    public static void main(String[] args) {
        int[] firstIntArray = new int[3];
        firstIntArray[0] = 15;
        firstIntArray[1] = 17;
        firstIntArray[2] = 19;

        String[] firstStringArray = {"a", "b", "c", "d"};


        System.out.println("First int array length: " + firstIntArray.length);
        System.out.println("First String array length: " + firstStringArray.length);

        System.out.println("First int array position value: " + firstIntArray[0]);
        System.out.println("First String array position value: " + firstStringArray[0]);

        System.out.println("Last int array position value: " + firstIntArray[firstIntArray.length - 1]);
        System.out.println("Last String array position value: " + firstStringArray[firstStringArray.length - 1]);

        System.out.println("Loop through first int array");
        for (int i = 0; i < firstIntArray.length; i++) {
            System.out.print(firstIntArray[i] + " ");
        }
        System.out.println();

        System.out.println("Loop through first String array");
        for (int i = 0; i < firstStringArray.length; i++) {
            System.out.print(firstStringArray[i] + " ");
        }
        System.out.println("\n");

        int maxi = 3;
        int maxj = 3;
        int[][] secondIntArray = new int[maxi][maxj];

        /*secondIntArray[0][0] = 1;
        secondIntArray[0][1] = 2;
        secondIntArray[0][2] = 3;
        secondIntArray[1][0] = 4;
        secondIntArray[1][1] = 5;
        secondIntArray[1][2] = 6;
        secondIntArray[2][0] = 7;
        secondIntArray[2][1] = 8;
        secondIntArray[2][2] = 9;*/

        int value = 0;
        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {
                value++;
                secondIntArray[i][j] = value;
            }
        }

        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {
                System.out.print(secondIntArray[i][j] + " ");
            }
            System.out.println();
        }

        String[][] secondStringArray = {{"a", "b", "c", "d"}, {"a", "b", "c", "d"}, {"a", "b", "c", "d"}, {"a", "b", "c", "d"}};

        for (int i = 0; i < secondStringArray.length; i++) {
            for (int j = 0; j < secondStringArray[i].length; j++) {
                System.out.print(secondStringArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
