/*
    
*/ 

public class App {

    public static void main(String[] args) {

        SoftwareRegistration sr = new SoftwareRegistration(2023);

        sr.setExpirationYear(2050);
        System.out.println(sr.getExpirationYear());

    }
} 