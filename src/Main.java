public class Main {

    public static void main(String[] args){
        String nome = "quadrato";
        String nome1 = "rettangolo";
        String nome2 = "triangolo";

        Forma quadrato = ShapeFactory.getForma(nome);
        Forma rettangolo = ShapeFactory.getForma(nome1);
        Forma triangolo = ShapeFactory.getForma(nome2);

        System.out.println("Forma:" + quadrato);
        System.out.println("Forma:" + rettangolo);
        System.out.println("Forma:" + triangolo);
    }
}
