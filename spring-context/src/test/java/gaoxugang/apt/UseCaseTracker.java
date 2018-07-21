package gaoxugang.apt;

import gaoxugang.annotation.UseCase;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 注解处理器
 */
public class UseCaseTracker {
	public static void trackUseCase(List<Integer> useCases,Class<?> clazz){
		for(Method method:clazz.getDeclaredMethods()){
			UseCase useCase = method.getAnnotation(UseCase.class);
			if (useCase != null){
				System.out.println("Found Use Case:" + useCase.id() + " " + useCase.description() );
				useCases.remove(new Integer(useCase.id()));
			}
		}
		for (int i:useCases){
			System.out.println("Warning:Missing use case-" + i);
		}
	}

	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<>();
		Collections.addAll(useCases,47,48,49,50);
		trackUseCase(useCases,PasswordUtils.class);
	}
}
