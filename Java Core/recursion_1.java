import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

class recursion_1{

    public static void main(String ...arg){
        ArrayList<Integer> list=new ArrayList<>();
        print(5);
        System.out.println(i);
        System.out.println(fact(5));   //fact(5) 5*fact(4) 4*fact(3) 3*fact(2) 2*fact(1) 1*fact(0)
        
        System.out.println(fib(5)); //linear recursive calls
        int arr[]={0,1,5,7,8,5};
        System.out.println(binary_search(arr,4,0,4)); // divide & conquer recursive calls

        System.out.println(check_sort(arr,0,5));

        System.out.println(linear_search(arr,-7,0,5));

        list=find_indexes(arr,5,0,list);
        System.out.println(list);

        int r_arr[]={5,8,9,0,3,4};
        System.out.println(bs_array(r_arr,4,0,5));

        System.out.println(sum_of_digits(7029));

        System.out.println(count_of_digits(7029));

        System.out.println(rev_num(7529));

        System.out.println(palindrome(12521,0,4));

        System.out.println(count(5788,7));

        
    }

    static int fact(int n){
        if(n==0)
        return 1;
        else
        return n*fact(n-1);
    }

    static void print(int n){
        if(n==1)
        return;
        else{
        print(n-1);
        System.out.println(n);
        }
    }

    static int fib(int n){
        if(n==0)
        return 0;
        else if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        return fib(n-1)+fib(n-2);
    }

    static int binary_search(int arr[],int key,int s,int e){
        if(s<=e){
        int mid=(s+e)/2;
        if(arr[mid]==key)
        return mid;
        else if(key>arr[mid])
        return binary_search(arr,key,mid+1,e);
        else 
        return binary_search(arr,key,s,mid-1);
        }
        else
        return -1;
    }

    static int check_sort(int arr[],int i,int n){
        if(i==n-1)
            return 1;
        if(arr[i]>arr[i+1])
            return -1;
        else
            return check_sort(arr,i+1,n);
    }

    static int i=0; //data is hidden 
    static boolean linear_search(int arr[],int key,int i,int n){
        if(i==n-1)
        return false;
        else
        return arr[i]==key || linear_search(arr,key,i+1,n);
    }

    static ArrayList<Integer> find_indexes(int arr[],int key,int index,ArrayList<Integer> list){
        if(index==arr.length)
        return list;
        if(arr[index]==key)
        list.add(index);

        return find_indexes(arr,key,index+1,list);
    }

    //binary search of rotated array
    static int bs_array(int arr[],int key,int s,int e){
        
        if(s>e)
        return -1;
        
        int mid=(s+e)/2;
        if(arr[mid]==key)
        return mid;
        else if(arr[mid]>arr[s]){
            if(key>=arr[s] && key<arr[mid])
            return binary_search(arr,key,s,mid-1);   
            else{
                while(!(arr[mid]<arr[e])){
                    mid++;
                    if(arr[mid]==key)
                    return mid;
                }
                if(key>arr[mid] && key<=arr[e])
                return binary_search(arr,key,mid+1,e);  
            }
        }
        else if(arr[mid]<arr[e]){
            if(key>=arr[s] && key<arr[mid])
            binary_search(arr,key,s,mid-1);   
            else{
                while(!(arr[mid]<arr[e])){
                    mid++;
                    if(arr[mid]==key)
                    return mid;
                }
                if(key>arr[mid] && key<=arr[e])
                return binary_search(arr,key,mid+1,e);  
            }
        }
        return -1;
    }

    static int sum_of_digits(int num){
        if(num==0)
        return 0;
        else
        return num%10+sum_of_digits(num/10);
    }

    static int count_of_digits(int num){
        if(num<10)
        return 1;
        else
        return 1+count_of_digits(num/10);
    }
    static int power(int x,int y){
        if(y==0)
        return 1;
        else
        return x*power(x,y-1);
    }
    static int rev_num(int num){
        int c=power(10,count_of_digits(num)-1);
        if(num<10)
        return num;
        else
        return (num%10)*c+rev_num(num/10);
    }

    static boolean palindrome(int num,int s,int e){
        if(num<10)
        return true;
    
        if(s<e && (num/power(10,e))%10==(num%power(10,s+1))/power(10,s)){
            System.out.println((num/power(10,e)%10)+"    "+(num%power(10,s+1))/power(10,s));
            return palindrome(num,s+1,e-1);
        }
        else if(s==e)
        return true;

        return false;//if num>10 and it fails in unequal of digits
    }

    static int count(int num,int digit){
       //(b=num<10 && num==digit)? return 1:return 0; compiled error
        if(num<10 && num==digit)
        return 1;
        else if(num<10 && num!=digit)
        return 0;
        if(num%10==digit)
        return 1+count(num/10,digit);
        
        return 0+count(num/10,digit);
    }

}