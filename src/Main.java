import java.util.Scanner;
import java.util.concurrent.Callable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите радиус: ");
        Circle.setRadius(scanner.nextDouble());
        Circle.area();
        Circle.circumference();
    }
}