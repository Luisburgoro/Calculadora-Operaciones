public class operaciones {

    // Método para mostrar el resultado
    public void resultado(double num){
        System.out.println("El resultado es " + num);
    }

    //Metodos de operaciones básicas, utilizarán las variables globales, son del tipo double.
    public void suma(double x, double y){
        resultado(x+y);
    }
    public void resta(double x, double y){
        resultado(x-y);
    }
    public void multiplicacion(double x, double y){
        resultado(x*y);
    }
    public void division(double x, double y){
        if(y==0){
            System.out.println("Error: No se puede dividir por 0"); // Caso indeterminado
        }
        else{
            resultado(x/y);
        }
    }
    public void mayor(double x, double y) {
        if (x >= y) {
            System.out.println("El número mayor es " + x);
        } else {
            System.out.println("El número mayor es " + y);
        }
    }
    public  void potencia(double x, double y){
        if(x==0 && y==0){
            System.out.println("Error: 0 elevado a 0 está indeterminado"); // Caso indeterminado
        }
        else {
            resultado(Math.pow(x, y));
        }
    }
}
