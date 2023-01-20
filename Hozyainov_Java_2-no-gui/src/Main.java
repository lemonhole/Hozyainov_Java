import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите имя с заглавной буквы и нажмите Enter:\n");
        Scanner input = new Scanner (System.in);
        String str = input.nextLine ();

        int index = str.indexOf("Вячеслав");

        if(index == - 1) {
            System.out.println("Нет такого имени");
        } else {
            System.out.println("Привет, Вячеслав");
        }
    }
}