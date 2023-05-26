package id.RaymondSetiawan.Magang;

import java.io.*;
import java.util.*;

public class Soal2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kalimat: ");
		String text = scan.nextLine();
        //teks = "Berikut adalah kisah sang gajah. sang gajah memiliki teman serigala bernama DoeSang. Gajah sering dibela oleh serigala ketika harimau mendekati gajah.";

        // Memanggil fungsi pencarian
        ArrayList<String> WordFound = searchWord(text, "sang gajah", "serigala", "harimau");

        // Menampilkan hasil pencarian
        System.out.println("Hasil Pencarian :");
        for (String kata : WordFound) {
            System.out.print(kata + " - ");
        }
    }

    public static ArrayList<String> searchWord(String text, String... word) {
        ArrayList<String> WordFound = new ArrayList<>();

        for (String k : word) {
            int i = text.indexOf(k);
            while (i != -1) {
            	WordFound.add(k);
                i = text.indexOf(k, i + 1);
            }
        }

        return WordFound;
    }
}
