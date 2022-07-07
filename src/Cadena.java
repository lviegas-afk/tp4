import java.util.Arrays;

public class Cadena {

    private Integer[] cadena;

    private Integer tamanio,indice, valorCadena;

    public int getTamanio() {
        return tamanio;
    }
    public int getIndice() {
        return indice;
    }
    public Integer getValor(int indice) {
        return this.cadena[indice];
    }

    public Cadena(int tam) {
        this.tamanio = tam;
        this.cadena = new Integer[this.tamanio];
        indice = 0;
    }

    @Override
    public String toString() {
        return "Cadena {" +
                "\n\t\tcadena=" + Arrays.toString(cadena) +
                "\n\t\tvalor cadena=" + this.evaluarCadena() +
                "\n\t\tvalor del indice=" + this.indice +
                "\n\t\ttamaño total permitido de la cadera=" + this.tamanio +
                "\n}";
    }

    public void agregarValor(int valor){
        if(this.indice >= this.tamanio){
            throw new IndexOutOfBoundsException("El nuevo valor ingresado supera el tamaño permitido de la cadena");
        }
        this.cadena[this.indice] = valor;
        this.indice++;
    }

    public int evaluarCadena(){
        if (this.tamanio != this.indice) return 0;
        if (this.valorCadena == null) {
            int sumatoria = 0;
            for (int i = 0; i < this.tamanio; i++) {
                sumatoria += this.cadena[i] * 2;
            }
            this.valorCadena = sumatoria;
            return sumatoria;
        } else {
            return this.valorCadena;
        }
    }
}
