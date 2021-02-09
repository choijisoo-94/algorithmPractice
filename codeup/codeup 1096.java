import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			String[][] k = new String[19][19];
			ArrayList<String> input = new ArrayList<>();
			int n = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < n; i++) {
				input.add(br.readLine());
			}
			for (int i = 0; i < input.size(); i++) {
				String[] m = input.get(i).split(" ");
				k[Integer.parseInt(m[0])-1][Integer.parseInt(m[1])-1] = 1 + "";
			}
			for (int i = 0; i < k.length; i++) {
				for (int j = 0; j < k[i].length; j++) {
					if(k[i][j] == null){
						System.out.print(0 + " ");
					}else{
						System.out.print(k[i][j] + " ");
					}
				}
				System.out.println();
			}
		} 
}
    