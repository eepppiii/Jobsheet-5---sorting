import java.util.Scanner;

public class Mahasiswademo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();

        for (int i = 0; i < list.listMhs.length; i++) {
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa23(nim, nama, kelas, ipk));
            System.out.println();
        }

        System.out.println("Data Sebelum Sorting");
        list.tampil();
        
        System.out.println("Data Setelah Sorting IPK (DESC)");
        list.intertionSort();
        list.tampil();
    }
}
