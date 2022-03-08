public class SoftwareRegistration{

    public SoftwareRegistration(int expiration) {

        this.mExpirationYear = expiration;
        System.out.println("Enregistrement du produit, valide jusqu'en " + this.mExpirationYear);

    }

    public int getExpirationYear() {

        return this.mExpirationYear;
    }

    public void setExpirationYear(int expiration){

        return;
    }


    private int mExpirationYear;
    
}