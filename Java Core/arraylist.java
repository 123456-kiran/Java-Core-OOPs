import java.util.*;

public class arraylist {
    public static void main(String ...arg){
        Scanner obj=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list=new ArrayList<>(5);    //wrapper classes
        for(int x=0;x<5;x++){
            list.add(obj.nextInt());
        }
        for(int x:list)
            System.out.print(x+"    ");

        System.out.println();
        System.out.println(list);

        //builtin methods
        System.out.println(list.contains(5)); //returns true or false
        list.set(0,56); // add value at index
        list.remove(0); // remove value at index
        System.out.println(list.get(3));   //get value at index

        //multi arraylist
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();

        //creating individual arraylist objects
        for(int i=0;i<3;i++)
        lists.add(new ArrayList<>());
        System.out.println(lists);

        for(ArrayList<Integer> x:lists){
            for(int y=0;y<3;y++){
                x.add(4);
            }
        }
        System.out.println(lists);

        update(list);
        System.out.println(list);

    }

    static void update(ArrayList<Integer> list){
            for(int y=0;y<10;y++){
                list.set(y,0);
            }
    }  
}
