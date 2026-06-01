import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza del primo lato del rettangolo:");
        double lato1 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del rettangolo:");
        double lato2 = scanner.nextDouble();
        System.out.println("Il perimetro del rettangolo è: " + perimeter(lato1, lato2));
        System.out.println("Inserisci un numero:");
        int number = scanner.nextInt();
        System.out.println("Questo è il resto della divisione tra il tuo numero e 2: " + isEven(number));
        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double side1 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double side2 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del terzo lato del triangolo:");
        double side3 = scanner.nextDouble();
        try {
            System.out.println("L'area è: " +
                    triangleAreaFromSides(side1, side2, side3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static double perimeter(double l1, double l2) {
        return (l1 + l2) * 2;
    }
    public static int isEven(int num) {
        return num % 2;
    }

    public static double triangleAreaFromSides(double l1, double l2, double l3) {
        double p = (l1 + l2 + l3)/2;
        double A = Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
        if (Double.isNaN(A)) {
            throw new IllegalArgumentException("I dati del triangolo sono errati");
        }
        return A;
    }

}
