public class Forma implements Shape {

    private String nomeForma;

    public Forma(String nomeForma) {
        this.nomeForma = nomeForma;
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public void setNomeForma(String nomeForma) {
        this.nomeForma = nomeForma;
    }

    public void drawShape(){
    }

    @Override
    public String toString() {
        return "Forma{" + nomeForma + '\'' +
                '}';
    }
}
