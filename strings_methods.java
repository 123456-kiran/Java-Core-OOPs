import java.lang.*;
import java.util.*;

public class strings_methods{
	public static void main(String args[]){
		/*Scanner obj=new Scanner(System.in);
		String name=obj.next();//new String();
		System.out.println("enter string");
		//name=obj.next();
		System.out.println("enter char");
		char ch=obj.next().charAt(0);
		System.out.println(name);
		System.out.println(ch);
		
		String string="	Karan   "; //pool
		char c[]={'k','o','m'};
		byte b[]={65,66,67,68};
		String str1=new String("kumar");
		String str2=new String(b);
		String sub1=new String(b,2,1);
		String str3=new String(c);
		String sub2=new String(c,1,2);
		System.out.println(string+str1+str2+str3);*/
		
		//string methods
		String str=" aditya ";
		String sub="kiran";
		System.out.println(str);
		//System.out.println(str.reverse());
		System.out.println("length "+sub.length());
		System.out.println("lower "+str.toLowerCase());
		System.out.println("upper "+str.toUpperCase());
		System.out.println("trim "+str.trim());
		System.out.println("index "+str.indexOf("a"));
		System.out.println("from 3 "+str.indexOf("a",3));
		System.out.println("last "+str.lastIndexOf("a"));

		String sub1=str.substring(4);
		System.out.println(sub1);
		String sub2=str.substring(5,8);
		System.out.println(sub2);
		System.out.println(str.replace("di","sun"));
		System.out.println(str.startsWith(" "));
		System.out.println(str.endsWith(" "));
		System.out.println(str.compareTo(sub));
		System.out.println(str.isEmpty());
		System.out.println(str.equals(sub));
		//System.out.println(str==str1);
				
	}
}
