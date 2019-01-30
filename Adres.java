public class Adres {

    private String adres;
    private NrTelefoniczny numer;

    public Adres() {
    }

    public Adres(String adres, NrTelefoniczny numer) {
        this.adres = adres;
        this.numer = numer;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public NrTelefoniczny getNumer() {
        return numer;
    }

    public void setNumer(NrTelefoniczny numer) {
        this.numer = numer;
    }

    public String toString(){
        return this.adres + " " + this.numer;
    }
}
