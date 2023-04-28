import java.util.LinkedHashMap;

public class CollectionDemo3 {

	public static LinkedHashMap<String, String> getEntries(String array[]) {
		String a = "" , b = "" ;
		LinkedHashMap<String,String> result = new LinkedHashMap<String,String>();
		for ( int i = 0 ; i < array.length ; i++)
		{
			a = array[i];
			b = a.substring(0, 3).toUpperCase();
			result.put( b ,a);
		}
		return result;
	}

	public static void main(String[] args) {

		String array[] = { "goa", "kerala", "gujarat" , "delhi"};
		System.out.println(getEntries(array));
	}
}
