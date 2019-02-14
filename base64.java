import java.io.*;
import java.util.Scanner;
class base64
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        char ch[]=new char[64];
        char x=' ';
        int cont=1;
        while(cont!=0)
        {
            System.out.println("enter a no.");
        int n=sc.nextInt();
        for(int i=0,j=48,k=55,l=61;i<=63;i++,j++,k++,l++)
        {
            
            if(i<10)
            {
                x=(char)j;
                ch[i]=x;
                
            }
            else if(i<36)
            {
                x=(char)k;
                ch[i]=x;
            }
            else if(i<62)
            {x=(char)l;
                ch[i]=x;
            }
            else if(i==62)
            {ch[i]='-';
            }
            else
            {
            ch[i]='_';
            }
        }
            int rem;
        int q;
        int m=n;
        String s="";
                while(m!=0)
        {
            q=m/64;
            rem=m%64;
            m=m/64;
            s=ch[rem]+s;
        }
        System.out.println(s);
        System.out.println("Do you want to continue?enter 0 for no,Any other no for yes");
        cont =sc.nextInt();
    }
}
}