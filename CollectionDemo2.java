import java.util.ArrayList;
import java.util.List;

public class CollectionDemo2 {

	public static int getMaxNumber(List<Integer> l1) {
		int a = l1.get(0);
		for ( int i = 0 ; i < l1.size() ; i++)
		{
			a = Math.max( a , l1.get(i));
		}
		return a;
	}

	public static List<Integer> getReversedList(List<Integer> l1) {
		List<Integer> result = new ArrayList<>();
		for ( int i = (l1.size() - 1) ; i >= 0 ; i-- )
		{
			result.add(l1.get(i));
		}
		return result;
	}
	
	public static List<Integer> getOrderedList(List<Integer> l1) {
		List<Integer> result = new ArrayList<>(l1);
		result.sort(null);
		return result;
	}
	
	public static List<Integer> getExactMidNumber(List<Integer> l1) {
		int size = l1.size();
		List<Integer> result = new ArrayList<>();
		if ( (size % 2) != 0)
		{
			result.add(l1.get(((size - 1) / 2 )));
		}
		else
		{
			int a = l1.get(( size / 2 ) - 1 ) , b = l1.get( size / 2 );
			result.add(Math.max(a, b));

		}
		return result;
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(600);
		list1.add(202);
		list1.add(32);
		list1.add(48);
		list1.add(598);
		list1.add(300);
		list1.add(302);

		
		System.out.println(getMaxNumber(list1)); 
		System.out.println(getReversedList(list1));
		System.out.println(getOrderedList(list1));
		System.out.println(getExactMidNumber(list1));
		

	}
}
