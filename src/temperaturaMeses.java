import java.util.Random;


public class temperaturaMeses {

    static int[] temperaturaMeses = new int[12];
    static Random random = new Random();

    static void llenar() {
        for (int i = 0;i < temperaturaMeses.length;i++) {
            temperaturaMeses[i] = random.nextInt(41);


        }




    }

    /** Versión 2: sin temperaturas repetidas. */
    static void llenarSinRepetidos() {
        int i = 0;
        while (i < temperaturaMeses.length) {
            int t = random.nextInt(41);
            if (!estaEnLosPrimeros(t, i)) {
                temperaturaMeses[i++] = t;
            }
        }
    }
}