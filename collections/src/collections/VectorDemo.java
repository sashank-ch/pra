package collections;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Surya");
		v.addElement("sasi");//vector is an legacy class means older class all the list are worked with iterator but vector works with enumeration
		v.add("nani");       //it has new methods addElement and RemoveElement
		v.add("Kiran");
		v.removeElement("Surya");
		v.size();
		Enumeration e=v.elements(); 
		while(e.hasMoreElements()){  
			System.out.println(e.nextElement());  
		}  



	}

}
