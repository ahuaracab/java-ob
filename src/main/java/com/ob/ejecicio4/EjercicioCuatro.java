package com.ob.ejecicio4;

public class EjercicioCuatro {
    public static void main(String[] args){
        SmartDevice smartDevice = new SmartDevice("SmartDevice 1", "Brand 1", 200.0, true);
        System.out.println("SmartDevice name: " + smartDevice.getName());
        System.out.println("SmartDevice brand: " + smartDevice.getBrand());
        System.out.println("SmartDevice price: " + smartDevice.getPrice());
        System.out.println("SmartDevice isConnected: " + smartDevice.isConnected());
        System.out.println();

        SmartWatch smartWatch = new SmartWatch("SmartWatch 1", "Brand 2", 300.0, false, true, "OS 1");
        System.out.println("SmartWatch name: " + smartWatch.getName());
        System.out.println("SmartWatch brand: " + smartWatch.getBrand());
        System.out.println("SmartWatch price: " + smartWatch.getPrice());
        System.out.println("SmartWatch isConnected: " + smartWatch.isConnected());
        System.out.println("SmartWatch hasTouchscreen: " + smartWatch.isHasTouchscreen());
        System.out.println("SmartWatch operatingSystem: " + smartWatch.getOperatingSystem());
        System.out.println();

        SmartPhone smartPhone = new SmartPhone("SmartPhone 1", "Brand 3", 400.0, true, "Processor 1", 64);
        System.out.println("SmartPhone name: " + smartPhone.getName());
        System.out.println("SmartPhone brand: " + smartPhone.getBrand());
        System.out.println("SmartPhone price: " + smartPhone.getPrice());
        System.out.println("SmartPhone isConnected: " + smartPhone.isConnected());
        System.out.println("SmartPhone processor: " + smartPhone.getProcessor());
        System.out.println("SmartPhone storageCapacity: " + smartPhone.getStorageCapacity());

    }
}
