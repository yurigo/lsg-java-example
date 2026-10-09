import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final Integer MAX = 10;

        Scanner sc = new Scanner(System.in);

        Integer numero = sc.nextInt();

        Boolean esdivisible = false;

//    if (
//        numero % 1 == 0 ||
//        numero % 2 == 0 ||
//        numero % 3 == 0 ||
//        numero % 4 == 0 ||
//        numero % 5 == 0 ||
//        numero % 6 == 0 ||
//        numero % 7 == 0 ||
//        numero % 8 == 0 ||
//        numero % 9 == 0){
//        System.out.println("SI");
//
//    }else{
//        System.out.println("NO");
//    }
        esdivisible = true;
        for (int i = 1; i < MAX; i++){
            if (numero % i != 0){
                esdivisible = false;
            }
        }

        if (esdivisible)
            System.out.println("SI");
        else
            System.out.println("NO");






    }
}
