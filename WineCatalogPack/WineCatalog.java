package WineCatalogPack;

import java.util.Scanner;

public class WineCatalog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int CurrentYear = 2019;
        int SizeArray =1;
        String[] Name = new String[SizeArray];
        String[] Country = new String[SizeArray];
        String[] Type = new String[SizeArray];
        int[] Year = new int[SizeArray];
        String Choise = text(sc);

        if (Choise.equals("f")) {
            System.out.println("Nothing to find");
        }
        while (true) {
            if (Choise.equals("n")) {
                NewWine(sc, Name, SizeArray, Country, Type, Year);
                SizeArray += 1;
                Choise = text(sc);
                continue;
            }
            else {
                System.out.println("Type name of wine");
                String MyWine = sc.nextLine().toUpperCase();
                for (int i = 0; i<SizeArray; i++){
                    if (Name[i].equals(MyWine)){
                        int Y = CurrentYear -Year[i];
                        System.out.print("Your wine is  ");
                        System.out.print(Y);
                        System.out.println(" Years old");
                        break;
                    }
                    else {
                        System.out.println("No wine was founded");
                        break;
                    }
                }
            }
        }
    }





    static String text(Scanner sc) {
        System.out.println("Hello you are in wine catalog!");
        System.out.println("If you want to add wine write 'N'  If you want to find wine write 'F'");
        String Choice;
        while (true) {
            Choice = sc.nextLine().toLowerCase();
            if (Choice.equals("n")) {
                System.out.println("New");
                break;
            }
            if (Choice.equals("f")) {
                System.out.println("Find");
                break;
            } else {
                System.out.println("Try again");
                continue;
            }
        }

        return Choice ;
    }
    static String GetString(Scanner sc){
        String MyString;
        String Result;
        while (true){
            MyString =sc.nextLine().toUpperCase();
            Result = MyString.replaceAll("\\s|\\d|\\W", "");
            if(MyString.length()>2){
                System.out.print("Your answer: ");
                System.out.println(Result);
                break;
            }
            else {
                System.out.print("Not correct try again: ");
            }

        }
        return Result;
    }
    static int GetInt(Scanner sc){
        int MyInt;
        while (true){
            MyInt =sc.nextInt();
            if(MyInt >0 && 2020 > MyInt){
                System.out.print("Your answer: ");
                System.out.println(MyInt);
                break;
            }
            else {
                System.out.print("Not correct try again: ");
            }

        }
        return MyInt;
    }

    public static void NewWine(Scanner sc, String[] Name, int SizeArray, String[] Country, String[] Type, int[] Year){
        for (int i =SizeArray-1;i < SizeArray;i++){
            System.out.println("Write name of wine");
            Name[i] = GetString(sc);
            System.out.println("Write country");
            Country[i] = GetString(sc);
            System.out.println("Write type");
            Type[i] = GetString(sc);
            System.out.println("Write year");
            try {
                Year[i] = GetInt(sc);
            }
            catch (Exception e){
                System.out.println("Wrong year");
                i--;
            }

        }


    }


}
