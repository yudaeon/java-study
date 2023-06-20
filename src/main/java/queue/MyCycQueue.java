package queue;

public class MyCycQueue {
    //원형 큐
    private final int size = 4;
    private final int offset = size+1;
    private final int[]arr = new int[size + 1];
    private int front = 0;
    private int rear = 0;

    public MyCycQueue(){

    }
    //데이터 추가
    public void enQueue(int x)  {
        // 다음에 데이터가 들어가는 곳 : (rear + 1) % (sixze + 1);
        // 다음에 데이터가 나올 곳과 일치할 경우 full
        if ((rear + 1) % offset == front){
            throw new RuntimeException("queue is full");
        }
        rear = (rear + 1) % offset;
        arr[rear] = x;
    }
    public int deQueue(){
        if (front == rear){
            throw new RuntimeException("queue is empty");
        }
        front = (front + 1) % offset;
        return arr [front];
    }
    public boolean isEmpty(){
        return front == rear;
    }

    public static void main(String[] args) {
        MyCycQueue queue = new MyCycQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println(queue.deQueue());
        queue.enQueue(5);
    }
}
