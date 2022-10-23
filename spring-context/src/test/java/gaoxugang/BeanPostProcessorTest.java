package gaoxugang;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaoxugang
 * @data 2022/10/23 15:47
 * @description BeanPostProcessor测试
 */
public class BeanPostProcessorTest {

	@Test
	public  void testBeanPostProcessor() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("gaoxugang/extension-config.xml");
		ctx.getBean("student1");
		ctx.getBean("teacher1");
	}
}
