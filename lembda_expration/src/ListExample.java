import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		List<Integer> list1;

		for (int i = 1; i < 11; i++) {
			list.add(i);
		}

		list1=list.stream().filter(i->i!=11).collect(Collectors.toList());
		
		
		System.out.println(list1.size()==list.size());
		
		int i = list1.stream().filter(add -> add == 11).findFirst().get();
		
		System.out.println(i);
		
		list.forEach(add -> System.out.print(add+" "));
	}

}
