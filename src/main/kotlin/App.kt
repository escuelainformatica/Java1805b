import modelo.Ciudad
import modelo.Pais
import servicio.CiudadServicio

fun main() {
    // Ciudad ciudad=new Ciudad("Santiago",17);
    var ciudad= Ciudad("Santiago",17,Pais("Chile","cl"));
    var ciudadsrv=CiudadServicio();

    ciudadsrv.mostrar(ciudad);






}
