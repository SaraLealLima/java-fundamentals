package exercicio7_matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		
		for (int i = 0; i<n; i++) {
			for (int j=0; j<m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		
		for (int i = 0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.println("Position " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: "+ mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: "+ mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Rigth: "+ mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: "+ mat[i+1][j]);
					}
					
				}
			}
		}
		
		
		sc.close();
	}

}
