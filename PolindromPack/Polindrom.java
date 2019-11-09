package PolindromPack;

public class Polindrom {
    static char Zero = '0';
    static char One = '1';
    static int Count = 1;
    static int HALF_NUM = (int) Math.pow(2, 15);
    public static void main(String[] args) {
        findNegPolindrom();
        System.out.println(One);
        findPosPolindrom();
        System.out.println(Count);
    }
    private static void findPosPolindrom() {
        String Half;
        for (int musk = 1; musk < HALF_NUM; musk += 2) {
            Half = Integer.toBinaryString(musk);
            String reversedStr = new StringBuilder(Half).reverse().toString();
            System.out.println(Integer.parseInt(reversedStr + Half, 2));
            System.out.println(Integer.parseInt(reversedStr + Zero + Half, 2));
            System.out.println(Integer.parseInt(reversedStr + One + Half, 2));
            Count = Count + 3;
        }
    }
    private static void findNegPolindrom() {
        char[] negArray = new char[16];
        negArray[0] = One;
        for (int j = 1; j < 16; j++) {
            negArray[j] = Zero;
        }
        String NegativeNumber;
        String half;
        int k = 15;
        for (int i = 32767; i > 0; i--) {
            if (negArray[k] != One) {
                negArray[k] = One;
            }
            else {
                k = 15;
                while (true) {
                    if (negArray[k] == One) {
                        negArray[k] = Zero;
                        k--;
                        continue;
                    } else {
                        negArray[k] = One;
                        break;
                    }
                }
            }

            half = new String(negArray);
            NegativeNumber = half + new StringBuilder(half).reverse().toString();
            showInt(NegativeNumber);
        }
    }

    public static void showInt(String Neg) {
        char[] charArr = Neg.toCharArray();

        for (int i = 0; i < 32; i++) {
            if (charArr[i] == One) {
                charArr[i] = Zero;
            } else {
                charArr[i] = One;
            }
        }

        int k = 31;
        while (true) {
            if (charArr[k] == One) {
                charArr[k] = Zero;
                k--;
                continue;
            } else {
                charArr[k] = One;
                break;
            }
        }

        String string = new String(charArr);
        Integer.parseInt(string, 2);
        System.out.println(-Integer.parseInt(string, 2));
        Count++;

    }




}
