package id.RaymondSetiawan.Magang;

import java.io.*;
import java.util.*;

public class Soal4 {
	public static void main(String[] args) {
		 int[] input = {2, 3, 4, 6};
	        int result = findMissingNumber(input);
	        System.out.println("Bilangan terkecil yang tidak ada didata : " + result);
    }

    public static int findMissingNumber(int[] arr) {
        Arrays.sort(arr); // Mengurutkan array secara ascending
        int smallestMissingNumber = 1; // Inisialisasi bilangan cacah terkecil yang belum ditemukan

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallestMissingNumber) {
                smallestMissingNumber++; // Jika bilangan cacah ada dalam array, naikkan bilangan cacah terkecil yang belum ditemukan
            }
        }

        return smallestMissingNumber;
    }
}
