import java.util.*;

public class methods {

    static int data=78;
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        method();//invoke or call a func
        
        //By passing actual parameters - passing by value
        String name=obj.next();
        System.out.println("enter name");
        greet(name);

        System.out.println("enter two num");
        int a=obj.nextInt(),b=obj.nextInt();
        System.out.println(sum(a,b)); // func return value

        //passing of primitives - copy of integrals of actual to formal parameters
        //No impact in actual parameters after func excution
        pri_update(a);
        System.out.println("after update "+a);

        //passing of objects/strings - copy of address of object / string
        //There is a chance of modification of data in object
        int arr[]=new int[5];
        obj_update(arr,5);
        System.out.println("after update of array");
        for(int x:arr)
        System.out.print(x+" ");
        System.out.println("");

        //strings are immutable can't be modified
        obj_update(name);
        System.out.println("after update "+name);

        //wrapper classes objects

        //block
        {
            int k=5; //k can be accesse only in block 
            // but you can access / modify outer variables to this block
        }

        System.out.println(data);
        //int data=5; //higher level scope of data is hidden
        int data;
        data=6; //scope when after initialization now onwards class var hidden
        System.out.println(data);
        shadowing();
        
        fun(5,8,9,6,1);
        fun();
        fun("names","kiran","kumar","roy","asapu");

        //method overloading - can create same functions with difference in  typeof  parameters or no.of paramters
        //func calls acc to given actual parameters     - obj_update() , fun()

        //ambiguity in method overloading
        //over(); //can't be empty when two func are defined with variable parameters
        //over("names","kiran","kumar"); can't decide with equal parameters which one to call gives error

    }

    //method
    /*return_type func_name(par..){
        statements....
        return ;
    }*/

    static void shadowing(){
        System.out.println(data);
    }

    static void method(){
        System.out.println("method called");
    }

    static void greet(String name){
        System.out.println("welcome "+name);
    }

    static int sum(int a,int b){
        return a+b;
    }

    static void pri_update(int a){
        a=6;
    }

    static void obj_update(String a){
        a="kiran"; //new obj created 
    }

    static void obj_update(int a[],int n){
        for(int i=0;i<n;i++)
        a[i]=i;
    }

    //variable length parameters 
    static void fun(int ...par){
        System.out.println(Arrays.toString(par));
    }
    static void fun(String str,String ...strs){
        System.out.print(str+" : ");
        System.out.println(Arrays.toString(strs));
    }

    static void over(String ...str){
        System.out.println(Arrays.toString(str));
    }

    static void over(String str,String ...strs){
        System.out.print(str+" : ");
        System.out.println(Arrays.toString(strs));
    }

    static void over(int ...i){
        System.out.println(Arrays.toString(i));
    }


}
