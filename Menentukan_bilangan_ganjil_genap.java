import java.util.Scanner;
public class Menentukan_bilangan_ganjil_genap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bilangan;
        System.out.println("PROGRAM MENENTUKAN BILANGAN GANJIL & GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Bilangan = ");
        bilangan=input.nextInt();
        
        if (bilangan%2==0){
            System.out.println("Bilangan "+bilangan+" adalah bilangan genap");
        }else {
             System.out.println("Bilangan "+bilangan+" adalah bilangan ganjil");
        }
    
  }
}