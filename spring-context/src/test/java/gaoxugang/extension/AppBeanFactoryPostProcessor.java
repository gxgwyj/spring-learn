package gaoxugang.extension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 类: AppBeanFactoryPostProcessor <br>
 * 描述:AppBeanFactoryPostProcessor
 * 作者: gaoxugang <br>
 * 时间: 2018年01月11日 14:50
 */
public class AppBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		for (int i = 0; i < beanDefinitionNames.length; i++) {
			// 此处最好是不要做getBean的操作，否则会直接初始化bean对象
			System.out.println("BeanFactoryPostProcessor:" + beanDefinitionNames[i]);
		}
	}
}
