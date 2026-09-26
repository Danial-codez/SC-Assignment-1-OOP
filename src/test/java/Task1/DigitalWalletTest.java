/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class DigitalWalletTest {

    public static void main(String[] args) {

        DigitalWallet wallet =
                new DigitalWallet("Danial", 5000, "1234");

        System.out.println("Account Holder: "
                + wallet.getAccountHolder());

        System.out.println("Initial Balance: "
                + wallet.getBalance());

        // Correct PIN and sufficient funds
        boolean result1 = wallet.withdraw(1000, "1234");
        System.out.println("Withdrawal 1 successful: " + result1);
        System.out.println("Balance after withdrawal: "
                + wallet.getBalance());

        // Incorrect PIN
        boolean result2 = wallet.withdraw(500, "9999");
        System.out.println("Withdrawal 2 successful: " + result2);
        System.out.println("Balance after wrong PIN: "
                + wallet.getBalance());

        // Insufficient funds
        boolean result3 = wallet.withdraw(5000, "1234");
        System.out.println("Withdrawal 3 successful: " + result3);
        System.out.println("Balance after insufficient funds: "
                + wallet.getBalance());

        // Invalid withdrawal amount
        boolean result4 = wallet.withdraw(-100, "1234");
        System.out.println("Withdrawal 4 successful: " + result4);
        System.out.println("Final Balance: "
                + wallet.getBalance());
    }
}