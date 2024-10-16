package com.vladproduction.switch_matching_pattern;

public class CloudStorage implements Storage{

    @Override
    public void save() {
        System.out.println("Saving to Cloud Storage");
    }
}
