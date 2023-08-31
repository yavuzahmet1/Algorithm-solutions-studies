import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    public void printList() {
        Node head = null;
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}