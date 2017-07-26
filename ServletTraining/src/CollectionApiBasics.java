import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionApiBasics {

	public static void main(String[] args) {
		
		List<Integer> values=new ArrayList();
		
		values.add(227);
		values.add(563);
		values.add(231);
		values.add(224);
		values.add(569);
		values.add(236);
		
		
		Comparator com= new Comparatorlogic();
		Collections.sort(values, com);;
				
		for(Object i:values)
		{
			System.out.println(i);
		}
		
		
		
	}

}
