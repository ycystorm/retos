import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        int moneda;
        int aleatorio;
        int tope = 100000;
        int valorA = 0;
        String nombre;
        System.out.println("juego del casillerazo");
        System.out.println("lansa una moneda, cara:1 y sello:2");
        System.out.println(" tu tope inicial es de 1000000");
        System.out.println("digite su nombre");
        Scanner registrar = new Scanner(System.in);
        nombre = registrar.nextLine();
        System.out.println("pon tu seleccion");
        moneda = registrar.nextInt();
        System.out.println("cuanto desea apostar ");
        valorA = registrar.nextInt();
        // utilizamos el metodo math.random para dar un numero aleatorio, antes tenemos
        // que especificar el emetodo int para no devolver decimales
        aleatorio = (int) (Math.random() * 2) + 1;
        if (aleatorio == 1 && moneda == 1) {
            //hago una comparcion entre la consola y la eleccion de la persina 
            System.out.println("salio cara ");
            System.out.println(nombre + " has ganado la respuesta de la maquina es " + aleatorio + " la tuya es " + moneda
                    + "tu valor fina es  " + (tope+valorA));
        } else if (aleatorio == 2 && moneda == 2) {
            System.out.println("salio sello ");
            System.out.println(nombre + " has ganado la respuesta de la maquina es " + aleatorio + " la tuya es " + moneda
                    + "tu valor fina es  " + (tope+valorA));
        } else if (aleatorio == 1 && moneda == 2) {
            System.out.println(" salio cara ");
            System.out.println(nombre + " has perdido la respuesta de la maquina es " + aleatorio + " la tuya es "
                    + moneda + " tu valor fina es  " + (tope-valorA));
        } else if (aleatorio == 2 && moneda == 1) {
            System.out.println("salio sello ");
            System.out.println(nombre + "has perdido la respuesta de la maquina es " + aleatorio + " la tuya es "
                    + moneda + " tu valor fina es  " + (tope-valorA));
        }

        System.out.println("Gracias por jugar");

        // Limpiar Buffer
        registrar.close();
    }
}
