// VISIBILITY & PACKAGES: Importing the base class from a different package


// SINGLE INHERITANCE / SUBCLASS (DERIVED)
public class SmartLight extends SmartDevice {
    private int brightness;

    public SmartLight(String deviceId, int brightness) {
        // SUPER() CONSTRUCTOR CALL: Must be the very first line
        super(deviceId);
        this.brightness = brightness;
    }

    // METHOD OVERRIDING
    @Override
    public void runDiagnostics() {
        // THE SUPER KEYWORD (Method): Calling the parent's version of this method first
        super.runDiagnostics();
        System.out.println("-> Light Diagnostics: Brightness is at " + brightness + "%");
    }

    // METHOD HIDING: This hides the parent's static method, it does NOT override it.
    public static void getNetworkProtocol() {
        System.out.println("Protocol: Zigbee Light Link (Child Class)");
    }
}