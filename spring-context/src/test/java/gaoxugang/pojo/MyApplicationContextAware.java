package gaoxugang.pojo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author gaoxugang
 * @data 2019/9/9 0009 16:32
 * @description TODO
 */
public class MyApplicationContextAware implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("赋值容器上下文：" + applicationContext.toString());
		this.applicationContext = applicationContext;
	}

	public void printTxt() {
		System.out.println("打印一句话：" + applicationContext.getApplicationName());
		MyApplicationContextAware bean = applicationContext.getBean(MyApplicationContextAware.class);
		System.out.println(this == bean);
	}
}
