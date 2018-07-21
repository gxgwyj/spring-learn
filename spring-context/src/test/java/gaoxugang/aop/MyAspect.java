package gaoxugang.aop;

/**
 * Created by Administrator on 2017/10/27.
 */
public class MyAspect {
	public void monitor(){
		System.out.println("----------------aspect before-------------------");
	}

	public void afterMethod(){
		System.out.println("----------------aspect after-------------------");
	}
}
