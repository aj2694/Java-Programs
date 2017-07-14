package Annotations_reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.Generated;




@MyAnno(info="class emploee",num=20)
public class Employee {
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@MyAnno(info="getter",num=10)
	public String getName() {
		return name;
	}
	


	public void setName(String name) {
		this.name = name;
	}
	

	
}
