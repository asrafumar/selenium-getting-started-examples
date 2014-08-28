import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Set_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> l = new ArrayList<String>();
			l.add("USA");
			l.add("CHina");
			l.add("India");
			l.add("India");
			l.add("India");
			
		System.out.println("List Size -> "+l.size());
		System.out.println(l.get(1));
		
		//no duplicate elements , no index
		Set <String> s =new HashSet<String>();	
		s.add("UK");
		s.add("UK");
		s.add("US");
		s.add("UP");
		s.add("Bihar");
		s.add("Delhi");
		
		System.out.println("Set Size -> "+s.size());
		//System.out.println(iter.next()); //print the value & move the iterator to next point
		Iterator <String> iter = s.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next()); //print the value & move the iterator to next point	
		}
						
	}

}



