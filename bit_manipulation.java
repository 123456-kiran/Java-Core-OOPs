import java.util.*;

class bits{

    public static void main(String ...arg){
        int bin[]=new int[8];
        Scanner obj=new Scanner(System.in);
        int opt,pos,num;
        System.out.println("enter a number:");
        num=obj.nextInt();
        bin=intToBinary(num,bin);
        System.out.println(Arrays.toString(bin));
        System.out.printf("1.get\n2.set\n3.clear\n4.update\n");
        while(true){
        System.out.println("enter option");
        opt=obj.nextInt();
        
        switch(opt){
            case 1:
            pos=obj.nextInt();
            get(num,pos);
            break;
            case 2:
            pos=obj.nextInt();
            set(num,pos);
            System.out.println(num);
            break;
            case 3:
            pos=obj.nextInt();
            clear(num,pos);
            System.out.println(num);
            break;
            case 4:
            pos=obj.nextInt();
            System.out.print("enter bit ");
            int bit=obj.nextInt();
            update(num,pos,bit);
            System.out.println(num);
            break;
        }
        }
    }

    static int power(int x,int y){
        if(y==0)
            return x;
        else
            return x*power(x,y-1);
    }
    static void get(int n,int p){
        if(((n>>p) & 1) == 1)
        System.out.println(1);
        else
        System.out.println(0);
    }

    static void set(int n,int p){
        n=n | power(2,p-1);
        System.out.println(n);
    }

    static void clear(int n,int p){
        n=(n>>p) & 0;
        System.out.println(n);
    }

    static void update(int n,int p,int bit){
        if(bit==1)
        n=n | power(2,p-1);
        else
        n=(n>>p) & 0;
        System.out.println(n);
    }



    static int[] intToBinary(int num,int bin[]){
        int r,i=bin.length;
        while(num!=0){
            r=num%2;
            bin[i--]=r;
            num=num/2;
        }
        return bin;
    }

}