package com.aliza.smart.devices;

import com.aliza.smart.usage.UsageLoader;

public abstract class AbstractSmartDevice {
    private double usageValue = Double.NaN;

    public final void loadUsage() {
        UsageLoader loader = createUsageLoader(); // Factory Method
        this.usageValue = loader.load();
    }

    protected abstract UsageLoader createUsageLoader();

    public abstract String brand();
    public abstract String name();

    public final double usage() {
        if (Double.isNaN(usageValue)) {
            throw new IllegalStateException("Usage not loaded. Call loadUsage() first.");
        }
        return usageValue;
    }
}

