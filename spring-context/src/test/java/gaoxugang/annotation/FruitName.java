package gaoxugang.annotation;

import java.lang.annotation.*;

/**
 * 水果名称的注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
	String value() default "";
}
