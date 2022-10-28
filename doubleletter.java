import java.util.*;
class doubleletter
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        String str=s.toUpperCase();
        int count=0;
        int len=str.length();
        for(int i=0;i<len-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            count++;
        }
        System.out.println("the double letter sequence="+ count);
    }
}
            
        
        
        
    
            