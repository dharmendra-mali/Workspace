package example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("exampleFruit")
public class ExampleFruit {

	private List<String> list;
	
	public ExampleFruit() {
		list = new ArrayList<String>();
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
}
