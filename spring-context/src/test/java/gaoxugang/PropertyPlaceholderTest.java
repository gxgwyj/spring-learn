package gaoxugang;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaoxugang
 * @data 2022/9/12 9:05
 * @description 属性占位符
 */
public class PropertyPlaceholderTest {
	@Test
	public  void testPropertyPlaceholder() {
		String[] locations = {"gaoxugang/propertyPlaceholder.xml"};
		ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext(locations);
	}
}
