package matomeschoo.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserForm {
	@NotBlank //空白禁止
	private String name;
	@NotBlank
	@Pattern(regexp = "[0-9]*")
	private String age;
	@NotBlank
	@Email
	private String mailAddress;
	
	/**
	 * コンストラクタ
	 * @param name
	 * @param age
	 * @paramp mailAddress
	 */
	public UserForm(String name,String age,String mailAddress) {
		this.name = name;
		this.age = age;
		this.mailAddress = mailAddress;
	}
	
	// コンストラクタ
	public UserForm() {
	}
	
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getMailAddress() {
		return mailAddress;
	}
	
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	
}
