package Comparator.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


// this is for the sake of comparing and ordering the elements in a arraylist
public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("anand",20);
		Student s2 = new Student("anand",201);
		Student s3 = new Student("baskar",19);
		Student s4 = new Student("Dinesh",21);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Collections.sort(al,new AgeCmp());
		Iterator<Student>ite=al.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
//		al.forEach(al1->System.out.println());
	}

}
