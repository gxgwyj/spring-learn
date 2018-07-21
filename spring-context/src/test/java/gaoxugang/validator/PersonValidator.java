package gaoxugang.validator;

import gaoxugang.pojo.Person;
import org.springframework.lang.Nullable;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Administrator on 2017/10/17.
 */
public class PersonValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(@Nullable Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors,"name","name.empty");
		Person person = (Person)target;
		if (person.getAge() < 0){
			errors.rejectValue("age","negatievlue");
		} else if (person.getAge()>110){
			errors.rejectValue("age","too.darn.old");
		}
	}
}
