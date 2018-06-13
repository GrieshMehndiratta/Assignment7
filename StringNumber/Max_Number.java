import java.util.Scanner;

class Max_Number
{
    static int Maximum(String str)
    {
        int num = 0;
        int S;
        int max=0;
      
        for (int i = 0; i<str.length(); i++)
        {
        	S=str.charAt(i);
            if (S>=48 && S<=57)
                num = num * 10 + (S-48) ;
            else
            {
            	//System.out.println(num);
                if(max<num)
                	max=num;
                num = 0;
            }
            if(max<num)
            	max=num;
           // System.out.println(str.charAt(i));
        }
        return max;
    }
    public static void main(String[] args) 
    {
    	String str;
    	Scanner sc=new Scanner(System.in);
    	str=sc.nextLine();
    	sc.close();
    	System.out.println(Maximum(str));
    }    
}