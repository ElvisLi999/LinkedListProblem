package LinkedListProblem;

public class MyConsumer implements Runnable{

    private MyLinkedListProcess myList;

    public MyConsumer (MyLinkedListProcess myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            while (true) {
                myList.consume();
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
