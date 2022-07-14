package For.repetitiva.estrutura;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i<= n; i++){
            if (f == 0){
                System.out.println(f);
            }
            else{
                f *= i;
            }
        }
        System.out.println(f);
    }
}
