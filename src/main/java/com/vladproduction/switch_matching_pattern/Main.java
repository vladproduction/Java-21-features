package com.vladproduction.switch_matching_pattern;

public class Main {
    public static void main(String[] args) {

        var cloudStorage = new CloudStorage();
        var sftpStorage = new SftpStorage();

        uploadFiles(cloudStorage);
        uploadFiles(sftpStorage);

    }

    private static void uploadFiles(Storage storage) {

        if(storage instanceof CloudStorage cloudStorage){
            System.out.println("Upload from Cloud storage");
            cloudStorage.save();
        }
        else if(storage instanceof SftpStorage sftpStorage){
            System.out.println("Upload from SFTP storage");
            sftpStorage.save();
        }
        else {
            throw new IllegalArgumentException("Storage type not supported.");
        }

    }
}
