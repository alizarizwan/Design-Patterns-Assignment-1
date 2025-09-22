package com.aliza.smart.devices;

import com.aliza.smart.api.Bulb;
import com.aliza.smart.usage.FileUsageLoader;
import com.aliza.smart.usage.UsageLoader;

public class BrandABulb extends AbstractSmartDevice implements Bulb {
    @Override public String brand() { return "Brand A"; }
    @Override public String name()  { return "LED Bulb"; }
    @Override protected UsageLoader createUsageLoader() {
        return new FileUsageLoader("usage/brandA/bulb.txt");
    }
}
