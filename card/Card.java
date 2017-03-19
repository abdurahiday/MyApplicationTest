package test.myapplicationtest.card;

/**
 * Created by ruma on 3/9/17.
 */

public class Card {

    int idNumber;
    String cardType;

    // Contructor, parameter
    public Card(int idNumber, String cardType) {
        this.idNumber = idNumber;
        this.cardType = cardType;
    }

    public void printInfo() {
        System.out.println("idNumber:" + idNumber);
        System.out.println("cardType:" + cardType);
    }
}
