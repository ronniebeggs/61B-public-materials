package solution;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class BankTest {
    @Test
    public void testDeposit() {
        Bank bank = new Bank(200);
        bank.deposit(100);
        assertThat(bank.getReserves()).isEqualTo(300);
    }

    @Test
    public void testWithdrawal() {
        Bank bank = new Bank(200);
        bank.withdrawal(100);
        assertThat(bank.getReserves()).isEqualTo(100);
    }

    @Test
    public void testLargestTransaction() {
        Bank bank = new Bank(200);
        bank.deposit(100);
        bank.deposit(200);
        bank.withdrawal(50);
        assertThat(bank.getLargestTransaction()).isEqualTo(200);
    }
}