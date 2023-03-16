package com.ob.ejecicio4;

public class SmartWatch extends SmartDevice {
    private boolean hasTouchscreen;
    private String operatingSystem;

    public SmartWatch() {
    }

    public SmartWatch(String name, String brand, double price, boolean isConnected, boolean hasTouchscreen, String operatingSystem) {
        super(name, brand, price, isConnected);
        this.hasTouchscreen = hasTouchscreen;
        this.operatingSystem = operatingSystem;
    }

    public boolean isHasTouchscreen() {
        return hasTouchscreen;
    }

    public void setHasTouchscreen(boolean hasTouchscreen) {
        this.hasTouchscreen = hasTouchscreen;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
