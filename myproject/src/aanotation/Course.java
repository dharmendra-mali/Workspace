package aanotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Inherited
public @interface Course {

	String cId() default "c100";
	String cName() default "c programing lang";
	int cCost() default 10000;
	
	
}
