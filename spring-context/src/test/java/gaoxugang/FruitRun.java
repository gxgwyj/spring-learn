package gaoxugang;

import gaoxugang.apt.FruitInfoUtil;
import gaoxugang.pojo.Apple;
import org.junit.Test;

public class FruitRun {
	@Test
	public  void fruit() {
		FruitInfoUtil.getFruitInfo(Apple.class);
	}

	@Test
	public void testAA(){
		Class clazz = Apple.class;
		System.out.println(clazz.getModifiers());
	}
}
