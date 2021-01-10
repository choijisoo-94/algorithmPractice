import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			String[] k = br.readLine().split(" ");
			int min = 24;
			if(n > 0 && n <= 10000){
				for (int i = 0; i < k.length; i++) {
					min = min > Integer.parseInt(k[i]) ? Integer.parseInt(k[i]) : min;
				}
			}
			System.out.println(min);
		} catch (NumberFormatException | IOException e) {
			// TODO: handle exception
		}
	}
}