package gaoxugang.apt;

import gaoxugang.annotation.UseCase;

import java.util.List;

/**
 * Created by Administrator on 2017/10/12.
 */
public class PasswordUtils {
	@UseCase(id =47,description = "Passwords must contain at least one numric")
	public boolean validatePassword(String password){
		return (password.matches("\\w*\\d\\w*"));
	}

	@UseCase(id = 48)
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}

	@UseCase(id = 49,description = "New passwords can't equal previously used ones")
	public boolean checkForNewPassword(List<String> prevPassWords,String password){
		return !prevPassWords.contains(password);
	}
}
