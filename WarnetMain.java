package penyewaanwarnet;

import java.util.Scanner;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author cwr
 */
public class WarnetMain {

    public static void main(String[] args) {
        
        UserFiles c = new UserFiles();
        SortUser c2 = new SortUser();
        SearchUser c3 = new SearchUser();
        
        Scanner x = new Scanner(System.in);
        System.out.println("  ◤====================================================◥");
        System.out.println("  ╏            **Aplikasi Penyewaan Warnet**            ╏");
        System.out.println("  ╏ ____________ • Canggih Wahyu Rinaldi • ____________ ╏");
        System.out.println("  ╏                                                     ╏");
        System.out.println("  ╏ PC 1-5  (biasa) : Rp.500/10 menit => Rp.3000/jam    ╏");
        System.out.println("  ╏ PC 6-10 (AC)    : Rp.1000/10 menit => Rp.6000/jam   ╏");
        System.out.println("  ╏                                                     ╏");
        System.out.println("  ╏ *Discount 20% untuk penyewaan 100 menit atau lebih  ╏");
        System.out.println("  ◣----------------------------------------------------◢");
        System.out.println("");
        System.out.print("Masukkan jumlah user : ");
        int nUser = x.nextInt();
        System.out.println("");
        
        String[] header = c.menu();
        String[][] user = c.inputUser(header, nUser);
        double[] totalBayar = c2.getTotalBayar(user);
        double pendapatan = c2.pendapatan(totalBayar);
        
        c.printNota(header, user);
        boolean loop = true;
        
        while (loop) {
            c.pressEnter();
            System.out.println("=======================================================");
            System.out.println("|            **Aplikasi Penyewaan Warnet**            |");
            System.out.println("| 1 . Sorting Ascending (Terendah ke tertinggi)       |");
            System.out.println("| 2 . Sorting Descending (Tertinggi ke terendah)      |");
            System.out.println("| 3 . Total Pendapatan                                |");
            System.out.println("| 4 . Searching (Pencarian)                           |");
            System.out.println("| 0 . Exit (Keluar Aplikasi)                          |");
            System.out.println("*-----------------------------------------------------*");
            System.out.print("Pilih [1/2/3/0] : ");
            int pilih = x.nextInt();
            System.out.println("");
            
            if (pilih == 1) {
                c2.sortAsc(user, totalBayar);
                c2.viewSort(header, user);
            } else if (pilih == 2) {
                c2.sortDesc(user, totalBayar);
                c2.viewSort(header, user);
            } else if (pilih == 3) {
                c2.printPendapatan(header, user, pendapatan);
            } else if (pilih == 4) {
                c3.search(user, header);
            } else {
                System.exit(0);
            }
        }
        
    }
    
}

public class UserFiles {

    public String[] menu() {
        String[] header = {
            "KOMPUTER(PC)",
            "USERNAME",
            "WAKTU",
            "BIAYA",
            "DISKON",
            "TOTAL"
        };
        return header;
    }

    public String[][] inputUser(String[] header, int n) {
        Scanner x = new Scanner(System.in);
        String[][] user = new String[n][6];

        int com[] = new int[n];
        String username[] = new String[n];
        int time[] = new int[n];
        double harga[] = new double[n];
        double diskon[] = new double[n];
        double total[] = new double[n];
        
        System.out.println("-------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("Pilih Komputer[1-10] : ");
            com[i] = x.nextInt();
            System.out.print("Masukkan Username : ");
            username[i] = x.next();
            System.out.print("Durasi (dalam satuan menit) : ");
            time[i] = x.nextInt();
            System.out.println("-------------------------------");
            
            if (com[i] <= 5) {
                harga[i] = time[i]*50;
                total[i] = harga[i];
                if (time[i] >= 100) {
                    diskon[i] = total[i]/5;
                    total[i] = total[i] - diskon[i];
                }
            }else {
                harga[i] = time[i]*100;
                total[i] = harga[i];
                if (time[i] >= 100) {
                    diskon[i] = total[i]/5;
                    total[i] = total[i] - diskon[i];
                }
            }
            
            user[i][0] = String.valueOf(com[i]);
            user[i][1] = username[i];
            user[i][2] = String.valueOf(time[i]);
            user[i][3] = String.valueOf(harga[i]);
            user[i][4] = String.valueOf(diskon[i]);
            user[i][5] = String.valueOf(total[i]);
        }
        return user;
    }
    
    public void printNota(String[] header , String[][] user) {
        System.out.println("*======================================================================================*");
        System.out.println("|                                 Nota Penyewaan Warnet                                |");
        System.out.println("|======================================================================================|");
        for (int i = 0; i < user[0].length; i++) {
            System.out.print(String.format("| %10s  ", header[i]));
        }System.out.println(" |");
        System.out.println("|--------------------------------------------------------------------------------------|");
        for (int i = 0; i < user.length; i++) {
            System.out.print(String.format("| %13s ", "Komp/PC-"+user[i][0]));
            System.out.print(String.format("| %10s  ", user[i][1]));
            System.out.print(String.format("| %10s  ", user[i][2]+" menit"));
            for (int j = 3; j < user[0].length; j++) {
                System.out.print(String.format("| %10s  ", "Rp."+user[i][j]));
            }
            System.out.println(" |");
        }
        System.out.println("*--------------------------------------------------------------------------------------*");
    }
    
    public void pressEnter() {
        Scanner enter = new Scanner(System.in);
        System.out.print("tekan *enter untuk melanjutkan ");
        enter.nextLine();
    }
}

