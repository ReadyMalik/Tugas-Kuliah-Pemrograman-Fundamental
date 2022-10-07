import java.util.Scanner;

public class menentukan_kelulusan_siswa {
public static void main(String[] args) {
	String nama;
	int nilai, nilai_r;
	boolean running = true;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Program Kelulusan Ujian Siswa");
	System.out.println("______________________________________________");
	System.out.print("Masukan Nama Siswa : ");
	nama = scan.nextLine();
	System.out.print("Masukan Nilai Siswa : ");
	nilai = scan.nextInt();
	
	if (nilai>=75){
		System.out.println("Selamat "+nama+" kamu Lulus dengan nilai "+nilai+"!");
	}else {
		System.out.println("Maaf nilai kamu "+nilai+" dan tidak memenuhi syarat, silahkan bersiap mengikuti remedial selanjutnya");
		System.out.println("_____________________________________________________________________________________________________________");
	while (running) {
		System.out.println("_____________________________________________________________________________________________________________");
		System.out.print("Masukan nilai remedial kamu = ");
		nilai_r = scan.nextInt();
		if (nilai_r>=60 ){
			running = false;
			System.out.println("Selamat, kamu lulus dengan nilai remedial = "+nilai_r+"!");
		}else {
		System.out.println("Ikuti remedial sekali lagi, Semoga beruntung!");
	}
	}
}
}		
}