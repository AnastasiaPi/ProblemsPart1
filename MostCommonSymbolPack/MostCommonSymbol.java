package MostCommonSymbolPack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MostCommonSymbol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String userString = sc.nextLine().toLowerCase();
        System.out.println(userString);
        int MaxNumberValue =0;
        Character MaxValue = null;
        Character[] MainCollection = toFind(userString);
        System.out.println(Arrays.toString(MainCollection));

        for (int j = 0;j< MainCollection.length;j++){
            int count = 0;
            for (int i = 0;i<userString.length();i++){
                if(MainCollection[j] == userString.charAt(i)){
                    count++;
                }
            }
            if (count > MaxNumberValue){
                MaxNumberValue = count;
                MaxValue = MainCollection[j];
            }

        }
        System.out.println(MaxNumberValue);
        System.out.print("character:   ");
        System.out.println(MaxValue);

    }
     static Character[] toFind(String user){
        HashSet<Character> Myfind= new HashSet<Character>();
        int Max = 0;
        Character Value;
        for (int i = 0;i<user.length();i++){
            Myfind.add(user.charAt(i));
        }
        Character[] Stroka = new Character[Myfind.size()];
        Myfind.toArray(Stroka);


        return Stroka;
    }




}

