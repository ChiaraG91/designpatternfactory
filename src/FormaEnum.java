public enum FormaEnum {

    RETTANGOLO("rettangolo"),
    QUADRATO("quadrato"),
    TRIANGOLO("triangolo");

    private String forma;

    FormaEnum(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}
