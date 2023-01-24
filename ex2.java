import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); 
    System.out.println("Введите промежуток чисел который нужно вывести: ");
    int min = reader.nextInt();
    int max = reader.nextInt();
    for (int i = min; i <= max; i++) {
        System.out.print(" " + i);
    }
    }
}
