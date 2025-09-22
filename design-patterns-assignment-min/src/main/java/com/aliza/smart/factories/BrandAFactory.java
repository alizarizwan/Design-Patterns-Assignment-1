package com.aliza.smart.factories;

import com.aliza.smart.api.*;
import com.aliza.smart.devices.*;

public class BrandAFactory implements SmartDeviceFactory {
    @Override public Bulb createBulb() { return new BrandABulb(); }
    @Override public Lock createLock() { return new BrandALock(); }
}
