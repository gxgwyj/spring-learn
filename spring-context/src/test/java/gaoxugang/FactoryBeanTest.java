package gaoxugang;

import gaoxugang.extension.PersonBeanFactory;
import gaoxugang.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaoxugang
 * @data 2022/10/30 10:32
 * @description FactoryBean测试
 */
public class FactoryBeanTest {

	@Test
	public void testFactoryBean(){
		// 启动spring 容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("gaoxugang/factoryBean.xml");

		// 获取factoryBean创建的bean实例
		Person person = ctx.getBean("person", Person.class);
		System.out.println(person);

		// 获取factoryBean实例本省
		PersonBeanFactory bean = ctx.getBean("&person", PersonBeanFactory.class);
		System.out.println(bean);
		System.out.println(bean.getObjectType());
	}
}
