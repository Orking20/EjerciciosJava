public class Libro {
    protected String titulo;
    protected String isbn;
    protected int numPaginas;
    protected boolean abierto = false;
    protected int paginaActual = 0;

    public Libro(String titulo, String isbn, int numPaginas) {
        this.setTitulo(titulo);
        this.setIsbn(isbn);
        this.setNumPaginas(numPaginas);
    }

    public void abrir() {
        setAbierto(true);
    }
    public void cerrar() {
        setAbierto(false);
    }

    public void paginaSiguiente() {
        if(getPaginaActual() < getNumPaginas()) {
            setPaginaActual(getPaginaActual() + 1);
        }
    }
    public void paginaAnterior() {
        if(getPaginaActual() > 0) {
            setPaginaActual(getPaginaActual() - 1);
        }
    }
    public void seleccionarPagina(int numeroDePagina) {
        if(numeroDePagina > 0 && numeroDePagina < getNumPaginas()) {
            this.setPaginaActual(numeroDePagina);
        }
    }

    public void mostrarLibro() {
        System.out.println("Título: " + getTitulo());
        System.out.println("ISBN: " + getIsbn());
        if(isAbierto()) {
            System.out.println("Abierto");
        }
        else {
            System.out.println("Cerrado");
        }
        System.out.println("Páginas totales: " + getNumPaginas());
        System.out.println("Página actual: " + getPaginaActual());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }
}