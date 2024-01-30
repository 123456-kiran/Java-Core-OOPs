import java.util.*;

public interface arrays {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=4;
        int arr[]=new int[n];//creating object for int[] array
        //for each loop just to access can't modify data in array
        for(int x:arr)
        System.out.print(x+" ");
        System.out.println("");

        System.out.println("multi dimensional ");
        int mat[][]=new int[n][n]; 
        // creating n objects for reference of n int[] arrays
        for(int x[]:mat){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }

        //The size of individual array or object size may be differ and can be modified
        //we can declare arrays with different sizes
        int mac[][]=new int[n][n]; //int mac[][]=new int[n][]; 
        mac[0]=new int[1];
        mac[2]=new int[7];
        mac[3]=new int[5];
        for(int x[]:mac){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        } 

        //array of array objects
        int arr[][]={
            {1,2}, //arr[0]
            {4,5}, //arr[1]
            {5,6,7} //arr[2]
        };
        //the individual array objects may be not continuous in heap memory

        for(int i[]:arr){
            for(int j:i){
                System.out.print(j+"    ");
            }
            System.out.println("");
        }

        System.out.println(Arrays.toString(arr)); //arr return heap memory address of individual objects
        for(int x[]:arr)
        System.out.println(Arrays.toString(x));

    }
}

