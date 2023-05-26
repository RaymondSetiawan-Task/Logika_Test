package id.RaymondSetiawan.Magang;

import java.io.*;
import java.util.*;

public class Soal3 {
	   public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Password: ");
			String pass = scan.nextLine();

			String validationResult = cekPassword(pass);

	        System.out.println(validationResult);
	    }

	    public static String cekPassword(String sandi) {
	        // Pengecekan panjang kata sandi
	        if (sandi.length() < 8 || sandi.length() > 32) {
	            return "Harap membuat kata sandi terdiri dari 8 hingga 32 karakter.";
	        }

	        // Pengecekan karakter awal
	        if (Character.isDigit(sandi.charAt(0))) {
	            return "Karakter awal tidak boleh diawali dengan angka.";
	        }

	        // Pengecekan keberadaan angka
	        boolean hasDigit = false;
	        for (char c : sandi.toCharArray()) {
	            if (Character.isDigit(c)) {
	                hasDigit = true;
	                break;
	            }
	        }
	        if (!hasDigit) {
	            return "Kata sandi harus memiliki setidaknya satu angka.";
	        }

	        // Pengecekan keberadaan huruf kapital dan huruf kecil
	        boolean hasUppercase = false;
	        boolean hasLowercase = false;
	        for (char c : sandi.toCharArray()) {
	            if (Character.isUpperCase(c)) {
	                hasUppercase = true;
	            } else if (Character.isLowerCase(c)) {
	                hasLowercase = true;
	            }
	            if (hasUppercase && hasLowercase) {
	                break;
	            }
	        }
	        if (!hasUppercase || !hasLowercase) {
	            return "Kata sandi harus memiliki huruf kapital dan huruf kecil.";
	        }

	        return "Kata sandi valid.";
	    }
}
