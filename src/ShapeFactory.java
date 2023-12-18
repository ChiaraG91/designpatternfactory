public class ShapeFactory {

    public static Forma getForma(String nome){
        Forma forma = null;
        if(nome.equals("quadrato")){
            forma = new Quadrato(nome);
        }else if(nome.equals("rettangolo")){
            forma = new Rettangolo(nome);
        } else if(nome.equals("triangolo")){
            forma = new Triangolo(nome);
        }
        return forma;
    }
}
