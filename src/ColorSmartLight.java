
public class ColorSmartLight extends SmartLight {
    private String color;

    public ColorSmartLight(String deviceId, int brightness, String color) {
        super(deviceId, brightness);
        this.color = color;
    }

    public void showColor() {
        // Accessing the 'protected' deviceId inherited from the grandparent class
        System.out.println("Device " + deviceId + " is currently glowing " + color + ".");
    }
}