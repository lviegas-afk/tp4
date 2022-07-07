public class Cruzador {
    public static Cadena cruzar(Cadena cadena1, Cadena cadena2){
        if(cadena1.getTamanio() != cadena1.getTamanio()) throw new RuntimeException("Las Cadenas no tiene el mismo tamaño");
        if(cadena1.getTamanio() != cadena1.getIndice() || cadena2.getIndice() != cadena1.getTamanio()) throw new RuntimeException("Una de las cadenas no esta completa");
        Cadena resultado = new Cadena(cadena1.getTamanio());
        for (int i = 0; i < cadena1.getTamanio(); i++) {
            if (cadena1.getValor(i) == cadena2.getValor(i)){
                resultado.agregarValor(1);
            } else {
                resultado.agregarValor(0);
            }
        }
        return resultado;
    }
}
