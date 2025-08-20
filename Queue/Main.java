package Queue;


public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        // Pushing elements
        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front element: " + q.peek());

         q.pop();
        System.out.println("Front element after 1 pop: " + q.peek());

        q.push(40);
        q.push(50);
        q.push(60);
        q.push(70);

        // Emptying queue
        while(!q.isEmpty()){
            System.out.println("Removing: " + q.peek());
            q.pop();
        }

         q.pop();
    }
}