public class SortUser {
    
    public double[] getTotalBayar(String[][] user) {
        int n = user.length;
        double[] total = new double[n];

        for (int i = 0; i < n; i++) {
            total[i] = Double.parseDouble(user[i][5]);
        }
        return total;
    }

    public void sortAsc(String[][] user, double[] total2) {
        int n = total2.length;
        double tempTotal;
        String tempUser;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (total2[i] > total2[j]) {
                    tempTotal = total2[i];
                    total2[i] = total2[j];
                    total2[j] = tempTotal;
                    
                    for (int kolom = 0; kolom < n; kolom++) {
                        tempUser = user[i][kolom];
                        user[i][kolom] = user[j][kolom];
                        user[j][kolom] = tempUser;
                    }
                }
            }
        }
        for (int loop = 0; loop < n; loop++) {
            user[loop][5] = String.valueOf(total2[loop]);
        }
    }

    public void sortDesc(String[][] user, double[] total) {
        int n = total.length;
        double tempTotal;
        String tempUser;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (total[i] < total[j]) {
                    tempTotal = total[i];
                    total[i] = total[j];
                    total[j] = tempTotal;
                    
                    for (int kolom = 0; kolom < n; kolom++) {
                        tempUser = user[i][kolom];
                        user[i][kolom] = user[j][kolom];
                        user[j][kolom] = tempUser;
                    }
                }
            }
        }
        for (int loop = 0; loop < n; loop++) {
            user[loop][5] = String.valueOf(total[loop]);
        }
    }

    public void viewSort(String[] header, String[][] user) {
        System.out.println("*======================================================================================*");
        System.out.println("|                         Hasil Sorting Data Penyewaan Warnet                          |");
        System.out.println("|======================================================================================|");
        for (int i = 0; i < user[0].length; i++) {
            System.out.print(String.format("| %10s  ", header[i]));
        }
        System.out.println(" |");
        System.out.println("|--------------------------------------------------------------------------------------|");
        for (int i = 0; i < user.length; i++) {
            System.out.print(String.format("| %13s ", "Komp/PC-" + user[i][0]));
            System.out.print(String.format("| %10s  ", user[i][1]));
            System.out.print(String.format("| %10s  ", user[i][2] + " menit"));
            for (int j = 3; j < user[0].length; j++) {
                System.out.print(String.format("| %10s  ", "Rp." + user[i][j]));
            }
            System.out.println(" |");
        }
        System.out.println("*--------------------------------------------------------------------------------------*");
    }
    
    public double pendapatan(double[] total) {
        double pendapatan = 0;
        for (int i = 0; i < total.length; i++) {
            pendapatan += total[i];
        }
        return pendapatan;
    }
    
    public void printPendapatan(String[] header , String[][] user , double pendapatan) {
//        String penghasilan = String.valueOf(pendapatan);
        System.out.println("*======================================================================================*");
        System.out.println("|                                Total Pendapatan Warnet                               |");
        System.out.println("|======================================================================================|");
        for (int i = 0; i < user[0].length; i++) {
            System.out.print(String.format("| %10s  ", header[i]));
        }System.out.println(" |");
        System.out.println("|--------------------------------------------------------------------------------------|");
        for (int i = 0; i < user.length; i++) {
            System.out.print(String.format("| %13s ", "Komp/PC-"+user[i][0]));
            System.out.print(String.format("| %10s  ", user[i][1]));
            System.out.print(String.format("| %10s  ", user[i][2]+" menit"));
            for (int j = 3; j < user[0].length; j++) {
                System.out.print(String.format("| %10s  ", "Rp."+user[i][j]));
            }
            System.out.println(" |");
        }
        System.out.println("|--------------------------------------------------------------------------------------|");
        System.out.println("|  Total Pendapatan Warnet Hari Ini                                       Rp."+pendapatan+"   |");
        System.out.println("*--------------------------------------------------------------------------------------*");
        
    }
    
}

public class SearchUser {

    public void search(String[][] user, String[] header) {
        Scanner input = new Scanner(System.in);
        System.out.print("Key pencarian : ");
        String key = input.next();
        int nKey = 99;
        boolean ketemu = true;
        
        if (ketemu == true) {
            for (int i = 0; i < user.length; i++) {
                for (int j = 0; j < user[0].length; j++) {
                    if (key.equalsIgnoreCase(user[i][j])) {
                        nKey = i;
                        System.out.println(">>> Data ditemukan pada kolom " + header[j] + "**");
                        System.out.println("*======================================================================================*");
                        System.out.println("|                             Hasil Searching Data Warnet                              |");
                        System.out.println("|======================================================================================|");
                        for (i = 0; i < user[0].length; i++) {
                            System.out.print(String.format("| %10s  ", header[i]));
                        }
                        System.out.println(" |");
                        System.out.println("|--------------------------------------------------------------------------------------|");
                        System.out.print(String.format("| %13s ", "Komp/PC-" + user[nKey][0]));
                        System.out.print(String.format("| %10s  ", user[nKey][1]));
                        System.out.print(String.format("| %10s  ", user[nKey][2] + " menit"));
                        for (j = 3; j < user[0].length; j++) {
                            System.out.print(String.format("| %10s  ", "Rp." + user[nKey][j]));
                        }
                        System.out.println(" |");
                        System.out.println("|--------------------------------------------------------------------------------------|");
                        break;
                    }
                }
            }
            ketemu = false;
            
        }
        if (nKey==99) {
            System.out.println(">>> Data Tidak Ditemukan**");
        }
    }
}


