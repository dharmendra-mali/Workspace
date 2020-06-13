package test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

import main.Test2;

public class Clinet2 {
	
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class class1=Class.forName("main.Test2");
		
		Constructor [] conn =class1.getDeclaredConstructors();
		conn[0].setAccessible(true);
	Test2 test	=(Test2) conn[0].newInstance();
		
        Field[] fields = class1.getDeclaredFields();
        
        fields[0].setAccessible(true);
        fields[0].setInt(test, 800);
        test.getNum();
        

		
	}

}
