package com.vladproduction.switch_matching_pattern;

public class Main_switch {
    public static void main(String[] args) {

        var cloudStorage = new CloudStorage();
        var sftpStorage = new SftpStorage();

        uploadFiles(cloudStorage);
        uploadFiles(sftpStorage);

    }

    private static void uploadFiles(Storage storage) {
        switch (storage) {
            case CloudStorage cloudStorage -> {
                System.out.println("Upload from Cloud storage");
                cloudStorage.save();
            }
            case SftpStorage sftpStorage -> {
                System.out.println("Upload from SFTP storage");
                sftpStorage.save();
            }
            default -> throw new IllegalArgumentException("Storage type not supported.");
        }
    }


}
