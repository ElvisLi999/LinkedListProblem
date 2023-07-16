package LinkedListProblem;

import java.util.LinkedList;

public class MyLinkedListProcess {
    // Fields
    private LinkedList<Integer> myLinkedList;
    private int mySize;

    // Constructor
    public MyLinkedListProcess(int mySize) {
        this.myLinkedList = new LinkedList<>();
        this.mySize = mySize;
    }

    // Functions
    // Producer function-> for adding item into LinkedList.
    public synchronized void produce() throws InterruptedException {
        // Handle the situation of full size
        while (myLinkedList.size() == mySize) {
            System.out.println("Add action will be pause because the LinkedList is full!");
            wait();
        }
        // Create a random integer number for adding
        int myAddingNum = (int)(Math.random() * 100);
        // Execute add action if size is not full
        myLinkedList.add(myAddingNum);
        System.out.println("Number: " + myAddingNum + " is added into LinkedList.");

        notify();
        Thread.sleep(1000);
    }

    // Consumer function-> for removing item from LinkedList.
    public synchronized void consume() throws InterruptedException {
        // Handle the situation of empty size
        while (myLinkedList.isEmpty()) {
            System.out.println("Remove action will be pause because the LinkedList is empty!");
            wait();
        }

        // Execute remove action then save the removed num to a variable.
        int myRemovingNum = myLinkedList.removeFirst();
        System.out.println("Number: " + myRemovingNum + " is removed from LinkedList.");

        notify();
        Thread.sleep(1000);
    }

}
