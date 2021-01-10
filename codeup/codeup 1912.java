import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(factorial(target));
    }
    public static int factorial(int x){

        if(x == 1){
            return 1;
        }else{
            return x * factorial(x-1);
        }
    }
    
}