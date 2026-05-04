

// THE FINAL CLASS: This class is locked. No other class can "extend SecurityModule".
public final class SecurityModule {
    private boolean isArmed = true;

    public void checkStatus() {
        System.out.println("Security Module Armed: " + isArmed);
    }
}