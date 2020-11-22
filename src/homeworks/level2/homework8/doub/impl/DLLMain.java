package homeworks.level2.homework8.doub.impl;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> dll = new DoubleLinkedList<Integer>();
        dll.addFirst(1);
        dll.addFirst(4);
        dll.addLast(6);
        dll.addLast(34);
        dll.iterateForward();
        dll.removeFirst();
        dll.removeLast();
        dll.iterateBackward();
    }
}
