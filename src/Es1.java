import java.util.Arrays;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      1)
        System.out.println("Inserisci un numero intero: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci un ALTRO numero intero: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("La moltiplicazione tra i due numeri produce: " + multiply(num1, num2));
//      2)
        System.out.println("Inserisci una stringa:");
        String string1 = scanner.nextLine();
        System.out.println("Inserisci una seconda stringa:");
        String string2 = scanner.nextLine();
        System.out.println("Le due stringhe concatenate producono: " + concat(string1, string2));
//      3)
        String[] trialArr = {"Ciao", "come", "ti"};
        System.out.println(Arrays.toString(addInArray(trialArr, "chiami?")));
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static String concat(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static String[] addInArray(String[] array, String strToAdd) {
        String[] arr2 = new String[array.length + 1];
        System.arraycopy(array, 0, arr2, 0, array.length);
        arr2[array.length] = strToAdd;
        return arr2;
    }
}
