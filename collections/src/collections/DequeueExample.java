package collections;
import java.util.*;
public class DequeueExample {

	public static void main(String[] args) {
		Deque<String> d=new ArrayDeque<String>();
		d.offer("arvind");
		d.offer("vimal");
		d.add("mukul");
		d.offerFirst("jai");//offerfirst means add first of the queue
		d.pollLast();//polllast means delete last of the queue
		for(String s:d) {
			System.out.println(s);
		}

	}

}
