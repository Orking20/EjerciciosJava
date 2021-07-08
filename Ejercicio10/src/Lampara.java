public class Lampara {
    private boolean estado;

    public Lampara() {
        estado = false;
    }
    public Lampara(boolean estado) {
        this.estado = estado;
    }

    public void encender() {
        estado = true;
    }
    public void apagar() {
        estado = false;
    }
    public void mostrarEstado() {
        if(estado) {
            System.out.println("Encendida");
        }
        else {
            System.out.println("Apagada");
        }
    }
}
