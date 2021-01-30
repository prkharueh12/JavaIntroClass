package day24Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();

		// Adds elements {0, 1, 2, 3, 4} to
		// the queue
		for (int i = 10; i < 15; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue " + q);

//		// To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element-" + removedele);
//
//		System.out.println(q);
//q.remove()
		q.remove();
//		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-" + head);

//		// Rest all methods of collection
//		// interface like size and contains
//		// can be used with this
//		// implementation.
//		int size = q.size();
//		System.out.println("Size of queue-" + size);

	}

	}


