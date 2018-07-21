package gaoxugang.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/10/17.
 */
@Configuration
public class AppConfig {
	@Bean
	public Apple apple(){
		return new Apple();
	}
}
