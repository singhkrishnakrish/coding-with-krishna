import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@FunctionalInterface
interface Bus extends Serializable{
	int add();	
}

public class LamdaFunctional {
	public static void main(String[] args) {
		
		Bus bs = ()->{
			return 1;
		};
		System.out.println(bs.add());
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(2);
		ArrayList<Integer> intersect = new ArrayList<Integer>();
		HashSet<Integer> test1 = new HashSet<Integer>();
		for (Integer integer : list) {		
			for (Integer integer2 : list2) {
				if(integer == integer2) {
					test1.add(integer);
				}
			}
		}		
		System.out.println(test1);
		
	}
}