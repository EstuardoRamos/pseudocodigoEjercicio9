
import java.util.*;

public class Ejercicio9 {

    public static void main(String[] args) {
        int t1, t2, total1 = 0, total2 = 0, n1 = 0, n2 = 0;
        String opc = "";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese una temperatura T1: ");
            t1 = scanner.nextInt();
            System.out.print("Ingrese una temperatura T2: ");
            t2 = scanner.nextInt();
            if (t1 >= 5 && t1 < 16) {
                total1 += t1;
                n1 += 1;
            }
            if (t2 >= 5 && t2 < 16) {
                total2 += t2;
                n2 += 1;
            }

        } while (t1 != 0);
        float promedio1 = total1 / n1;
        float promedio2 = total2 / n2;
        float promedioT = (promedio1 + promedio2) / 2;
        System.out.println("El promedio de la temperaturas que estan entre 5 y 15 es " + promedioT);
    }
}
