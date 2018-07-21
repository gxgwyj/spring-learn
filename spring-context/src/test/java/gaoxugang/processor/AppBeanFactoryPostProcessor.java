package gaoxugang.processor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 类: AppBeanFactoryPostProcessor <br>
 * 描述: ${DESCRIPTION}<br>
 * 作者: gaoxugang <br>
 * 时间: 2018年01月11日 14:50
 */
public class AppBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
		System.out.println("bean定义总数:" + beanDefinitionCount);
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			System.out.println(objectMapper.writeValueAsString(beanFactory.getBeanDefinitionNames()));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}
}
