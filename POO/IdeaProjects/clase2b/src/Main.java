import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //para pedir datos por consola

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.next(); //next : todo tipo de datos string
        System.out.println("Ingrese su apellido: ");
        String apellido = sc.next();
        System.out.println("Ingrese su dia de nacimiento: ");
        Integer dia = sc.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        Integer mes = sc.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        Integer anio = sc.nextInt();

        System.out.println(nombre+" "+apellido+".\n Su fecha de nacimiento es "+armadoDeFecha(dia,mes,anio));
    }

    public static String armadoDeFecha(Integer dia, Integer mes,Integer anio) {
        return dia+"/"+mes+"/"+anio;
    }

}