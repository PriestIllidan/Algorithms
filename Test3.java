public class Test3 {
    public static void main(String[] args) {
        LinkedList testList = new LinkedList();
        testList.addFirst(2);
        testList.addFirst(8);
        testList.addFirst(7);
        testList.addFirst(5);
        testList.addFirst(10);

        testList.printAll();

        testList.revert();
        testList.printAll();
    }
}
