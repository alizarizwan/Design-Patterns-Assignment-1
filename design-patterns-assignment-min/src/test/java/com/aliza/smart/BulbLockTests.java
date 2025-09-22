package com.aliza.smart;

import com.aliza.smart.api.Bulb;
import com.aliza.smart.api.Lock;
import com.aliza.smart.api.SmartDeviceFactory;
import com.aliza.smart.factories.BrandAFactory;
import com.aliza.smart.factories.BrandBFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BulbLockTests {

    @Test
    void loadsUsageForBrandABulb() {
        SmartDeviceFactory f = new BrandAFactory();
        Bulb bulb = f.createBulb();
        bulb.loadUsage();
        assertEquals(9.5, bulb.usage(), 0.0001);
    }

    @Test
    void loadsUsageForBrandBLock() {
        SmartDeviceFactory f = new BrandBFactory();
        Lock lock = f.createLock();
        lock.loadUsage();
        assertEquals(0.20, lock.usage(), 0.0001);
    }

    @Test
    void factoriesCreateCorrectConcreteTypes() {
        SmartDeviceFactory fa = new BrandAFactory();
        SmartDeviceFactory fb = new BrandBFactory();
        assertNotNull(fa.createBulb());
        assertNotNull(fa.createLock());
        assertNotNull(fb.createBulb());
        assertNotNull(fb.createLock());
    }
}
