import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String str1 = scanner.nextLine();
        System.out.println("Inserisci una SECONDA stringa:");
        String str2 = scanner.nextLine();
        System.out.println("Inserisci una TERZA stringa:");
        String str3 = scanner.nextLine();
        System.out.println("In ordine di inserimento: " + str1 + " " + str2 + " " + str3 + " ");
        System.out.println("In ordine inverso: " + str3 + " " + str2 + " " + str1 + " ");
    }
}
