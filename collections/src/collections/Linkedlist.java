package collections;
import java.util.*;
public class Linkedlist  {

	public static void main(String[] args) {
		Emp e=new Emp(101,"suresh",15000);
		Emp e1=new Emp(102,"ramesh",14000);
		Emp e2=new Emp(103,"rajesh",13000);
		LinkedList<Emp> ll=new LinkedList<Emp>();
		ll.addFirst(e2); //here in linked list it follows insertion type but with these new methods addFirst and addLast we can change the positions 
		ll.addLast(e1);  // there are removeFirst and RemoveLast methods also but it not applicable while using constructor
		ll.add(e);
		for(Emp em:ll) {
			System.out.println(em);
		}
		
	}

}
