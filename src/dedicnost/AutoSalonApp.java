package dedicnost;

import java.util.Scanner;

public class AutoSalonApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


    Ferrari ferrari = new Ferrari(88,60000,"red");
    Audi audi = new Audi(100,9000,"blue");
    Fabia fabia = new Fabia(55,35000,"white");

ferrari.vypisInfo();
fabia.vypisInfo();
audi.vypisInfo();












    }
}
