package com.vladproduction.switch_matching_pattern;

public class SftpStorage implements Storage {

    @Override
    public void save() {
        System.out.println("Saving to SFTP Storage");
    }
}
