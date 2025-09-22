package com.aliza.smart.usage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/** A small file-backed loader (reads a single double value from a classpath text file). */
public class FileUsageLoader implements UsageLoader {
    private final String resourcePath;

    public FileUsageLoader(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    @Override
    public double load() {
        InputStream in = getClass().getClassLoader().getResourceAsStream(resourcePath);
        if (in == null) {
            throw new IllegalStateException("Resource not found: " + resourcePath);
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line = br.readLine();
            if (line == null) {
                throw new IllegalStateException("Empty usage file: " + resourcePath);
            }
            return Double.parseDouble(line.trim());
        } catch (IOException ex) {
            throw new RuntimeException("Failed to read " + resourcePath, ex);
        }
    }
}
