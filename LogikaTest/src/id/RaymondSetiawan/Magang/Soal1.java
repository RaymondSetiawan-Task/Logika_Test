package id.RaymondSetiawan.Magang;

import java.io.*;
import java.util.*;

public class Soal1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("N: ");
		int Number = scan.nextInt();
        List<Object> result = TampilAngka(Number);
        System.out.println(result);
	}
	

    public static List<Object> TampilAngka(int Number) {
        List<Object> numbers = new ArrayList<>();
        int count = 1;
        while (numbers.size() < Number) {
            if (count % 3 == 0 || count % 7 == 0) {
                if (count % 3 == 0 && count % 7 == 0) {
                    numbers.add("Z");
                } else {
                    numbers.add(count);
                }
            }
            count++;
        }
        return numbers;
    }
}