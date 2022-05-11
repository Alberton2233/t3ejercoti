import java.util.Scanner;
public class T3ejecondi {
    public static void main(String args[]){
        Scanner captura=new Scanner(System.in);
        int divisor, dividendo, resto;
        System.out.println("Digite dos numeros a dividir para saber si es exacto.");
        divisor=captura.nextInt();
        dividendo=captura.nextInt();
        resto=divisor%dividendo;
        if(resto==0){
            System.out.println("Su divicion es exacta");
        }
        else{
            System.out.println("Su divicion no es exacta");
        }
    }
}
