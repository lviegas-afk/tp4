import java.util.Random;

public class AlgoritmoGenetico {

    private Cadena principal;
    private Integer iteraciones;

    public AlgoritmoGenetico() {
        this.principal = this.generarCadena();
        this.iteraciones = 0;
    }

    public Cadena generarCadena() {
        Cadena nuevaCadena = new Cadena(20);
        for (int i = 0; i < 20; i++) {
            nuevaCadena.agregarValor(this.generarnumeroAleatorio());
        }
        return nuevaCadena;
    }

    private int generarnumeroAleatorio(){
        Random random = new Random();
        return random.nextInt(2); // el limite maximo es 2 ya que en la funcion random 2 el limite es exclusivo
    }

    public void imprimirCadenaPrincipal(){
        System.out.println(this.principal);
    }

    public void procesar() {
        if(this.principal == null) this.principal = this.generarCadena();
        System.out.println("Empezando proceso con la cadena\n\t" + this.principal);
        while (this.principal.evaluarCadena() < 40){
            Cadena nuevaCadena = this.generarCadena();
            Cadena cadenaCruzada = Cruzador.cruzar(this.principal,nuevaCadena);
            if(cadenaCruzada.evaluarCadena() > this.principal.evaluarCadena()){
                System.out.printf("La nueva cadena cruzada es ahora la principal ya que tiene un valor %d mayor al " +
                        "valor de la cadena principal anterior %d\n" ,
                            cadenaCruzada.evaluarCadena(),
                            this.principal.evaluarCadena());
                this.principal = cadenaCruzada;
                System.out.println("Nueva cadena guardada como principal:\n\t" + this.principal);
            }
            this.iteraciones++;
        }
        System.out.println("La cantidad de iteraciones necesarias para lograr una cadena con valor igual a 40 es -> " + this.iteraciones);
    }
}
