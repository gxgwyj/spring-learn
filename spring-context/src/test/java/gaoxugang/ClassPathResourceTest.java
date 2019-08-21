package gaoxugang;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2017/10/10.
 */
public class ClassPathResourceTest {
	@Test
	public  void test() {
		ClassPathResource res = new ClassPathResource("gaoxugang/context-simple.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
	}
}
