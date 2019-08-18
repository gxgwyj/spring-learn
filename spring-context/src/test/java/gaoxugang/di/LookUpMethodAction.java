package gaoxugang.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaoxugang
 * @data 2019/8/18 0018 11:44
 * @description 单例中注入一个原型模式的bean，并且每次调用bean的时候，必须是新生成的bean
 */
public class LookUpMethodAction {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("gaoxugang/lookup-method.xml");
		ctx.start();
		CommandManager commandManager = (CommandManager) ctx.getBean("commandManager");

		commandManager.process();
		commandManager.process();
		commandManager.process();
		commandManager.process();

	}
}
