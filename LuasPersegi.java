import java.util.Scanner;

public class LuasPersegi {
	public static void main(String[] args) {
		float keliling, sisi, luas;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Menghitung Luas Persegi yang diketahui kelilingnya");
		System.out.println("--------------------------------------------------------");
		System.out.print("Masukkan Keliling : ");
		keliling = scan.nextInt();
		
		sisi = keliling /4;
		
		System.out.println("Sisi Persegi adalah " + sisi);
		
		luas = sisi * sisi;
		
		System.out.println("Luas Persegi adalah " + luas);
	}
}	