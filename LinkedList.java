public class LinkedList {
    private Node head;

    private class Node {
        private int data;
        private Node nextNode;
    }

    public void addFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head != null) {
            newNode.nextNode = head;
        }
        head = newNode;
    }

    public void revert() {
        Node before = null; // заводим пустой указатель
        while (head != null) {
            Node after = head.nextNode; // зводим временный указатель
            head.nextNode = before;
            before = head;
            head = after;
        }
        head = before;
    }

    public void printAll() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.nextNode;
        }
        System.out.println("null");
    }


}
