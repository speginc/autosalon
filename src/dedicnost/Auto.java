package dedicnost;
public class Auto {
private int pocetSedadel = 5;
private int pocetDveri = 5;
private int pocetNahradnichKol = 1;
int pocetKoni;
int cena;
String barva;

public Auto(int pocetKoni,int cena,String barva){
    this.barva = barva;
    this.cena  = cena;
    this.pocetKoni = pocetKoni;
}

    public void vypisInfo() {
        System.out.println("auto ma "+ pocetSedadel+" sedadel, "+
        pocetDveri+"dveří, "+pocetNahradnichKol+" nahradních kol "+
        pocetKoni+" pocet koní, barva je "+barva+", a celkova cena je"+cena);

    }

    public void jizdaStart(){
    System.out.println("auto zacalo svou jizdu");
    }

    public int getPocetKoni() {
        return pocetKoni;
    }

    public int getCena() {
        return cena;
    }

    public String getBarva() {
        return barva;
    }



}
