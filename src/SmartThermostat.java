
// HIERARCHICAL INHERITANCE: Both SmartLight and SmartThermostat extend SmartDevice
public class SmartThermostat extends SmartDevice {
    private double targetTemperature;

    // Implicit super() rule demonstrated here.
    // Notice there is no super(deviceId) call. Java will automatically call the
    // empty SmartDevice() constructor behind the scenes!
    public SmartThermostat(double targetTemperature) {
        this.targetTemperature = targetTemperature;
        // Setting the inherited protected field directly
        this.deviceId = "THERM-DEFAULT";
    }

    @Override
    public void runDiagnostics() {
        System.out.println("Thermostat Diagnostics: Target temp is " + targetTemperature + "F");
    }
}