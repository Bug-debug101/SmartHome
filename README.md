📌 Overview

This project demonstrates core Object-Oriented Programming (OOP) concepts in Java by modeling a Smart Home ecosystem, focusing on inheritance, access control, method behavior, and class relationships.

✅ Concepts Covered

1. extends Keyword
Used in SmartLight, SmartThermostat, and ColorSmartLight to inherit from SmartDevice.

2. Superclass vs Subclass

Superclass: SmartDevice

Subclasses: SmartLight, SmartThermostat, ColorSmartLight

3. Single Inheritance
SmartLight extends SmartDevice

4. Multilevel Inheritance
ColorSmartLight → SmartLight → SmartDevice

5. Hierarchical Inheritance
SmartLight and SmartThermostat both extend SmartDevice

6. Multiple Inheritance Restriction
Java does NOT allow:

Java
class A extends SmartLight {}
class B extends SmartThermostat {}
class SmartFan extends A, B {} // ❌ Not allowed
7. Protected Access Modifier
Used in SmartDevice fields (deviceId, isOnline) → accessible in subclasses, even across different packages.

8. Visibility & Packages

com.smarthome.core → superclass (SmartDevice)

com.smarthome.devices → subclasses, SecurityModule (final class), and execution (Main)

9. Method Overriding
runDiagnostics() method overridden in SmartLight and SmartThermostat

10. this Keyword
Used in constructors to refer to the current object (e.g., this.deviceId = deviceId;)

11. super Keyword

Access parent constructor → super(deviceId)

Call parent methods → super.runDiagnostics()

12. super() Constructor Calls
Explicitly used as the first statement in the SmartLight and ColorSmartLight constructors.

13. final Class
SecurityModule cannot be extended.

14. final Method
displayMacAddress() in SmartDevice cannot be overridden by subclasses.

15. Method Hiding (Static Methods)
getNetworkProtocol() in SmartLight hides SmartDevice.getNetworkProtocol()

16. Implicit super() Rules
If no explicit constructor call is defined (as seen in SmartThermostat), Java automatically inserts an invisible super() call to initialize the base class.

▶️ How to Run

Compile:

Bash
javac -d out src/**/*.java
Run:

Bash
java -cp out com.smarthome.devices.Main
🎯 Conclusion

This project demonstrates how Java enforces OOP principles such as inheritance, encapsulation, and method behavior. It provides a clear understanding of class relationships and restrictions in Java.
