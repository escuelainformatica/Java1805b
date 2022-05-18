import modelo.Ciudad;
import modelo.CiudadJava;
import modelo.Pais;
import servicio.CiudadServicio;
import servicio.CiudadservicioJava;

public class AppJava {

    public static void main(String[] args) {
        CiudadJava ci=new CiudadJava("Santiago",17,new Pais("Chile","cl"));
        CiudadservicioJava ciserv=new CiudadservicioJava();

        ciserv.mostrar(ci);

        CiudadJava ci2=new CiudadJava();
        ci2.setNombreCiudad("Iquique");
        ci2.setPoblacion(3);
        ciserv.mostrar(ci2);





    }
}
