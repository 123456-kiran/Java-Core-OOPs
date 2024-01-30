import java.lang.*;
import java.util.*;

public class basics{

	public static int power(int b,int p){
		if(p==0)
		return 1;
		else
		return b*power(b,p-1);
	}
	
	public static void main(String args[]){
		//input & output varaibles
		
		Scanner obj =new Scanner(System.in);
		byte b=5;
		System.out.println(b);
		System.out.println(Byte.SIZE);
		
		short s=7;
		System.out.println(s);
		System.out.println(Short.SIZE);
		
		int a=-2147483648;
		//a=obj.nextInt();
		System.out.println(a);
		System.out.println(Integer.SIZE);
		
		long l=-2147483649l;
		System.out.println(l);
		System.out.println(Long.SIZE);
		
		float f=5;
		//b=obj.nextFloat();
		System.out.println(f);
		System.out.println(Float.SIZE);
		
		double d=5;
		System.out.println(d);
		System.out.println(Double.SIZE);
		
		boolean bl=true;
		System.out.println(bl);
		
		char ch='a';
		System.out.println(ch);
		//System.out.println(Char.SIZE);
		
		char i;
		//for(i=0;i<506;i++)
		//System.out.print(i + " ");
		
		//operators
		
		//arithmetic + - * / %
		
		//relational > < <= >= == !=
		
		//logical && || !
		
		//assignment += -= *= ....
		
		//bitwise & | ~ ^ >> >>> <<
		System.out.println("");
		
		int x,y;
		x=obj.nextInt();
		y=obj.nextInt();
		System.out.println("binary operations on "+x +" & "+y);
		System.out.println("");
		System.out.println("x&y "+ (x&y)); // return x if x==y
		System.out.println("x|y "+(x|y)); //adiition of x y
		System.out.println("~x "+(~x)); // 0-1 1-0  ~x => -x-1
		System.out.println("x^y "+(x^y)); // 0 1 -1   0 1 -1 
		System.out.println("x>>y "+(x>>y)); // x/2^y 1st byte not disturbed (sign not changed)
		System.out.println("x>>>y "+(x>>>y)); // 1st bit also moved right (sign changed)
		System.out.println("x<<y "+(x<<y)); // x * 2^y
		
		System.out.println("");
		int res;
		System.out.println("no of students");
		x=obj.nextInt();
		if(x<32){
			res=0;
			int c;
			System.out.println("Enter true ->present / false-> absent");
			for(c=0;c<x;c++){
				System.out.println(c +" : ");
				bl=obj.nextBoolean();
				if(bl)
				res = res | (power(2,c));
			}
			for(c=0;c<x;c++){
				if((res & power(2,c))==power(2,c))
				System.out.println(c+" is present");
				else
				System.out.println(c+" is absent");
			}
		}	
		
		
	
	}
}
