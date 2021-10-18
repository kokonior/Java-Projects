import java.util.*;
public class FpbKpk{
    public static void main(String[] args){
        Scanner chindy=new Scanner(System.in);
        int a=chindy.nextInt();
        int b=chindy.nextInt();
        chindy.close();
        int n,d,r;
        if(a<=b){
            n=b;
            d=a;
        }
        else{
            n=a;
            d=b;
        }
        r=n%d;

        while(r!=0){
            n=d;
            d=r;
            r=n%d;
        }

        if(r==0){int fpb=d;
            int kpk=(a*b)/fpb;
            System.out.println(fpb+","+kpk);}
    }
}
