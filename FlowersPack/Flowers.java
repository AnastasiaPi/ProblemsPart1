package FlowersPack;

import java.util.Scanner;

public class Flowers {

    public static void main(String[] arg){
        String[] NameOfFlower = {"Orchid","Rose", "Carnation","Tulip","Daisy","Sunflower","Daffodil"};
        int[] PriceOfFlower = {20,12,11,10,9,7,4};
        int[] CountOfFlower = {2,3,9,6,10,2,7};
        int Cash = UserCash();
        String Buket ="";
        int Price = 0;
        int count = 0;
        //System.out.println(Cash);
        if (Cash>0){
            while (Price <= Cash) {
                int status = 0;
                for (int i = 0; i < NameOfFlower.length; i++) {
                    if (CountOfFlower[i] > 0) {
                        status = Price + PriceOfFlower[i];
                        //System.out.println(PriceOfFlower[i]);
                        if (status < Cash) {
                            Price = status;
                            Buket = Buket + NameOfFlower[i];
                            CountOfFlower[i] = CountOfFlower[i] - 1;
                            count++; }

                        if (status == Cash) {
                            count++;
                            Price =status;
                            System.out.println(Buket);
                            System.out.println(Price);
                            break;
                        }
                        else {
                            i++;
                        }
                    }
                    else {
                        i++;
                    }
                }
            }
            System.out.println("Price");
            System.out.println(Price);
            System.out.println("Number of flowers");
            System.out.println(count);

        }
        else {
            System.out.println("It`s not possible! ");
        }

    }
    static int UserCash(){
        Scanner sc = new Scanner(System.in);
        int Cash = 0;
        try {
            Cash = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Wrong value");
        }
        return Cash;
    }
}
