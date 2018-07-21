package gaoxugang.springx;

import org.springframework.beans.factory.InitializingBean;

/**
 * 类: MyInitializingBean <br>
 * 描述: 初始化回调<br>
 * 作者: gaoxugang <br>
 * 时间: 2018年02月27日 16:14
 */
public class MyInitializingBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyInitializingBean execute");
	}
}
