package servicio;

import modelo.Ciudad;
import modelo.CiudadJava;

public class CiudadservicioJava {

    public void mostrar(CiudadJava ciu) {
        System.out.println("Nombre ciudad :"+ciu.getNombreCiudad());
        System.out.println("Poblacion :"+ciu.getPoblacion());
        if(ciu.getPais()!=null) {
            System.out.println("Pais :" + ciu.getPais().getNombrePais() +
                    ", codigo: " + ciu.getPais().getCodigo());
        }
    }

}
