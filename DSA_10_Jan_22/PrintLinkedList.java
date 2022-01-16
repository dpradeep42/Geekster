package DSA_10_Jan_22;

class LinkedListNode {
    private int data;
    private LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int d) {
        data = d;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode n) {
        next = n;
    }
}

public class PrintLinkedList {
    public LinkedListNode head;

    public static void main(String[] args) {
        PrintLinkedList list = new PrintLinkedList();
        list.insertFront(1);
        list.insertFront(2);
        list.insertFront(3);
        System.out.println(list.toString());
    }

    public PrintLinkedList() {
        this.head = null;
    }

    public int removeFront() {
        if (head == null) {
            System.out.println("Empty list");
            return 0;
        } else {
            int temp = head.getData();
            head = head.getNext();
            return temp;
        }
    }

    public void insertFront(int data) {
        if (head == null) {
            head = new LinkedListNode(data);
        } else {
            LinkedListNode newNode = new LinkedListNode(data);
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void insertBack(int data) {
        if (head == null) {
            head = new LinkedListNode(data);
        } else {
            LinkedListNode newNode = new LinkedListNode(data);
            LinkedListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public int removeBack() {
        if (head == null) {
            System.out.println("Empty list");
            return 0;
        } else if (head.getNext() == null) {
            int temp = head.getData();
            head = null;
            return temp;
        } else {
            LinkedListNode current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            int temp = current.getNext().getData();
            current.setNext(null);
            return temp;
        }
    }

    public String toString() {
        String result = "";
        LinkedListNode current = head;
        while (current.getNext() != null) {
            result += current.getData();
            if (current.getNext() != null) {
                result += ", ";
            }
            current = current.getNext();
        }
        result += current.getData();
        return "Contents of the List: " + result;
    }

    public LinkedListNode getHead() {
        return head;
    }
}