package gaoxugang.pojo;

import gaoxugang.annotation.FruitColor;
import gaoxugang.annotation.FruitName;
import gaoxugang.annotation.FruitProvider;

/**
 * Created by Administrator on 2017/10/11.
 */
public class Apple {
	@FruitName("Apple")
	private String appleName;

	@FruitColor(fruitColor = FruitColor.Color.RED)
	private String appleColor;

	@FruitProvider(id = 1,name = "陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
	private String appleProvider;

	public void show(){
		System.out.println("apple show");
	}


	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
}
