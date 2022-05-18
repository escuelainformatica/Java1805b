package modelo;

public class CiudadJava {
    private String nombreCiudad;
    private int poblacion;
    private Pais pais;


    public CiudadJava(String nombreCiudad, int poblacion, Pais pais) {
        this.nombreCiudad = nombreCiudad;
        this.poblacion = poblacion;
        this.pais = pais;
    }

    public CiudadJava() {
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
