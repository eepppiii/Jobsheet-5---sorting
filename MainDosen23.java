import java.util.Scanner;

public class MainDosen23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen23 data = new DataDosen23();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda → Tertua)");
            System.out.println("4. Sorting DSC (Tertua → Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode   : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jk = sc.next().charAt(0);
                    System.out.print("Usia   : ");
                    int usia = sc.nextInt();

                    boolean jenis = (jk == 'L' || jk == 'l');

                    data.tambah(new Dosen23(kd, nama, jenis, usia));
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC!");
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC!");
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);
    }
}