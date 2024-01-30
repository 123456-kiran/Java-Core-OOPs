import java.lang.*;
import java.util.*;

public class array_of_objects{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);

        String str[]=new String[5]; // stores null in objects as default
        System.out.println(Arrays.toString(str));

        //collect names in class
        System.out.print("enter no of students ");
        int no=obj.nextInt();
        String names[]=new String[no];
        for(int x=0;x<names.length;x++){
           names[x]=obj.next();
        }
        for(String s:names){
            System.out.print(s+"    ");
        }

        



        
    }
}
