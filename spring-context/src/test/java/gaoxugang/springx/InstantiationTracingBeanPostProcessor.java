package gaoxugang.springx;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Administrator on 2017/10/17.
 */
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor{
	private ObjectMapper objectMapper = new ObjectMapper();
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		try {
			System.out.println(beanName+" befor:"+objectMapper.writeValueAsString(bean));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		try {
			System.out.println(beanName+" after:"+objectMapper.writeValueAsString(bean));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return bean;
	}
}
