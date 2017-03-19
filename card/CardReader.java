package test.myapplicationtest.card;

/**
 * Created by ruma on 3/10/17.
 */

public class CardReader {

    public static void main(String[] args) {
        CardReader cardReader = new CardReader();
        cardReader.readCard(new CardA(1010));
        cardReader.readCard(new CardB(1111));
        int[] myArray = {1010, 1111};
        int[] myArray2 = new int[1010];
    }

    void readCard(Card card) {
        //TODO: read id number, print number
        System.out.println(card.idNumber);
        //TODO: print card type
        System.out.println(card.cardType);
        System.out.println();
    }


}

// create array
// for loop, read card 1-1