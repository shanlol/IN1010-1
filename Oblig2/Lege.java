public class Lege {
    
    protected String navn;

    public Lege(String navn) {
        this.navn = navn;
    }

    // overskrider toString metode
    @Override
    public String toString() {
        return "Legenavn: " + navn;
    }

}
