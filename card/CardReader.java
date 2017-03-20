package test.myapplicationtest.card;

/**
 * Created by ruma on 3/10/17.
 */

public class CardReader {

    void readCard(Card card) {
        System.out.println(card.idNumber); // read idnumber, print idnumber
        System.out.println(card.cardType); // print cardtype
        System.out.println();
    }

    public static void main(String[] args) {
        CardReader cardReader = new CardReader();
        cardReader.readCard(new CardA(1000));
        cardReader.readCard(new CardB(1111));

        int myArray[] = {1000, 1111};
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println();

        for (int count=0; count<2; count++) {
            System.out.println(myArray[0]);
            System.out.println(myArray[1]);
        }

    }
}

// create array
// for loop, read card 1-1