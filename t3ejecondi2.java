
import java.util.Scanner;

public class t3ejecondi2 {

    public static void main(String args[]) {
        String ente,posi,par;
        float num,enter,pare;
        Scanner captura = new Scanner(System.in);
        
        num = captura.nextFloat();
        
        pare = num % 2;
        enter = num % 1;
        
        if (pare == 0) {
            par= "par";
        }
        else{
            par="e impar";
        }
        
        if (num < 0) {
            posi="negativo";
        }
        else{
            posi="positivo";
        }
        
        if (enter == 0) {
            ente="entero";
        } 
        
        else {
            ente = "decimal";
        }
        System.out.println("El numero ingresado tiene las siguientes propiedades\n"+ente+" "+posi+" "+par+".");

        //2. Escribir un programa en Java en el que dado un número, indique en una
        //frase sus propiedades, las cuales pueden ir entre:
        //a. Par o impar
        //b. Positivo o negativo (0 es considerado positivo)
        //c. Entero o decimal
    }
}
