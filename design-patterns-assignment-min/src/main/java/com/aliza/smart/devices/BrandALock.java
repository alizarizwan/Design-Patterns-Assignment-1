package com.aliza.smart.devices;

import com.aliza.smart.api.Lock;
import com.aliza.smart.usage.FileUsageLoader;
import com.aliza.smart.usage.UsageLoader;

public class BrandALock extends AbstractSmartDevice implements Lock {
    @Override public String brand() { return "Brand A"; }
    @Override public String name()  { return "Smart Lock"; }
    @Override protected UsageLoader createUsageLoader() {
        return new FileUsageLoader("usage/brandA/lock.txt");
    }
}
