class base16
{
    public void main(int n)
    {
        int rem;
        int q;
        int m=n;
        char ch;
        String s="";
        while(m!=0)
        {
            q=m/16;
            rem=m%16;
            m=m/16;
            if(rem==0)
            {
                ch='0';
            }
            else if(rem==1)
            {
                ch='1';
            }
            else if(rem==2)
            {
                ch='2';
            }
            else if(rem==3)
            {
                ch='3';
            }
            else if(rem==4)
            {
                ch='4';
            }
            else if(rem==5)
            {
                ch='5';
            }
            else if(rem==6)
            {
                ch='6';
            }
            else if(rem==7)
            {
                ch='7';
            }
            else if (rem==8)
            {
                ch='8';
            }
            else if(rem==9)
            {
                ch='9';
            }
            else if(rem==10)
            {
                ch='A';
            }
            else if(rem==11)
            {
                ch='B';
            }
            else if(rem==12)
            {
                ch='C';
            }
            else if(rem==13)
            {
                ch='D';
            }
            else if(rem==14)
            {
                ch='E';
            }
            else
            {
                ch='F';
            }
            s=ch+s;
        }
        System.out.println(n+" in base 16 is "+s);
    }
}