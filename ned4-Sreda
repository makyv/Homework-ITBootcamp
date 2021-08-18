
package Karatisti;
import java.util.Arrays;
import java.util.Scanner;

public class Klub {

    private String ime;
    private int god;
    private String rang;
    private String[] kata;

    public Klub(String ime, int god, String rang, String[] kata) {
        this.ime = ime;
        this.god = god;
        this.rang = rang;
        this.kata = kata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String[] getKata() {
        return kata;
    }

    public void setKata(String[] kata) {
        this.kata = kata;
    }


    public void napad(int index){

        System.out.println("Karatista " + ime + " napada sa " + kata[index] + " katom.");

    }
    public void vatreniNapad(){
           double randI = Math.floor(Math.random() * kata.length - 1);
          String randKata = kata[(int) randI];
          System.out.println( "Karatista " + ime + " napada sa " + randKata + " katom.");
        }

        public void log(){
            System.out.println("Karatista: " + ime + " " + god + " " + rang + " zna naredne kate" + Arrays.toString(kata));
        }

    }
