package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Credit to Elana Ho for inspiration!
 */
public class Bank {

    private int reserves;
    private List<Integer> transactionRecord;

    public Bank(int initialReserves) {
        this.reserves = initialReserves;
        this.transactionRecord = new ArrayList<>();
    }

    public int getReserves() {
        return reserves;
    }

    /**
     * Adds `amount` number of dollars to the bank's reserves.
     * Adds deposit amount to the transaction record.
     * */
    public void deposit(int amount) {
        reserves += amount;
        transactionRecord.add(amount);
    }

    /**
     * Removes `amount` number of dollars from the bank's reserves.
     * Adds withdrawal amount to the transaction record
     *  */
    public void withdrawal(int amount) {
        reserves -= amount;
        transactionRecord.add(-amount);
    }

    /** Returns the largest (most positive) transaction in the bank's record. */
    public int getLargestTransaction() {
        int largestTransaction = transactionRecord.get(0);
        for (int i = 0; i < transactionRecord.size(); i++) {
            int currentTransaction = transactionRecord.get(i);
            if (currentTransaction > largestTransaction) {
                largestTransaction = currentTransaction;
            }
        }
        return largestTransaction;
    }
}