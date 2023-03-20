import java.util.Scanner;

public class reto2{
    public static void main(String[] args) {
        float peso;
        float meses;
        float vacuna;
        String nombrem,nombrep,nombref;
        Scanner lectura = new Scanner(System.in);
        System.out.println("por favor digete el nombre del bebe");
        nombrep=lectura.nextLine();
        System.out.println("por favor digete el nombre del acudeinte");
        nombrem=lectura.nextLine();
        System.out.println("por favor ingrese nombre de la enfermera acargo ");
        nombref=lectura.nextLine();
        System.out.println("porfavor ingrese el peso del bebe");
        peso=lectura.nextFloat();
        System.out.println("por favor digete los meses del bebe");
        meses=lectura.nextFloat();
        vacuna= (((peso + 10) / (meses * 10))*8);
        System.out.println("nombre del paciente"+nombrep+"nombre del acudiente"+nombrem+"nombre de la enfermera"+nombref+" la docis de la avcuna a aplicar es " + vacuna+ " ml");
        lectura.close();
    }
}