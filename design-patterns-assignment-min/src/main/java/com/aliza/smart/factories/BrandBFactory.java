package com.aliza.smart.factories;

import com.aliza.smart.api.*;
import com.aliza.smart.devices.*;

public class BrandBFactory implements SmartDeviceFactory {
    @Override public Bulb createBulb() { return new BrandBBulb(); }
    @Override public Lock createLock() { return new BrandBLock(); }
}
