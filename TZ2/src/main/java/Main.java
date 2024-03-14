import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку a: ");
        String number1 = scan.nextLine();
        System.out.print("Ведите строку b: ");
        String number2 = scan.nextLine();

        if (number1.equals (number2)) {
            System.out.println ("Строки идентичны");
        } else {System.out.println ("Строки не идентичны");
        }
    }
}