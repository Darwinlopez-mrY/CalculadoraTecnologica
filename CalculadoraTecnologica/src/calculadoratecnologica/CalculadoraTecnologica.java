
package calculadoratecnologica;
import java.util.Scanner;
        
public class CalculadoraTecnologica {

    public static void main(String[] args) {
        System.out.println("vienenido corto");
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        System.out.println("la suma es " + suma);
        System.out.println("_________________________");
        System.out.println("la resta es "+ resta);
    }
    
}
