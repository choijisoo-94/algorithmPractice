import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			int turn = 1;
			int x = 0, y = -1;
			int cnt = 1;
			
			while(true) {
				for(int i = 0; i < n; i++) {
					y = y + turn;
					a[x][y] = cnt;
					cnt++;
				}
				n--;
				for(int i = 0; i < n; i++) {
					x = x + turn;
					a[x][y] = cnt;
					cnt++;
				}
				turn *= -1;
				if(n == 0)
					break;
			}
			System.out.println("#" + t);
			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a.length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}