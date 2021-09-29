import java.util.*;
class Queue1 {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<String>();

        //Adding elements to the Queue
        q.add("MC");
        q.add("Kenny");
        q.add("Glen");
        q.add("Stan");
        q.add("Ryan");

        System.out.println("Elements in Queue:"+q);
        System.out.println("Removed element: "+q.remove());
        System.out.println("Head: "+q.element());
        System.out.println("poll(): "+q.poll());
        System.out.println("peek(): "+q.peek());
        System.out.println("Elements in Queue:"+q);
    }
}

// Queue interface in Java collections has two implementation: LinkedList and PriorityQueue, these two classes implements Queue interface.
//Queue is an interface so we cannot instantiate it, rather we create instance of LinkedList or PriorityQueue and assign it to the Queue like this:
//
//Queue q1 = new LinkedList();
//Queue q2 = new PriorityQueue();