package matomeschoo.form;

import jakarta.validation.constraints.NotNull;

/**
 *ログイン用Form 
 */
public class LoginForm {
	@NotNull
	private String loginId;
	@NotNull
	private String loginPassword;
	
	/**
	 * @return loginId
	 */
	public String getLoginId() {
		return loginId;
	}
	
	/**
	 * @param loginId セットする
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	/**
	 * @return loginPassword
	 */
	public String getLoginPassword() {
		return loginPassword;
	}
	
	/**
	 * @param loginPassword セットする
	 */
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
}
