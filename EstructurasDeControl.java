import java.sql.SQLOutput;

public class EstructurasDeControl {
    public static void main(String[] args) {

        // Estructura de control if
        System.out.println("---------- Salida if ---------------------------");
        int numeroIf = 5;
        if (numeroIf < 0) {
            System.out.print("El numero es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es igual a cero");
        }
        System.out.println("------------------------------------------------");

        System.out.println("---------- Salida while ------------------------");
        // Bucle while
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("El valor del numeroWhile es: " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        System.out.println("------------------------------------------------");

        System.out.println("---------- Salida do-while ---------------------");
        // Bucle do-while
        int numeroDoWhile = 5;
        do {
            System.out.println("El valor del numeroDoWhile es: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
        System.out.println("---------------------------------------------------");

        System.out.println("---------- Salida for -----------------------------");
        // Bucle for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println("El valor de la variable numeroFor es: " + numeroFor);
        }
        System.out.println("--------------------------------------------------");

        System.out.println("---------- Salida switch -------------------------");
        // Bucle switch
        String estacion = "Invierno";
        switch (estacion) {
            case "Verano":
                System.out.println("La estacion en la que estamos es: " + estacion);
                break;
            case "Invierno":
                System.out.println("La estacion en la que estamos es: " + estacion);
                break;
            case "Primavera":
                System.out.println("La estacion en la que estamos es: " + estacion);
                break;
            case "Otoño":
                System.out.println("La estacion en la que estamos es: " + estacion);
                break;

            default:
                System.out.println("No corresponde a ninguna estacion del año");
        }

    }
}
