package week06_day2_SubmissionOfFunctionalInterfaces;

interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC is ON"); }
    public void turnOff() { System.out.println("AC is OFF"); }
}

class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV is ON"); }
    public void turnOff() { System.out.println("TV is OFF"); }
}

public class SmartDeviceControlInterface {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();
        light.turnOn(); light.turnOff();
        ac.turnOn(); ac.turnOff();
        tv.turnOn(); tv.turnOff();
    }
}
