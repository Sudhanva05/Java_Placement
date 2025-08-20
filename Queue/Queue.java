package Queue;

public class Queue {
    int front;
    int back;
    int[] arr;
    int sizeQ;

    Queue(int sizeQ){
        this.sizeQ=sizeQ;
        arr = new int[sizeQ];
        front =-1;
        back=-1;
    }

    void push(int val){
        if(back==sizeQ-1){
            System.out.println("Queue Overflow");
            return;
        }
        back++;
        arr[back]=val;
        if(front==-1)
            front++;
    }

    void pop(){
        if(front==-1 || front>back){
            System.out.println("Queue Underflow");
            return;
        }
        front++;
    }

    int peek(){
        if(front==-1 || front>back){
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty(){
        return (front==-1 || front>back);
    }
}
