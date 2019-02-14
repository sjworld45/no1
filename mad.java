import java.io.*;
import java.util.Scanner;
class mad
{
    char ch[];
    int n;
    String s;
    mad()
    {
      s="";
    }
    void input()
    {
    System.out.println("enter a no.");
    
}   
void arraych()
{
    char x=' ';
    ch=new char[64];
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
}

public void convert(int n)
{            int rem;
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
    }
    public void display()
    {
        System.out.println(s);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        mad sj=new mad();
        sj.input();
        int a=sc.nextInt();
        sj.arraych();
        sj.convert(a);
        sj.display();
    }
        
    }
