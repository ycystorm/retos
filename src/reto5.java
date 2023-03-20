import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        int precioP=0;
        int cantidad=0;
        int total=0;
        Scanner registrar=new Scanner(System.in);
        System.out.println("digite el numero de productos");
        cantidad=registrar.nextInt();
        for( int i= 1 ;i<cantidad;i++){
            System.out.println("Digite el precio del producto "+ i );
             precioP=registrar.nextInt();
             total+= precioP;
        }
        System.out.println(total);
        registrar.close();
    }
    
}
