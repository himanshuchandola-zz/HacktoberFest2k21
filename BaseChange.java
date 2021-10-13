//coded by shreeyachatzz
//Menu driven program to change from decimal to any base or any base to decimal or any base to any base.All te functions in recursive  manner
 import java.util.*;
class bchange
{// recursive function to change from deci to any base
    String decitoany(int no,int b,String res)
    {
        if (no!=0)
        {
            int d=no%b;
            if (d>=10)
            {char ch=(char)(55+d);
            
            return decitoany(no/b,b,ch+res);
        }
        else
        return decitoany(no/b,b,d+res);
        }
       
        else 
        return res;
    }
    //Any base to decimal in recursive manner
    int Anytodeci(String num,int b,int res,int p)
    {int d=0;
        if (p<num.length())
        {
           char ch=num.charAt(num.length()-1-p);
           if (ch>='0' && ch<='9')
           d =ch-48;
           else
           d=ch-55;
           return  Anytodeci(num,b,res+d*(int)(Math.pow(b,p)),p+1);
        }
        else return res;
    } 
    
    
    
    public static void main()
    {Scanner sc=new Scanner(System.in);
        bchange ob=new bchange();int ch=0;
        do
        {
        System.out.println("press 1 to change  from decimal to any base");
        System.out.println("press 2 to change  from any base  to decimal");
        System.out.println("press 3 to change  from any base  to any base");
        System.out.println("press 4 to exit from program");
        System.out.println("enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Enter the decimal number,required base(2/8/16)");
            int nu=sc.nextInt();
            int rb=sc.nextInt();
        String r=ob.decitoany(nu,rb,"");
        System.out.println(nu+"in base  "+rb+"="+r);
        break;
        case 2:System.out.println("Enter the number,existing base");
        String nam=sc.next();
        int eb=sc.nextInt();
        int fr=ob.Anytodeci(nam,eb,0,0);
        System.out.println(nam+"in decimal="+fr);
        break;
        case 3:
        System.out.println("Enter the number ,existing base,desired base");
        String na=sc.next();
        int ebas=sc.nextInt();
        int  db=sc.nextInt();
        int r1=ob.Anytodeci(na,ebas,0,0);
        String re=ob.decitoany(r1,db,"");
        System.out.println(na+" in base: "+ebas+"= "+re+" in "+db);
        break;
        case 4:
       System.exit(0);
    }
}while(ch<=3);
        
 }   
    
    
    

}
/*output
press 1 to change  from decimal to any base
press 2 to change  from any base  to decimal
press 3 to change  from any base  to any base
press 4 to exit from program
enter your choice
1
Enter the decimal number,required base(2/8/16)
234
16
234in base  16=EA
press 1 to change  from decimal to any base
press 2 to change  from any base  to decimal
press 3 to change  from any base  to any base
press 4 to exit from program
enter your choice
2
Enter the number,existing base
123
8
123in decimal=83
press 1 to change  from decimal to any base
press 2 to change  from any base  to decimal
press 3 to change  from any base  to any base
press 4 to exit from program
enter your choice
3
Enter the number ,existing base,desired base
5A
16
2
5Ain base:16=1011010 in 2
press 1 to change  from decimal to any base
press 2 to change  from any base  to decimal
press 3 to change  from any base  to any base
press 4 to exit from program
enter your choice
4
*/
