package gaoxugang;

import gaoxugang.pojo.MyApplicationContextAware;
import gaoxugang.pojo.Student;
import gaoxugang.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.DefaultDocumentLoader;
import org.springframework.beans.factory.xml.DocumentLoader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * Created by Administrator on 2017/9/18.
 * 测试一下git是否好使
 */
public class ApplicationContextTest {

	@Test
	public  void testApplication() {
		String[] locations = {"gaoxugang/annotation-based.xml","gaoxugang/context-simple.xml"};
		ClassPathXmlApplicationContext ctx =  new ClassPathXmlApplicationContext(locations);
		Student bean = ctx.getBean(Student.class);
		System.out.println(bean.toString());
	}

	@Test
	public void testSpringResource() {
		// 资源路径
		String path = "gaoxugang/context-simple.xml";
		// 资源加载器
		ResourceLoader resourceLoader = new DefaultResourceLoader();

		// 获取资源的方式1（直接类路径获取）
		Resource resource1 = new ClassPathResource(path);
		System.out.println(resource1.exists());

		// 获取资源的方式2（类加载器获取）
		Resource resource2 = resourceLoader.getResource(path);
		System.out.println(resource2.exists());

		// 创建一个bean工厂
		DefaultListableBeanFactory registry = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(registry);
		xmlBeanDefinitionReader.loadBeanDefinitions(resource2);
		Student student = registry.getBean(Student.class);
		Object bean = (Student) registry.getBean("gaoxugang.pojo.Student#0");
		student.study();
		((Student) bean).study();

		System.out.println("使用别名获取......");
		User springUserPo1 = registry.getBean("springUserPo1", User.class);
		User springUserPo2 = registry.getBean("springUserPo2", User.class);
		System.out.println(springUserPo1 == springUserPo2);

	}


	@Test
	public void testApplicationAware() {
		String[] locations = {"gaoxugang/context-aware.xml"};
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(locations);
		MyApplicationContextAware bean = ctx.getBean(MyApplicationContextAware.class);
		bean.printTxt();
	}

}
