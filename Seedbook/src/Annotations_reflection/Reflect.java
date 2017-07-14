package Annotations_reflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

import javax.annotation.Generated;


public class Reflect {
	public static void main(String[] args) {
		Employee e=new Employee("Aj");
		Class c=e.getClass();
		try {
			Method m=c.getMethod("getName");
			Method m2=c.getMethod("setName", String.class);
			MyAnno a=m.getAnnotation(MyAnno.class);
			Annotation a3=m2.getAnnotation(Generated.class);
			System.out.println(a3.toString());
		Annotation a2=c.getDeclaredAnnotation(MyAnno.class);
			System.out.println(a2.toString());
			System.out.println(a.toString());
			
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
