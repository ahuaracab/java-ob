package com.ob.ejecicio4;

public class SmartDevice {
    private String name;
    private String brand;
    private double price;
    private boolean isConnected;

    public SmartDevice() {
    }

    public SmartDevice(String name, String brand, double price, boolean isConnected) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isConnected = isConnected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }
}

