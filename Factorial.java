/*
Implementați o aplicație pentru orice loterie în care să:
a) calculați şansele de câştig la loterie (ex. 6 din 49)
b) simulați extragerea numerelor la loterie (pentru generarea numerelor aleatoare folosiţi
Math.random)
c) afişaţi în ordine crescătoare/descrescătoare numerele extrase la loterie fără a face sortări
sau a folosi tablouri. (Sugestie: folosiţi împachetarea/despachetarea/extragerea de biţi stocaţi
într-un long)
 */

import java.util.Scanner;

public class Factorial {

    public static long calculareFactorial(int n){
        long rez = 1;
        for(int i=1; i<n; i++){
            rez = rez*i;
        }
        return rez;
    }

    public static long combinari(int n, int k){
        long rez = 1;
        for(int i=1; i<=k; i++) {
            rez = rez * (n - i + 1);
            rez = rez / i;
        }
        return rez;
    }

    public static void sortareSir(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    // De exemplu daca am: 4 2  =>
                    // arr[j] = 4  ^ 2 = 0100 ^ 0010 = 0110 = 6
                    // arr[j+1] = 6 ^ 2 = 0110 ^ 0010 = 0100 = 4
                    // arr[j] = 6 ^ 4 = 0110 ^ 0100 = 0010 = 2
                    arr[j] = arr[j] ^ arr[j + 1]; //impachetam
                    arr[j + 1] = arr[j] ^ arr[j + 1]; //despachetam pt arr[j+1]
                    arr[j] = arr[j] ^ arr[j + 1]; //despachetam pt arr[j]
                }
            }
        }
    }

    public static void main(String[] argv) {
        // a)
        Scanner input =  new Scanner(System.in);
        System.out.print("Introduceti k si n: ");
        int k = input.nextInt();
        int n = input.nextInt();
        System.out.println("Sansele de a castiga la loto cu combinatia k din n este: " + combinari(n,k));

        //b)

        int nr = 6;
        int[] randomArray = new int[nr];
        System.out.print("Numerele extrase au fost: ");
        for(int i=0; i<nr; i++){
            randomArray[i] = (int) (Math.random() * 100);
            System.out.print(randomArray[i] + " ");
        }

        //c)
        sortareSir(randomArray);
        System.out.println("");
        System.out.print("Numerele extrase sortate sunt: ");
        for(int i=0; i< randomArray.length; i++){
            System.out.print(randomArray[i] + " ");
        }

    }
}