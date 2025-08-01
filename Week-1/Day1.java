import java.util.*;
public class Day1
{
    public static int fun(int a, int b){
        if(a>0 && b>0 && a+b>0)return a+fun(a-2,b-2)+b;
        return a^b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //Q1...
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=0;
        if(x%w==0 || w%x==0)y++;
        else y+=10;
        System.out.println(y);
        
        
        //Q2...
        int a=1;
        int c=0;
        while(a<5){
            a+=2;
            c++;
        }System.out.println("count: " + c);
        System.out.println("a=" + a);
        
        
        //Q3...
        System.out.println(fun(8, 8));
        
        
        //Q4...
        int a1,b1;
        a1=3;
        b1=3;
        if((1^1)>0)a1=1;
        else b1=2;
        System.out.println(a1+b1);
        
        
        //Q5...
        int a2=2;
        int b2=2;
        for(int c2=2;c2<5;c2++){
            if(a2%2 < b2%3)a2=4%3;//a2=1
            else{
                if(5%3 > b2)a2=b2;
                b2=1;
            }
        }
        System.out.println(a2+b2);
    }
}