import java.util.arrayList;

public class Obaida{
    public static void main(String[] args){
        ArrayList<Integer> mylist = new ArrayList<>();
        for(int i=0; i <= 100; i++){
            mylist.add(i);
        }

        mylist.add(3, 222);
        System.out.println(mylist);
    
        public boolean leniar_search(int x){
        for(int i=0; i <= mylist.length ; i++){
                if(mylist[i] == x){
                    return i;
                }
            }
            return false;
        }

        System.out.println(mylist.indexOf(10)); // return index item
        System.out.println(mylist.indexOf(300)); // return -1
    }
}