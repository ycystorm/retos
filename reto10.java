import java.util.Scanner;

public class reto10 {
    public static void main(String[] args) {
        int edad;
        int respuesta=0;
        Scanner lectura=new Scanner(System.in);
        System.out.println("de sea empesar el programa si :1, no :2");
        respuesta=lectura.nextInt();
        while(respuesta==1){
            System.out.println("bienvenido a la discote mis primeros amigos ");
        System.out.println("por favor diga su edad ");
        edad=lectura.nextInt();
        if(edad>=18){
            System.out.println(" puede ingresar  a la discoteca  ");
        }else{
            System.out.println("no puede ingresar a la discoteca ");
        }
        }
        System.out.println(" eligio no entrar al sistema ");
        lectura.close();

    }
}
