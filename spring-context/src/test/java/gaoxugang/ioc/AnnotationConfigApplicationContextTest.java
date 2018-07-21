package gaoxugang.ioc;

import gaoxugang.pojo.AppConfig;
import gaoxugang.pojo.Apple;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/10/17.
 */
public class AnnotationConfigApplicationContextTest {
	@Test
	public void runTest(){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Apple apple = ctx.getBean(Apple.class);
		apple.show();
	}
}
