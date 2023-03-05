import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        int seleccion;
        int aleatorio;
        int tope = 100000;
        int valorA = 0;
        String nombre;
        System.out.println("juego de piedra, papel o tijera");
        System.out.println("seleccion: piedra:1, papel:2, tijera:3");
        System.out.println(" tu tope inicial es de 1000000");
        System.out.println("digite su nombre");
        Scanner registrar = new Scanner(System.in);
        nombre = registrar.nextLine();
        System.out.println("pon tu seleccion");
        seleccion = registrar.nextInt();
        System.out.println("cuanto desea apostar ");
        valorA = registrar.nextInt();
        aleatorio = (int) (Math.random() * 3) + 1;
        // utilizamos el metodo math.random para dar un numero aleatorio, antes tenemos
        // que especificar el emetodo int para no devolver decimales
        // hago una comparcion entre la consola y la eleccion de la persona, metodo para
        // comparar &&
        if (aleatorio == 1 && seleccion == 1) {
            System.out.println("respuesta tijera");
            System.out.println(nombre + " has ganado la respuesta de la maquina es " + aleatorio + " la tuya es " + seleccion
                    + "tu valor fina es  " + tope + valorA);
        } else if (aleatorio == 2 && seleccion == 1) {
            System.out.println("respuesta papel");
            System.out.println(nombre + "has perdido la respuesta de la maquina es " + aleatorio + " la tuya es "
                    + seleccion + " tu valor fina es  " + (tope - valorA));
        } else if (aleatorio == 3 && seleccion == 1) {
            System.out.println(nombre + " has empatado la respuesta de la maquina es " + aleatorio + " la tuya es "
                    + seleccion + " tu valor fina es  " + tope);
        } else if (aleatorio == 2 && seleccion == 2) {
            System.out.println("respuesta piedra");
            System.out.println(nombre + " has ganado la respuesta de la maquina es " + aleatorio + " la tuya es "
                    + seleccion + "el valor tital que tienes es " + tope + valorA);
        } else if (aleatorio == 1 && seleccion == 2) {
            System.out.println("respuesta tijera");
            System.out.println(nombre + " has perdido la respuesta de la maquina es " + aleatorio + " la tuya es "
                    + seleccion + " tu valor fina es  " + (tope - valorA));
        } else if (aleatorio == 3 && seleccion == 2) {
            System.out.println(" has empatado la respuesta de la maquina es " + aleatorio + " la tuya es " + seleccion
                    + " tu valor fina es  " + tope);
        } else if (aleatorio == 3 && seleccion == 3) {
            System.out.println("respuesta piedra");
            System.out.println(nombre + " has perdido la respuesta de la maquina es " + aleatorio + " la tuya es "
                    + seleccion + " tu valor fina es  " + (tope - valorA));
        } else if (aleatorio == 2 && seleccion == 3) {
            System.out.println("respuesta papel");
            System.out.println(nombre + " has ganado la respuesta de la maquina es " + aleatorio + " la tuya es "
                    + seleccion + "tu valor fina es  " + tope + valorA);
        } else if (aleatorio == 1 && seleccion == 3) {
            System.out.println(nombre + " has empatado la respuesta de la maquina es " + aleatorio + " la tuya es "
                    + seleccion + " tu valor fina es  " + tope);
        }
        System.out.println("Gracias por jugar");

        // Limpiar Buffer
        registrar.close();
    }
}
