/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task3;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {

        SmartBulb bulb = new SmartBulb();

        bulb.turnOn();
        bulb.setBrightness(80);

        System.out.println(bulb.getStatus());
        System.out.println("Brightness: " + bulb.getBrightness());

        bulb.turnOff();
        System.out.println(bulb.getStatus());


        SmartThermostat thermostat = new SmartThermostat();

        thermostat.turnOn();
        thermostat.setTemperature(24.5);

        System.out.println(thermostat.getStatus());
        System.out.println("Temperature: "
                + thermostat.getTemperature());

        thermostat.turnOff();
        System.out.println(thermostat.getStatus());
    }
}
