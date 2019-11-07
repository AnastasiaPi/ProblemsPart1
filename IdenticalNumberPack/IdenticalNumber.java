package IdenticalNumberPack;

import java.util.*;

public class IdenticalNumber {
    public static void main(String args[]) {
        int[] ArrayOne = new int[20];
        int[] ArrayTwo = new int[35];
        HashSet<Integer> Identical;
        Identical = inicialization(ArrayTwo, ArrayOne);
        System.out.println(Arrays.toString(ArrayOne));
        System.out.println(Arrays.toString(ArrayTwo));
        System.out.println(Identical);

    }

    static HashSet<Integer> inicialization(int[] array, int[] array2) {
        HashSet<Integer> Identical = new HashSet<Integer>();
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            }
        for (int j =0;j<array2.length;j++){
            array2[j] = random.nextInt(100);
            int tryKey = Arrays.binarySearch(array, array2[j]);
            if (tryKey > 0) {
                Identical.add(array2[j]);
            }
        }
        return Identical;
        }




}
