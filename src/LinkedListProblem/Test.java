package LinkedListProblem;

public class Test {
    public static void main(String[] args) {
        // Custom the size of LinkedList as the last 3 digits of my student ID: 229530520
        int mySize = 520;

        MyLinkedListProcess myList = new MyLinkedListProcess(mySize);

        // Create new threads to execute producer and consumer
        Thread threadOfProducer = new Thread(new MyProducer(myList));
        threadOfProducer.start();

        Thread threadOfConsumer = new Thread(new MyConsumer(myList));
        threadOfConsumer.start();
    }
}
