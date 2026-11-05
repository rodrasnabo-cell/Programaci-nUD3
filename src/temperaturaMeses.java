import java.util.Random;
import java.util.Arrays; // Importante para imprimir el array correctamente

public class temperaturaMeses {

    static int[] temperaturaMeses = new int[12];
    static Random random = new Random();

    static void llenar() {
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = random.nextInt(41);
        }
        // Usamos Arrays.toString para ver los elementos del arreglo
        System.out.println(Arrays.toString(temperaturaMeses));
    }

    static void llenarInverso() {
        for (int i = temperaturaMeses.length - 1; i >= 0; i--) {
            System.out.print(temperaturaMeses[i] + ", ");


        }
        System.out.println();

    }

    static void temperaturaMedia() {
        int Suma = 0;
        double Media =0;
        for (int i= 0;i < temperaturaMeses.length;i++){
            Suma += temperaturaMeses[i];
        }
          Media = (double)Suma / 12;

        System.out.printf("La temperatura media es %.2f: ", Media);
        System.out.println();

    }


    static void mesescalurosos() {
        int mescalor=0;
        for (int i= 0;i < temperaturaMeses.length; i++){
            if (temperaturaMeses[i] >30 ){
                mescalor = mescalor + 1;
                System.out.println("el mes" + (i+1));
                System.out.println("con"+ temperaturaMeses[i] + "º ");

            }

        }

        System.out.println("Son los " +  mescalor+ " meses calurosos");


    }

    static void parar() {
        boolean encontrado = false;
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (temperaturaMeses[i] > 30) {
                encontrado = true;

                System.out.println("Se encontró un mes con más de 30 grados. Fue en el mes " + (i + 1) + " con " + temperaturaMeses[i] + "ºC.");
                return;
            }
        }
        System.out.println("No se encontró ningún mes con más de 30 grados.");


    }
    static void parar2() {

    }



    // Método main obligatorio para poder ejecutar la clase
    public static void main(String[] args) {
        llenar();
        llenarInverso();
        temperaturaMedia();
        mesescalurosos();
        parar();
        parar2();



    }

}
