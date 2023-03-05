import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
     double far,conversion;
     Scanner lectura = new Scanner(System.in);
    System.out.println("por favor ingrese los grados para la convercion");
    far=Double.parseDouble(lectura.nextLine());
    System.out.println(" el resultado de la conversion es ");
    conversion=(far - 32) / 1.8;
    System.out.println(conversion +" c ");
    lectura.close();
    }
}
