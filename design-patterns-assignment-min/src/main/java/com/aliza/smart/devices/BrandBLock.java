package com.aliza.smart.devices;

import com.aliza.smart.api.Lock;
import com.aliza.smart.usage.FileUsageLoader;
import com.aliza.smart.usage.UsageLoader;

public class BrandBLock extends AbstractSmartDevice implements Lock {
    @Override public String brand() { return "Brand B"; }
    @Override public String name()  { return "Smart Lock"; }
    @Override protected UsageLoader createUsageLoader() {
        return new FileUsageLoader("usage/brandB/lock.txt");
    }
}
