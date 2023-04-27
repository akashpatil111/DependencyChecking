package om.demo;

import java.util.Comparator;

public class NameComparator implements Comparator<ComparableDemo>{

	@Override
	public int compare(ComparableDemo o1, ComparableDemo o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

	

}
