import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Введите целое значение от 0 до 9 и нажмите Enter:\n");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        if (i > 7) {
            System.out.print("Привет");
        } else {
            System.out.print("Пока");
        }
    }
}