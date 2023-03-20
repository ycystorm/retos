import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        Scanner registrar = new Scanner(System.in);
        int turnos=0;
        int aleatorio=0;
        int num1=0;
        aleatorio=(int) (Math.random() * 100)+1;
        for ( turnos=0 ; turnos<=9 ; turnos++){
            System.out.println("por favor ingresa el numero");
            num1=registrar.nextInt();
            if ( aleatorio == num1  ){
                System.out.println(" lograste hacerta el numero maquina "+ aleatorio+);
                System.out.println("con los intentos "+turnos );
                break;
            }
            else if(turnos==9){
                System.out.println(" lo siento has perdido el numero era "+aleatorio);
                break;
            }
            else if( aleatorio<num1){
                System.out.println("lo siento el numero es mayor  al elejido ");
            }
            else if(aleatorio>num1){
                System.out.println(" lo siento el numero es menor al elejido ");
            }
        }
        registrar.close();
    }
}
