public class SmartDevice {
    // PROTECTED ACCESS MODIFIER: Visible to subclasses, even in other packages
    protected String deviceId;
    protected boolean isOnline;

    // CONSTRUCTOR using 'this' Keyword
    public SmartDevice(String deviceId) {
        this.deviceId = deviceId;
        this.isOnline = true;
    }

    // IMPLICIT SUPER() RULES:
    // Java automatically calls the empty constructor of a parent class if super()
    // is not explicitly called in the child. We define it here to show when it runs.
    public SmartDevice() {
        System.out.println("[Core] Implicit super() called: Generic device created.");
    }

    // Method to be overridden by subclasses
    public void runDiagnostics() {
        System.out.println("Running generic diagnostics for device: " + deviceId);
    }

    // THE FINAL METHOD: Subclasses cannot override this security-critical method
    public final void displayMacAddress() {
        System.out.println("MAC Address: 00:1B:44:11:3A:B7 (Encrypted)");
    }

    // METHOD HIDING (Static methods): Belongs to the class, not the instance.
    public static void getNetworkProtocol() {
        System.out.println("Protocol: Standard TCP/IP (Parent Class)");
    }
}