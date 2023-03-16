package com.ob.ejecicio4;

public class SmartPhone extends SmartDevice {
    private String processor;
    private int storageCapacity;

    public SmartPhone() {
    }

    public SmartPhone(String name, String brand, double price, boolean isConnected, String processor, int storageCapacity) {
        super(name, brand, price, isConnected);
        this.processor = processor;
        this.storageCapacity = storageCapacity;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
