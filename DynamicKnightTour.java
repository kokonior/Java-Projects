import java.util.Scanner;
import java.io.*;
import java.math.*;

public class KnightTour {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int board[][];
        board = new int [8][8];
        board[0][0]= 1 ;
        System.out.println("selamat datang di simulasi kuda catur");
        System.out.println("kuda berawal pada board[0][0]");
        double mgkjalankuda;
        int k=0;
        int tempat1=0;
        int tempat2=0;
        int simpan1=0;
        int simpan2=0;
        int waktu=0;
        boolean ntfull=true;
        boolean bisa;
        int r;
        while(k==0){
            r=0;
            while(r==0){
            mgkjalankuda=Math.random();
            ntfull= true;
            if(mgkjalankuda<0.125 && ntfull){
                board[tempat1][tempat2]=-1;
                simpan1=tempat1+3;
                simpan2=tempat2+1;
                if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                    if(board[simpan1][simpan2]!=-1){
                        waktu++;
                        tempat1=simpan1;
                        tempat2=simpan2;
                        board[tempat1][tempat2]=1;
                        ntfull=false;
                        r=1;
                    }
                }
            }
            else if(mgkjalankuda<0.250 && ntfull){
                board[tempat1][tempat2]=-1;
                simpan1=tempat1+3;
                simpan2=tempat2-1;
                if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                    if(board[simpan1][simpan2]!=-1 ){
                        waktu++;
                        tempat1=simpan1;
                        tempat2=simpan2;
                        board[tempat1][tempat2]=1;
                        ntfull=false;
                        r=1;
                    }
                }
            }
            else if(mgkjalankuda<0.375 && ntfull){
                board[tempat1][tempat2]=-1;
                simpan1=tempat1-3;
                simpan2=tempat2+1;
                if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                    if(board[simpan1][simpan2]!=-1 ){
                        waktu++;
                        tempat1=simpan1;
                        tempat2=simpan2;
                        board[tempat1][tempat2]=1;
                        ntfull=false;
                        r=1;
                    }
                }
            }
            else if(mgkjalankuda<0.500 && ntfull){
                board[tempat1][tempat2]=-1;
                simpan1=tempat1-3;
                simpan2=tempat2-1;
                if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                    if(board[simpan1][simpan2]!=-1 ){
                        waktu++;
                        tempat1=simpan1;
                        tempat2=simpan2;
                        board[tempat1][tempat2]=1;
                        ntfull=false;
                        r=1;
                    }
                }
            }
            else if(mgkjalankuda<0.625 && ntfull){
                board[tempat1][tempat2]=-1;
                simpan1=tempat1+1;
                simpan2=tempat2+3;
                if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                    if(board[simpan1][simpan2]!=-1 ){
                        waktu++;
                        tempat1=simpan1;
                        tempat2=simpan2;
                        board[tempat1][tempat2]=1;
                        ntfull=false;
                        r=1;
                        
                    }
                }
            }
            else if(mgkjalankuda<0.750 && ntfull){
                board[tempat1][tempat2]=-1;
                simpan1=tempat1+1;
                simpan2=tempat2-3;
                if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                    if(board[simpan1][simpan2]!=-1 ){
                        waktu++;
                        tempat1=simpan1;
                        tempat2=simpan2;
                        board[tempat1][tempat2]=1;
                        ntfull=false;
                        r=1;
                    }
                }
            }
            else if(mgkjalankuda<0.875 && ntfull){
                board[tempat1][tempat2]=-1;
                simpan1=tempat1-1;
                simpan2=tempat2+3;
                if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                    if(board[simpan1][simpan2]!=-1 ){
                        waktu++;
                        tempat1=simpan1;
                        tempat2=simpan2;
                        board[tempat1][tempat2]=1;
                        ntfull=false;
                        r=1;
                    }
                }
            }
            else if(mgkjalankuda<1 && ntfull){
                board[tempat1][tempat2]=-1;
                simpan1=tempat1-1;
                simpan2=tempat2-3;
                if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                    if(board[simpan1][simpan2]!=-1 ){
                        waktu++;
                        tempat1=simpan1;
                        tempat2=simpan2;
                        board[tempat1][tempat2]=1;
                        ntfull=false;
                        r=1;
                        }
                    }
                }
                
            }
            
            
            simpan1=tempat1+3;
            simpan2=tempat2+1;
            if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j]==-1){
                        if(board[i][j]!=board[simpan1][simpan2]){
                            ntfull=true;
                        }
                    }
                }
            }
            }
            
            simpan1=tempat1+3;
            simpan2=tempat2-1;
            if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j]==-1){
                        if(board[i][j]!=board[simpan1][simpan2]){
                            ntfull=true;
                        }
                    }
                }
                }
            }
            
            simpan1=tempat1-3;
            simpan2=tempat2+1;
            if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j]==-1){
                        if(board[i][j]!=board[simpan1][simpan2]){
                            ntfull=true;
                        }
                    }
                }
                }
            }
            
            simpan1=tempat1-3;
            simpan2=tempat2-1;
            if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j]==-1){
                        if(board[i][j]!=board[simpan1][simpan2]){
                            ntfull=true;
                        }
                    }
                }
                }
            }
            
            simpan1=tempat1+1;
            simpan2=tempat2+3;
            if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j]==-1){
                        if(board[i][j]!=board[simpan1][simpan2]){
                            ntfull=true;
                        }
                    }
                }
                }
            }
            
            simpan1=tempat1+1;
            simpan2=tempat2-3;
            if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j]==-1){
                        if(board[i][j]!=board[simpan1][simpan2]){
                            ntfull=true;
                        }
                    }
                }
                }
            }
            
            simpan1=tempat1-1;
            simpan2=tempat2+3;
            if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j]==-1){
                        if(board[i][j]!=board[simpan1][simpan2]){
                            ntfull=true;
                        }
                    }
                }
                }
            }
            
            simpan1=tempat1-1;
            simpan2=tempat2-3;
            if((0<=simpan2 && simpan2<8) && (0<=simpan1 && simpan1<8)){
                for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j]==-1){
                        if(board[i][j]!=board[simpan1][simpan2]){
                            ntfull=true;
                        }
                    }
                }
                }
            }
            System.out.println("");
            System.out.println("------------------------------------------------------------");
            
            System.out.println("ini adalah giliran ke "+waktu);
            System.out.println("");
            System.out.println("sekarang kuda berada pada board["+tempat1+"]["+tempat2+"]");
            System.out.println("");
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j]==-1){
                        System.out.println("board["+i+"]["+j+"] sudah ditempati");
                    }
                }
            }
            System.out.println("------------------------------------------------------------");
            System.out.println("");
            if(ntfull==false){
                System.out.println("KUDA TAK BISA BERGERAK KAKAK");
                k=-1;
                }
        }
    }
}
