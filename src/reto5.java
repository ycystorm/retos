import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        int precioP=0;
        int cantidad=0;
        int total=0,documento;
        String nombreP,nombreC;
        Scanner registrar=new Scanner(System.in);
        System.out.println("digite el numero de productos");
        cantidad=registrar.nextInt();
        System.out.println("ingrese el nombre del empleado");
        nombreP=registrar.nextLine();
        System.out.println("ingrese el nombre del cliente");
        nombreC=registrar.nextLine();
        System.out.println("ingrese el documento del cliente");
        documento=registrar.nextInt();
        for( int i= 1 ;i<cantidad;i++){
            System.out.println("Digite el precio del producto "+ i );
             precioP=registrar.nextInt();
             total+= precioP;
        }
        System.out.println(total);
        registrar.close();
    }
    
}
