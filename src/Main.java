
import mylinkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.addLast(7);
        linkedList.add(4, 3);

        linkedList.addFirst(8);
        linkedList.addFirst(9);
        linkedList.addFirst(10);

        System.out.println("Chuỗi:");
        linkedList.display();

        System.out.println("Chuỗi sau khi srt từ bé -> lớn :");
        linkedList.sort();
        linkedList.display();

        System.out.println("Chuỗi sau khi loại phần tử tại index 2:");
        linkedList.delete(1);
        linkedList.display();

        System.out.println("Độ dài chuỗi: " + linkedList.length());

        linkedList.deleteFirst();
        System.out.println("Chuỗi sau khi loại phần tử đầu:");
        linkedList.display();

        linkedList.deleteLast();
        System.out.println("Chuỗi sau khi loại phần tử cuối:");
        linkedList.display();

        //linkedList.remove(2); // Removing element at index 2
        //System.out.println("Chuỗi sau khi loại phần tử tại index 2:");
        //linkedList.display();


    }}