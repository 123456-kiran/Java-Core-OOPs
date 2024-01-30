import java.util.*;
class practise_1{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);

        //Email valid
        String gmail;
        System.out.println("Enter email");
        gmail=obj.next();
        boolean b=gmail.endsWith("@gmail.com");
        if(b){
            System.out.println(gmail+" is valid");
            int c=gmail.indexOf('@'),d=gmail.indexOf('.');
            System.out.println("username is "+gmail.substring(0,c));
            System.out.println("domain is "+gmail.substring(d+1,gmail.length()));
        }
        else{
            System.out.println(gmail+" is not valid");
        }

        String bin,hexa,dob;
        System.out.println("Enter binary code");
        bin=obj.next();
        System.out.println(bin.matches("[01]*"));

        System.out.println("Enter hexa code");
        hexa=obj.next();
        System.out.println(hexa.matches("[0-9A-F]*"));

        /*System.out.println("Enter dob dd/mm/yyyy");
        dob=obj.next();
        System.out.println(dob.matches("[0-3][0-9][/][01][0-9][/][0-9]{4}"));*/

        






        
    }
}
