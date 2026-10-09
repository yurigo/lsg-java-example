import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Integer MAX = 10;
        Scanner sc = new Scanner(System.in);
        Integer numero = sc.nextInt();

        for (int i = 1; i < MAX; i++){
            if (numero % i != 0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("SI");
    }
}
