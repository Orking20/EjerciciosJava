public class EjemploHerencia {
    public static void main(String[] args){
        LibroInfantil lI = new LibroInfantil("Cenicienta", "4856702150249", 42);

        if(lI.esRecomendable(22)){
            System.out.println("Es recomendable");
        }
        else{
            System.out.println("No es recomendable");
        }
    }
}
