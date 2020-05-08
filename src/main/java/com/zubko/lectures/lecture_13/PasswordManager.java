package com.zubko.lectures.lecture_13;


public class PasswordManager {
    public static void main(String[] args) {
        CredentialsDataMapper mapper = new CredentialsFileDataMapper();
        try {
            Credentials instagram = mapper.findCredentialsByService("instagram");
            System.out.println(instagram.getUsername());
            System.out.println(instagram.getPassword());
        } catch (CredentialsNotFoundException e) {
            System.out.println(e.getMessage());
        }

//        FileReader fr = new FileReader(new File("password-manager.txt"));
//        System.out.println((char)fr.read());// посимвольно считает


    }
}
