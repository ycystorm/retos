import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        int seleccion;
        int aleatorio;
        int valorA = 0;
        String nombre;
        int vidas = 3;
        int turnos = 0;
        int repeticiones=0;
        int tope = 100000;
        Scanner registrar = new Scanner(System.in);
        System.out.println("por favor digita la cantidad de veces que vas a jugar recuerda que el maximo es 10");
        repeticiones = registrar.nextInt();
        System.out.println("juego de piedra, papel o tijera");
            System.out.println("seleccion: piedra:1, papel:2, tijera:3");
            System.out.println("digite su nombre");
            nombre=registrar.nextLine();
            while(repeticiones >10){
                System.out.println("el numero de intentos no puede superar 10. digite un numero valido ");
                repeticiones = registrar.nextInt();
            }
        for (turnos=0; turnos < repeticiones && vidas>0; turnos++) {
            System.out.println(" tu tope inicial es de "+ tope);
            System.out.println("pon tu seleccion");
            seleccion=registrar.nextInt();
            System.out.println("cuanto desea apostar ");
            valorA=registrar.nextInt();
            aleatorio = (int) (Math.random() * 3) + 1;
            if (aleatorio == 1 && seleccion == 1) {
                System.out.println("respuesta tijera");
                System.out.println(
                        nombre + " has ganado la respuesta de la maquina es " + aleatorio + " la tuya es " + seleccion
                                + "tu valor fina es  " + (tope += valorA));
            } else if (aleatorio == 2 && seleccion == 1) {
                System.out.println("respuesta papel");
                System.out.println(nombre + "has perdido la respuesta de la maquina es " + aleatorio + " la tuya es "
                        + seleccion + " tu valor fina es  " + (tope -= valorA) + " vidas " + (vidas --));

            } else if (aleatorio == 3 && seleccion == 1) {
                System.out.println(nombre + " has empatado la respuesta de la maquina es " + aleatorio + " la tuya es "
                        + seleccion + " tu valor fina es  " + tope);
            } else if (aleatorio == 2 && seleccion == 2) {
                System.out.println("respuesta piedra");
                System.out.println(nombre + " has ganado la respuesta de la maquina es " + aleatorio + " la tuya es "
                        + seleccion + "el valor tital que tienes es " + (tope += valorA));
            } else if (aleatorio == 1 && seleccion == 2) {
                System.out.println("respuesta tijera");
                System.out.println(nombre + " has perdido la respuesta de la maquina es " + aleatorio + " la tuya es "
                        + seleccion + " tu valor fina es  " + (tope -= valorA) + " vidas " + (vidas -- ));
            } else if (aleatorio == 3 && seleccion == 2) {
                System.out
                        .println(" has empatado la respuesta de la maquina es " + aleatorio + " la tuya es " + seleccion
                                + " tu valor fina es  " + tope);
            } else if (aleatorio == 3 && seleccion == 3) {
                System.out.println("respuesta piedra");
                System.out.println(nombre + " has perdido la respuesta de la maquina es " + aleatorio + " la tuya es "
                        + seleccion + " tu valor fina es  " + (tope -= valorA) + " vidas " + (vidas --));
            } else if (aleatorio == 2 && seleccion == 3) {
                System.out.println("respuesta papel");
                System.out.println(nombre + " has ganado la respuesta de la maquina es " + aleatorio + " la tuya es "
                        + seleccion + "tu valor fina es  " + (tope += valorA));
            } else if (aleatorio == 1 && seleccion == 3) {
                System.out.println(nombre + " has empatado la respuesta de la maquina es " + aleatorio + " la tuya es "
                        + seleccion + " tu valor final es  " + tope);
            } 
        }
        System.out.println("Gracias por jugar");
    registrar.close();
    }
}
