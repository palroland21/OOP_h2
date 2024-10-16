/*
Scrieți un program în care fiind dată o variabilă care stochează o referință către un String,
determină:
a) numărul de consoane și vocale
b) indicii pentru o vocală introdusă din linia de comandă
*/

import java.util.Scanner;

public class Vocale{

    String string_meu;
    public Vocale(String string_nou){
        string_meu = string_nou;
    }

    public int getNumberOfVocales(){
        String vocale = "aeiouAEIOU";
        int cnt = 0;
        for(int i =0; i< string_meu.length(); i++){
            char c = string_meu.charAt(i);
            if(vocale.indexOf(c) != -1){
                cnt++;
            }
        }
        return cnt;
    }

    public int getNumberOfConsoanes(){
        int cnt = 0;
        String vocale = "aeiouAEIOU ";

        for(int i=0; i< string_meu.length(); i++){
            char c = string_meu.charAt(i);
            if(vocale.indexOf(c) == -1){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] argv){
        // a)
        Scanner input = new Scanner(System.in);
        System.out.print("Stringul 1: ");
        String string_citit = input.nextLine();
        Vocale voc = new Vocale(string_citit);
        System.out.println("Stringul contine " + voc.getNumberOfVocales() + " vocale!");
        System.out.println("Stringul contine " + voc.getNumberOfConsoanes() + " consoane!");


        // b)
        System.out.print("Stringul 2: ");
        String text_citit = input.nextLine();
        String vocale = "aeiouAEIOU";

        for(int i=0; i < text_citit.length(); i++){
            char c = text_citit.charAt(i);
            if( vocale.indexOf(c) != -1) {
                System.out.print( i + " ");
            }
        }
      input.close();
    }
}