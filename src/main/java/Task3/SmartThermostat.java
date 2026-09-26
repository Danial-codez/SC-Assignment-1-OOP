/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task3;

/**
 *
 * @author DELL
 */
public class SmartThermostat implements SmartDevice {

    private boolean isOn;
    private double temperature;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return isOn ? "Thermostat is ON" : "Thermostat is OFF";
    }

    public void setTemperature(double temp) {
        temperature = temp;
    }

    public double getTemperature() {
        return temperature;
    }
}