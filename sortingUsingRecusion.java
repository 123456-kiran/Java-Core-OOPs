import java.util.*;
import java.lang.*;

class Sorting{

    public static void main(String ...arg){
       /* fun(4,0);

        int arr[]={5,2,9,4,0};
        b_s(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int arr2[]={9,0,1,7,2,3};
        s_s(arr2,arr2.length-1,1,0);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        int arr3[]={9,3,1,2,0,4};
        arr3=merge_sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println();*/

        int arr4[]={5,7,1,2,0};
        System.out.println("quick sort");
        System.out.println(Arrays.toString(arr4));
        quickSort(arr4,0,arr4.length-1);
        System.out.println();



    }

    static void fun(int r,int c){
        if(r==0)
        return ;
        if(c<r){
        System.out.print("*");
        fun(r,c+1);
        //System.out.print("*");
        }
        else{
        System.out.println();
        fun(r-1,0);
        // System.out.println();
        }
    }

    static void b_s(int arr[],int r,int c){
        if(r==0)
        return ;

        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            b_s(arr,r,c+1);
        }
        else{
            System.out.println(Arrays.toString(arr));
            b_s(arr,r-1,0);
        }
    }

    static void s_s(int arr[],int r,int c,int max_index){
        if(r==0)
        return ;

        if(c<r){
            if(arr[max_index]>arr[c])
            s_s(arr,r,c+1,max_index);
            else
            s_s(arr,r,c+1,c);
        }
        else{
            int temp=arr[max_index];
            arr[max_index]=arr[c];
            arr[c]=temp;
            System.out.println(Arrays.toString(arr));
            s_s(arr,r-1,0,0);
        }
    }

    //int[] merge_sort(int arr[])
    //step 1: split array into two arrays with (mid = arr.length/2)
    //step 2: create sub-arrays and pass original array values in left[] & right[] acc to mid 
    //step 3: call merge_sort() and pass sub-arrays recursively to be partitioned and sorted accordingly
    //step 4: merge left[] and right[] arrays in order
    static int[] merge_sort(int arr[]){
        if(arr.length==1)
        return arr;

        System.out.println(Arrays.toString(arr));
        int mid=arr.length / 2;
        int left[]=merge_sort(Arrays.copyOfRange(arr,0,mid));
        int right[]=merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return merge(left,right);
    }

    static int[] merge(int p1[],int p2[]){
        int m[]=new int[p1.length+p2.length];
        int i=0,j=0,k=0;
        while(i<p1.length && j<p2.length){
            if(p1[i]<p2[j])
            m[k++]=p1[i++];
            else if(p2[j]<p1[i])
            m[k++]=p2[j++];
            else{
            m[k++]=p1[i++];
            m[k++]=p2[j++];
            }
        }
        while(i<p1.length)
        m[k++]=p1[i++];

        while(j<p2.length)
        m[k++]=p2[j++];

        return m;
    }

    //void quickSort(int a[],int low,int high)
    //step 1:take pivot as last value pivot=a[high] and To know the current position to pivot let i=low-1   
    //step 2:traverse all array upto high j : low -> high 
    //step 3:if (a[j]<pivot) i++ and swap arr[i] arr[j] to put small elemnts than pivot in left side
    //step 4:swap pivot at correct position of i+1 and that element to high
    static void quickSort(int arr[],int low,int high){
        //stop when the array size 1
        if(arr.length==1)
        return ;
        
        if(low<high){
        int i=low-1; //set i to -1 to know pivot inserting index initially
        int pivot=arr[high];
        System.out.println("low high pivot :"+low +" "+high +" "+pivot);
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++; //to know no of elements are smaller than pivot
                if(i==j)
                continue;
                //swap arr[i] arr[j] to place small values than pivot in left side of array
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        //swap pivot value at correct position
        int t=arr[i+1];
        arr[i+1]=pivot;
        arr[high]=t;
        System.out.println(Arrays.toString(arr));

        quickSort(arr,low,i);
        quickSort(arr,i+2,high);
        }
    }

}
