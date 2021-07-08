public class EjemploObjetos {
    public static void main(String[] args) {
        Lampara l1 = new Lampara();
        Lampara l2 = new Lampara(true);

        System.out.println("Lampara 1: ");
        l1.mostrarEstado();
        l1.encender();
        l1.mostrarEstado();
        l1.apagar();
        l1.mostrarEstado();

        System.out.println("Lampara 2: ");
        l2.mostrarEstado();
        l1.apagar();
        l1.mostrarEstado();
        l1.encender();
        l1.mostrarEstado();
    }
}
