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
            toStrNum(Half);
        }
    }

    private static void findNegPolindrom() {
        char[] negativePolindromes = new char[16];
        negativePolindromes[0] = One;
        for (int j = 1; j < 16; j++) {
            negativePolindromes[j] = Zero;
        }
        String bitNegativeNumber;
        String half;
        int k = 15;
        for (int i = 32767; i > 0; i--) {
            if (negativePolindromes[k] != One) {
                negativePolindromes[k] = One;
            }
            else {
                k = 15;
                while (true) {
                    if (negativePolindromes[k] == One) {
                        negativePolindromes[k] = Zero;
                        k--;
                        continue;
                    } else {
                        negativePolindromes[k] = One;
                        break;
                    }
                }
            }

            half = new String(negativePolindromes);
            bitNegativeNumber = half + new StringBuilder(half).reverse().toString();
            showInt(bitNegativeNumber);
        }
    }

    public static void showInt(String bitNegativeNumber) {
        char[] charArr = bitNegativeNumber.toCharArray();

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

    public static void toStrNum(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println(Integer.parseInt(reversedStr + str, 2));
        System.out.println(Integer.parseInt(reversedStr + Zero + str, 2));
        System.out.println(Integer.parseInt(reversedStr + One + str, 2));
        Count = Count + 3;
    }


}
