public class Pelicula {

    //Usar private para que no se puedan modificar las variables desde la clase TestPelicula.
    private String titulo;
    private String directo;
    private int duracionMinutos;

    //Crear el Constructor.
    public Pelicula(String titulo, String directo, int duracionMinutos) {
        this.titulo = titulo;
        this.directo = directo;
        this.duracionMinutos = duracionMinutos;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo==null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("El titutlo no puede ser nulo o estar vacio.");
        }
        this.titulo = titulo;
    }

    public String getDirecto() {
        return directo;
    }

    public void setDirecto(String directo) {
        if(directo==null || directo.trim().isEmpty()){
            throw new IllegalArgumentException("El director no puede ser nulo o estar vacio.");
        }
        this.directo = directo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        if(duracionMinutos<=0){
            throw new IllegalArgumentException("La duración debe ser mayor que 0 minutos");
        }
        this.duracionMinutos = duracionMinutos;
    }

    //metodo mostrar información.
    public void mostraInformacion(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Pelicula{"+
                ",titulo='"+titulo+'\'' +
                ", director='"+directo+'\''+
                ", duracionMinutos='"+duracionMinutos+'}';
    }
}