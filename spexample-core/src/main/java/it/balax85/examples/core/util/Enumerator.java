package it.balax85.examples.core.util;

public enum Enumerator {

        READ(1, "Read");

        private int machineName;

        private String displayName;

    Enumerator(int machineName, String displayName) {
        this.machineName = machineName;
        this.displayName = displayName;
    }

    public int getMachineName() {
        return machineName;
    }

    public void setMachineName(int machineName) {
        this.machineName = machineName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public static Enumerator getByMachineName(int machineName) {
        for (Enumerator enumerator : Enumerator.values()) {
            if (enumerator.getMachineName() == machineName) {
                return enumerator;
            }
        }
        throw new RuntimeException("Enumerator not found for value = " + machineName);
    }
}
