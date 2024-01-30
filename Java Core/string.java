import java.lang.*;
import java.util.*;

class string{
    static String String_rev(String str){
        str="kkr";
        return str;
        //return str.substring((str.length())-1,-1);
    }
    public static void main(String[] args){
        String str=new String("a");
        System.out.println(str);
        System.out.println(str.matches(".")); //any character length 1
        System.out.println(str.matches("[abc]")); // one char with given setc
        System.out.println(str.matches("[^abc]")); // one char not in given set
        System.out.println(str.matches("[abc][td]")); // one char with given set
        System.out.println(str.matches("[a-z][0-9]"));// one character in set a-z
        System.out.println(str.matches("\\d")); // digits
        System.out.println(str.matches("\\D")); // not digits
        System.out.println(str.matches("\\s")); // space
        System.out.println(str.matches("\\S")); // not space
        System.out.println(str.matches("\\w")); // alphabets or digit
        System.out.println(str.matches("\\W")); // not alphabet or digit
        System.out.println(str.matches("string")); 

        //quantifiers
        System.out.println("quantifiers");
        System.out.println(str.matches("[a-z]*")); // 0 or more times  
        System.out.println(str.matches("\\d+")); // 1 or more times 
        System.out.println(str.matches("[a-z]?")); // 0 or 1 time  
        System.out.println(str.matches("[a-z]{5}")); // {x} length
        System.out.println(str.matches("[a-z]{1,10}")); // {x,y} length


        
    }
}