package LinkedListProblem;

public class MyProducer implements Runnable{

    private MyLinkedListProcess myList;

    public MyProducer (MyLinkedListProcess myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
                while (true) {
                    myList.produce();
                }
            } catch(InterruptedException e) {
                e.printStackTrace();
        }
    }
}
