package gaoxugang.extension;

import gaoxugang.pojo.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author gaoxugang
 * @data 2022/10/30 10:27
 * @description FactoryBean
 */
public class PersonBeanFactory implements FactoryBean<Person> {

	private static Person person = new Person();

	@Override

	public Person getObject() throws Exception {
		return person;
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
