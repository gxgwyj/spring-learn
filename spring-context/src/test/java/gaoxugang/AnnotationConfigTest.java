package gaoxugang;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类: AnnotationConfigTest <br>
 * 描述: <br>
 * 作者:  Administrator<br>
 * 时间: 2018年07月30日 16:59
 */
public class AnnotationConfigTest {
	@Test
	public  void testAnnotation() {
		String[] locations = {"gaoxugang/annotation-based.xml"};
		ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext(locations);
	}
}
