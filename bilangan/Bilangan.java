package test.myapplicationtest.bilangan;

public class Bilangan implements BilanganGanjil, BilanganGenap {
    int bil;
    int bilGanjil;
    int bilGenap;
    int bilKel4;
    int bilKel5;
    int bilPrima;

    public void hitGanjil() {
        for(bil=1; bil<100; bil++) {
            if((bil%2==1))
                System.out.println(bil);
        }
    }

    public void hitGenap() {
        for(bil=1; bil<100; bil++) {
            if((bil!=1)&&(bil%2==0))
                System.out.println(bil);
        }
    }

    public void hitKel4() {

    }

    public void hitKel5() {

    }

    public void hitPrima() {

    }

    public static void main(String []args) {
        for(int bil=1; bil<=10; bil++) {

        }
        Bilangan bilangan = new Bilangan();
        bilangan.printBilangan();
    }

    void printBilangan() {
        System.out.println("Bilangan 1-20");
        System.out.println("Bilangan ganjil     : " + bilGanjil);
        System.out.println("Bilangan genap      : " + bilGenap);
        System.out.println("Bilangan kelipatan 4: " + bilKel4);
        System.out.println("Bilangan kelipatan 5: " + bil);
        System.out.println("Bilangan prima      : " + bil);
    }
}
