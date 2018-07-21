package gaoxugang;

import gaoxugang.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/18.
 */
public class AspectTest {

	@Test
	public  void testApplication() {
		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("gaoxugang/aop-config.xml");
		ctx.start();
		UserService userService = ctx.getBean(UserService.class);
		userService.getUser();
		System.out.print("XXXX");

	}

}
