package servicio

import modelo.Ciudad

class CiudadServicio {
    fun mostrar(ciu : Ciudad) {
        // sout
        println("-----------------------");
        println("Nombre ciudad "+ciu.nombreCiudad);
        println("Poblacion "+ciu.poblacion);
        println("Pais "+ (ciu.pais?.nombrePais ?: "null")
                +", codigo: "+ (ciu.pais?.codigo ?: "null")
        );
    }

    fun sumar(num1: Int, num2:Int): Int {
        return num1+num2;
    }
}