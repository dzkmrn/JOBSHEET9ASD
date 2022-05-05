package Tugas2;

public class SLLMain {
    public static void main(String[] args) {
        singlelinkedlist singLL = new singlelinkedlist();
        
        singLL.print();
        singLL.addFirst("a");
        singLL.print();
        singLL.addLast("e");
        singLL.print();
        singLL.insertAfter("a", "b");
        singLL.print();
        singLL.insertAt(2, "c");
        singLL.print();
        singLL.insertBefore("e", "d");
        singLL.print();
        
        }
}
