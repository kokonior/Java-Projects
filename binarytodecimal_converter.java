import java.io.*;
class binarytodecimal {
    static int binaryToDecimal(int n)
    {
        int num = n;
        int dec_value = 0;
 
        int base = 1;
 
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
 
        return dec_value;
    }
 

    public static void main(String[] args)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int num1=0;
        System.out.println("Enter a binary number:");
        num1=Integer.parseInt(in.readLine());
        System.out.println(binaryToDecimal(num1));
    }
}
 
