public class TestPelicula {
    public static void main(String[] args){
        Pelicula pelicula=new Pelicula("Origen", "Christopher Nolan", 120);
        System.out.println("Datos de la pelicula: ");
        pelicula.mostraInformacion();

        //Modificar atributos
        pelicula.setTitulo("Interstellar");
        pelicula.setDirecto("Christopher Nolan");
        pelicula.setDuracionMinutos(169);

        System.out.println(pelicula);

        System.out.println("Titulo: "+pelicula.getTitulo());
        System.out.println("Director: "+pelicula.getDirecto());

        try {
            pelicula.setDuracionMinutos(-10);
        }catch(IllegalArgumentException e){
            System.out.println("Error: " +e.getMessage());
        }
        pelicula.mostraInformacion();
    }
}
