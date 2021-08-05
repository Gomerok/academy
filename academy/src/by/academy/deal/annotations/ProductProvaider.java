package by.academy.deal.annotations;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(TYPE)
public @interface ProductProvaider {
	String country() default "Belarus";
	int lifeTime() ; 
	String [] parts();
}
