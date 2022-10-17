package job5.latihanBubblesort;

public class Bubblesortmain {
    public static void main(String[] args) {
        int a[]={15,10,7,22,5};
        Bubblesort urut = new Bubblesort(a,a.length);
        System.out.println("Data sebelum diurutkan");
        urut.tampilkanData();
        urut.sortData();
        System.out.println("Data sesudah diurutkan");
        urut.tampilkanData();
    }
}
