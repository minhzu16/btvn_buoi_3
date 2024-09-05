package mylinkedlist;

public class LinkedList {
    private Node head;
    private int size = 0; // To keep track of the size of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void add(int data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public int length() {
        return size;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public void deleteLast() {
        if (head == null) {
            return; // Empty list
        }

        if (head.next == null) {
            head = null; // Only one element
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null; // Remove last node
        }
        size--;
    }
    // BTVN1: Viết hàm delete theo while. Hint: dùng count++;
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            deleteFirst();
        } else if (index == size - 1) {
            deleteLast();
        } else {
            int count = 0;
            Node preNodeDelete = head;
            while (count < index - 1) {
                preNodeDelete = preNodeDelete.next;
                count++;
            }
            preNodeDelete.next = preNodeDelete.next.next;
            size--;
        }
    }

    /*public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        int element;
        if (index == 0) {
            element = head.data;
            deleteFirst();
        } else if (index == size - 1) {
            element = searchAtPosition(size - 1).data;
            deleteLast();
        } else {
            Node current = head;
            Node previous = null;
            int count = 0;
            while (count != index) {
                previous = current;
                current = current.next;
                count++;
            }
            element = current.data;
            previous.next = current.next;
            size--;
        }
        return element;
    }*/

    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Node searchAtPosition(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    // BTVN2: Viết cho anh hàm sort()
    public void sort() {
        if (head == null || head.next == null) {
            System.out.println("không đủ phần từ để swap");
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // BTVN3:Giải thích tại sao khi a dùng for (int i = 0; i <= index; i++) { temp = temp.next; } thì temp nó là node tại vị trí index
    // còn nếu anh dùng ntn: for (int i = 0; i < index; i++){ temp = temp.next; } thì temp nó là node trước vị trí index ?
    //do giá trị  đoạn code đầu con ch sẽ chạy đến vị trí index còn đoạn code thứ 2 chỉ chạy đến phần tử ứng trước index




}
