package lembda_expration;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {

		Temp temp=new Temp();
		
		// equals methods comparison
		HashMap<Object, Object> map = new HashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		map.put(i2, "kumar");
		map.put(i1, "dev");
		
		System.out.println(map);
        //== comparison
		IdentityHashMap<Integer, String> map2 = new IdentityHashMap<Integer, String>();
		map2.put(i1, "dev");
		map2.put(i2, "kumar");
		System.out.println(map2);
		
		
		HashMap<Object, Object> map3=new HashMap<>();
		//WeakHashMap map3= new WeakHashMap<>();
		map3.put(temp, "hello");
		System.out.println(map3);
		temp=null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(map3);
		

	}

}
class Temp{
	
	public String toString(){
		
		return "temp";
	}
	public void finalize(){
		
		System.out.println("garbage collactor ");
	}
}