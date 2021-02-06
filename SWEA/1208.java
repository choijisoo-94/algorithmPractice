import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int HSize = 100;
		int ten = 1;
		while(ten<11) {

			int dumpT = sc.nextInt();

			int []arr = new int[HSize];
			int []temp = new int[HSize];
			for(int i = 0; i < HSize; i++)
				arr[i] = sc.nextInt();

			for(int j = 0 ; j < HSize; j++) {
				temp[j] = arr[j];
			}
			Arrays.sort(temp);

			for(int i = 0;  i <dumpT; i++) {
				temp[HSize-1]--;
				temp[0]++;
				Arrays.sort(temp);
			}
			int result = temp[HSize-1]-temp[0];
			System.out.println("#"+ten+" "+result);
			ten++;
		}
	}
}