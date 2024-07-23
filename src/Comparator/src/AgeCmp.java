package Comparator.src;


import java.util.Comparator;

public class AgeCmp implements Comparator<Student> {
    @Override
	public int compare(Student o1, Student o2) {
	             return Integer.compare(o2.getAge(),o1.getAge());
	}
}
