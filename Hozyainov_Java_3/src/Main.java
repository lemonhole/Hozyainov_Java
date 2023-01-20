import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        System.out.println("В массиве:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nТрём кратны:\n");

        int n = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (( (arr[i] % 3) == 0) && (arr[i] != 0))
                arr[n++] = arr[i];
        }
        for(int i = 0; i < n; ++i)
            System.out.printf(arr[i] + " ");
    }
}