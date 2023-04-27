package om.demo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemoTest {

	public static void main(String[] args) {
		ArrayList<ComparableDemo> al=new ArrayList<ComparableDemo>();
		al.add(new ComparableDemo(104,"radhika",24,"nashik"));
		al.add(new ComparableDemo(101,"akash",26,"malegaon"));
		al.add(new ComparableDemo(103,"saroj",20,"pune"));
		al.add(new ComparableDemo(102,"dhanno",26,"dubai"));
		
		
		Collections.sort(al,new NameComparator());
		System.out.println("Name Sorted:= "+al);
        
		Collections.sort(al,new IdComparaor());
		System.out.println("Id Sorted:= "+al);
		
	}

}
