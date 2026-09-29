/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
            new Developer("Ali", 80000, 15000),
            new SalesManager("Ahmed", 70000, 200000, 0.05)
        };

        for (Employee employee : employees) {
            System.out.println(
                    employee.name + " - Final Pay: "
                    + employee.calculatePay()
            );
        }
    }
}
