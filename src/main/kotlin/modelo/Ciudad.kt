package modelo

class Ciudad {
    // campos de kotlin
    var nombreCiudad: String = "";
    var poblacion: Int =0;
    var pais: Pais? = Pais();

    // boton derecho -> generate-> second constructor

    constructor()

    constructor(nombreCiudad: String, poblacion: Int, pais: Pais?) {
        this.nombreCiudad = nombreCiudad
        this.poblacion = poblacion
        this.pais = pais
    }

}