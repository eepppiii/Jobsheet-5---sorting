public class MahasiswaBerprestasi23 {
    Mahasiswa23[] listMhs = new Mahasiswa23[5];
    int idx;

    void tambah(Mahasiswa23 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa23 m : listMhs) {
            m.tampilinformasi();
            System.out.println("-----------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa23 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        Mahasiswa23 m1 = new Mahasiswa23("123", "Zidan", "2A", 3.2);
        Mahasiswa23 m2 = new Mahasiswa23("124", "Ayu", "2A", 3.5);
        Mahasiswa23 m3 = new Mahasiswa23("125", "sofi", "2A", 3.1);
        Mahasiswa23 m4 = new Mahasiswa23("126", "kita", "2A", 3.9);
        Mahasiswa23 m5 = new Mahasiswa23("127", "miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting");
        list.tampil();
        System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC) :");
        list.bubbleSort();
        list.tampil();
    }
}
