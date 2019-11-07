package OddNumberPack;

import java.util.*;

public class OddNumber {
    public static void main(String args[]){
        int[] Array = new int[20];
        Random random = new Random();
        ArrayList<Integer> Odd = new ArrayList<Integer>();
        for (int i=0; i <Array.length;i++){
            Array[i] = random.nextInt(100);
            //System.out.println(Array[i]);
            if(!dividesByTwo(Array[i])){
                Odd.add(Array[i]);
            }

        }
        System.out.print("Array:  ");
        System.out.println(Arrays.toString(Array));
        System.out.print("Max odd value:  ");
        System.out.println(Collections.max(Odd));

    }
    static boolean dividesByTwo(int a){
        return (a%2==0);
    }
}
