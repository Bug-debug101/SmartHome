

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INITIALIZATION & INHERITANCE ===");

        // Single & Multilevel Initialization
        SmartLight livingRoomLight = new SmartLight("LGT-01", 80);
        ColorSmartLight bedroomLight = new ColorSmartLight("LGT-02", 50, "Blue");

        // Hierarchical & Implicit super() Initialization
        SmartThermostat hallwayThermostat = new SmartThermostat(72.5);

        System.out.println("\n=== METHOD OVERRIDING & SUPER KEYWORD ===");
        livingRoomLight.runDiagnostics();
        System.out.println("---");
        hallwayThermostat.runDiagnostics();

        System.out.println("\n=== PROTECTED FIELDS & MULTILEVEL ===");
        bedroomLight.showColor();

        System.out.println("\n=== FINAL CLASS & METHOD ===");
        livingRoomLight.displayMacAddress(); // Inherited final method
        SecurityModule alarm = new SecurityModule(); // Final class instantiation
        alarm.checkStatus();

        System.out.println("\n=== METHOD HIDING (STATIC) ===");
        // Method hiding depends on the *Reference Type*, not the Object Type!
        SmartDevice.getNetworkProtocol(); // Calls Core
        SmartLight.getNetworkProtocol();  // Calls Devices

        /*
         * === MULTIPLE INHERITANCE RESTRICTION ===
         * Java explicitly prevents a class from extending more than one parent.
         * For example, we CANNOT write:
         * public class SmartFan extends SmartLight, SmartThermostat { ... }
         *
         * This prevents the "Diamond Problem," where the compiler wouldn't know
         * which parent's runDiagnostics() method to inherit. Interfaces are used
         * to bypass this limitation when needed.
         */
    }
}