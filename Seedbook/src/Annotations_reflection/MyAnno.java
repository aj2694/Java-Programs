package Annotations_reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.Generated;

@Retention(RetentionPolicy.RUNTIME)
@ interface MyAnno{
	String info();
	int num();
	
}