package com.aliza.smart.app;

import com.aliza.smart.api.*;
import com.aliza.smart.factories.*;

public class Main {
    public static void main(String[] args) {
        SmartDeviceFactory factoryA = new BrandAFactory();
        Bulb bulbA = factoryA.createBulb();
        bulbA.loadUsage();
        System.out.printf("Test 1: %s %s usage: %.2f W%n", bulbA.brand(), bulbA.name(), bulbA.usage());


        SmartDeviceFactory factoryB = new BrandBFactory();
        Lock lockB = factoryB.createLock();
        lockB.loadUsage();
        System.out.printf("Test 2: %s %s battery usage: %.2f %%/day%n", lockB.brand(), lockB.name(), lockB.usage());
    }
}
