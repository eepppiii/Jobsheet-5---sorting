public class SortingMain23 {
    public static void main(String[] args) {
        int a[] = { 20, 10, 2, 7, 12 };
        sorting23 dataurut1 = new sorting23(a, a.length);
        int b[] = { 30, 20, 2, 8, 14 };
        sorting23 dataurut2 = new sorting23(b, b.length);
        int c[] = { 40, 10, 4, 9, 3 };
        sorting23 dataurut3 = new sorting23(b, b.length);

        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurut dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurut dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        System.out.println("Data Awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurut dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}