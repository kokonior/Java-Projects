//Tugas OOP Java

public class Penggajian
{
    public String Nama, Jabatan;
    public int IDPegawai, gajiPokok, gajiLembur, pajak, totalGaji;

    // Method konstruktor & Menerima Parameter
    public Penggajian(int IDPegawai, String Nama, String Jabatan)
    {
       this.IDPegawai = IDPegawai;
       this.Nama = Nama;
       this.Jabatan = Jabatan;
    }
    
    // Method Void = Menampilkan data karyawan
    public void Pegawai(){
        System.out.println("ID Pegawai : "+this.IDPegawai);
        System.out.println("Nama Pegawai : "+this.Nama);
        System.out.println("Jabatan Pegawai : "+this.Jabatan);       
    }
    
    // Method non Void = Menerima Parameter & Menghitung Total Gaji
    public int GajiPegawai(int gajiPokok, int gajiLembur, int pajak){        
        this.gajiPokok = gajiPokok;
        this.gajiLembur = gajiLembur;
        this.pajak = pajak;
        totalGaji = gajiPokok + gajiLembur - pajak;
        return totalGaji;
    }
    
    // Method Main = Memeberikan nilai ke parameter & menampilkan-nya
    public static void main(String[] args){     
        Penggajian a = new Penggajian(12311,"Risky Muhamad","Staff Programmer");        
        a.GajiPegawai(50000, 20000, 10000);
        a.Pegawai();
        System.out.println("Total Gaji Pegawai : "+a.totalGaji);        
    }
}
