package PositiveNumberPack;
import java.util.Arrays;
import java.util.Random;

public class PositivNumber {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][4];
        System.out.println(Arrays.deepToString(inicialization(twoDimArray)));
        int[][] DimArray =new int[3][];
        float [] ArrayAverege= new float[3];
        float MaxValue = 0;
        int NumMaxValue = 0;
        for (int i =0;i<(twoDimArray.length);i++) {
            int[] DopArray;
            int num = 0;
            float SumValue =0;
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j]>0){
                    num++;
                    }
                }
            DopArray= new int[num];
            int k = 0;
            for (int c = 0; c < twoDimArray[i].length; c++) {
                for (int v = k; v < DopArray.length;v++){
                    if (twoDimArray[i][c]>0){
                        DopArray[v] = twoDimArray[i][c];
                        SumValue+=twoDimArray[i][c];
                        k++;
                        c++;

                    }
                }
            }
            DimArray[i] = DopArray;
            float Averege;
            if(num == 0){
                Averege = 0;
            }
            else {
                Averege= SumValue/num;
            }
            ArrayAverege[i] = Averege;
        }
        System.out.println(Arrays.deepToString(DimArray));

        for (int i = 0; i<ArrayAverege.length;i++){
            if (MaxValue< ArrayAverege[i]){
                MaxValue = ArrayAverege[i];
                NumMaxValue = i+1;
            }
        }
        System.out.print("Number of string with max average value:   ");
        System.out.println(NumMaxValue);
        System.out.print("Value:  ");
        System.out.println(MaxValue);
        }




    static int[][] inicialization(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt((20 - (-20)) + 1) + (-20);
            }
        }
        return array;
        }
    }

