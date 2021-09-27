import java.util.arrayList;

public class Obaida{
    public static void main(String[] args){
        ArrayList<Integer> mylist = new ArrayList<>();
        for(int i=0; i <= 100; i++){
            mylist.add(i);
        }

        mylist.add(3, 222);
        System.out.println(mylist);
    }
}