import java.util.*;

public class sorting {

    static int max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
        if(arr[i]>max)
        max=arr[i];
        }
        return max;
    }
    //step 1: find max in arr and create count arr with max+1 size
    //step 2: traverse arr and increment in count arr count[arr[i]]++
    //step 3: traverse count array indexes
    //step 4: copy that indexes as values in original arr acc to count[i]

    static void count_sort(int arr[]){
        int max=max(arr);
        int count_array[]=new int[max+1];
        
        for(int i=0;i<arr.length;i++){
            count_array[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count_array.length;i++){
            for(int j=0;j<count_array[i];j++)
            arr[k++]=i;
        }
    }

    //like as insertion sort but in between sub-arrays
    //step 1: create gap for length of subarray 
    //step 2: loop gap : n/2 to 1
    //step 3: loop i : 0 to gap
    //step 4: compare and swap in both sub arrays arr[i] arr[i+gap]
    static void shell_sort(int arr[]){
        for(int gap=arr.length/2;gap>0;gap=gap/2){
            for(int i=gap;i<arr.length;i++){
                int t=arr[i];
                int j=i-gap;
                while(j>=0 && arr[j]>t){
                    arr[i]=arr[j];
                    j=j-gap;
                }
                arr[j+gap]=t;
            }
        }
    }

    static int count_of_digits(int num){
        int c=0;
        while(num!=0){
            c++;
            num=num/10;
        }
        return c;
    }
    static int power(int x,int y){
        if(y==0)
        return 1;
        else
        return x*power(x,y-1);
    }
    static void radix_sort(int arr[]){
        int max_len=count_of_digits(max(arr));
        int c=power(10,max_len-1);
        for(int i=0;i<max_len;i++){
            int count[]=new int[10];
            for(int j=0;j<arr.length;j++){
                count[arr[j]%c]=arr[j];
            }
            c=c/10;
        }
    }

    

    public static void main(String ...a){
        int arr1[]={5,9,7,0,2,1};
        System.out.println(Arrays.toString(arr1));
        count_sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int arr2[]={10,8,6,5,3,2,1};
        System.out.println(Arrays.toString(arr2));
        shell_sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
