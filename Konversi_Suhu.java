import java.util.Scanner;

public class Konversi_Suhu {
	public static void main(String[] args ) {
		int celc, far, rea;
		double kel;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Program Konversi Suhu ");
		System.out.println("============================================");
		System.out.println();
		System.out.print("Masukan suhu Celsius : ");
		celc = scan.nextInt();
		far= (celc*9/5) + 32;
		kel= celc+273.15;
		rea= celc*4/5;
		System.out.println("Suhu "+celc+" °C setara dengan : ");
		System.out.println("  "+far+" °F");
		System.out.println("  "+kel+" °K");
		System.out.println("  "+rea+" °R");
	}
}