import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String [] arr = br.readLine().split(" ");
        int min = 24;

        if(n > 0 && n <= 10000){
            for(int i = 0; i < arr.length; i++){
                min = min > Integer.parseInt(arr[i])?Integer.parseInt(arr[i]) : min;
            }
        }
        System.out.println(min);
    }
}