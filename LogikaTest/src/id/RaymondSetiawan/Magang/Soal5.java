package id.RaymondSetiawan.Magang;

import java.util.Scanner;

public class Soal5 {
	public static void cetakPola(int N) {
        if (N % 2 != 0) {
            char[][] pola = new char[N][N];

            // Mengisi pola dengan karakter 'X'
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    pola[i][j] = 'X';
                }
            }

            // Mengisi pola dengan karakter 'O'
            for (int i = 1; i < N - 1; i++) {
                for (int j = 1; j < N - 1; j++) {
                    pola[i][j] = 'O';
                }
            }

            // Mencetak pola
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(pola[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Input harus bilangan ganjil.");
        }
        System.out.println();
    }
	
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		System.out.print("N: ");
		int N = scan.nextInt();
        cetakPola(N);
    } 
}
