import java.util.Comparator;

public class Comparatorlogic implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {

		if((arg0%10)>(arg1%10))
			return 1;
		
		
		return -1;
	}

}
