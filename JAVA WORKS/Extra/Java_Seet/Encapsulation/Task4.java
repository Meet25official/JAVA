// Scenario 4: Smart Home Automation System
// In a smart home automation system, encapsulate the internal workings of devices like "Thermostat" and "LightingController" to provide a simplified interface for controlling and monitoring these devices while hiding complex implementation details.

class Thermostat {
    private double currentTemperature;
    private double targetTemperature;

    public Thermostat(double initialTemperature) {
        this.currentTemperature = initialTemperature;
        this.targetTemperature = initialTemperature;
    }

    private void adjustSystem() {
        if (currentTemperature < targetTemperature) {
            System.out.println("Heating to " + targetTemperature + " degrees.");
        } else if (currentTemperature > targetTemperature) {
            System.out.println("Cooling to " + targetTemperature + " degrees.");
        } else {
            System.out.println("Temperature is optimal.");
        }
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
        adjustSystem();
    }

    public void updateCurrentTemperature(double newTemperature) {
        this.currentTemperature = newTemperature;
        adjustSystem();
    }
}

class LightingController {
    private boolean lightsOn;
    private int brightnessLevel;

    public LightingController() {
        this.lightsOn = false;
        this.brightnessLevel = 0;
    }

    private void updateLightingSystem() {
        if (lightsOn) {
            System.out.println("Lights are on at " + brightnessLevel + "% brightness.");
        } else {
            System.out.println("Lights are off.");
        }
    }

    public void turnLightsOn() {
        this.lightsOn = true;
        updateLightingSystem();
    }

    public void turnLightsOff() {
        this.lightsOn = false;
        updateLightingSystem();
    }

    public void setBrightnessLevel(int brightnessLevel) {
        if (brightnessLevel >= 0 && brightnessLevel <= 100) {
            this.brightnessLevel = brightnessLevel;
            if (lightsOn) {
                updateLightingSystem();
            }
        } else {
            System.out.println("Invalid brightness level. Please set a value between 0 and 100.");
        }
    }

    public int getBrightnessLevel() {
        return brightnessLevel;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(22.0);
        thermostat.setTargetTemperature(24.0);
        thermostat.updateCurrentTemperature(23.0);
        System.out.println("Current Temperature: " + thermostat.getCurrentTemperature());

        LightingController lightingController = new LightingController();
        lightingController.turnLightsOn();
        lightingController.setBrightnessLevel(75);
        System.out.println("Current Brightness Level: " + lightingController.getBrightnessLevel());
        lightingController.turnLightsOff();
    }
}
