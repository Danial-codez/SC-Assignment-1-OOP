/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task4;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {

        Book book = new Book(
                "Java Basics",
                "John Doe",
                "ISBN001"
        );

        book.displayInfo();

        book.setAvailable(false);

        System.out.println("\nAfter borrowing:");
        book.displayInfo();
    }
}