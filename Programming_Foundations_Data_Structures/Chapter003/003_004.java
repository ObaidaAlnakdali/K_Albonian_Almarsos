import java.util.LinkedList;

public class Obaida{
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList();

        //add 
        myLinkedList.add("Obaida", "Alnakdali");
        myLinkedList.addFirst(11, "aaa", "sss");
        myLinkedList.add("zzz", "zzz");
        myLinkedList.addLast("ggg", 22, "ggg");
        myLinkedList.add("qqq", "qqq");
        myLinkedList.add("nnn", "nnn");
        System.out.println(myLinkedList)

        //access
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.contains(11, "aaa", "sss"));

        //remove
        myLinkedList.remove(11, "aaa", "sss");
        myLinkedList.remove(1);
        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        System.out.println(myLinkedList)

    }
}