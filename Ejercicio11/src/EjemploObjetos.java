public class EjemploObjetos {
    public static void main(String[] args) {
        Alumno oscar = new Alumno("Oscar", "Martinez", "38070292", "47250235");
        Libro espadaNegra = new Libro("Espada Negra", "1313131313131", 357);

        espadaNegra.abrir();
        espadaNegra.seleccionarPagina(75);
        espadaNegra.paginaSiguiente();
        espadaNegra.mostrarLibro();
    }
}
