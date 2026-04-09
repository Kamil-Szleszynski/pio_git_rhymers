package edu.kis.vh.nursery;

/**
 * Klasa reprezentuje strukturę danych FIFO (First In, First Out).
 * Pierwszy element dodany do wyliczanki jest pierwszym, który z niej wychodzi.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Metoda wyciąga element z struktury.
     * @return wartość pierwszego elementu lub wskaznik pustej struktury.
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }

}
