package matomeschoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;
import matomeschoo.form.LoginForm;

@Controller
public class MatomeController {
	
	@Autowired
	HttpSession session;
	
	@ModelAttribute
	public LoginForm setUpForm() {
		return new LoginForm();
	}
	
	@GetMapping("/")
	public String index(Model model) {
		//ログイン状態のチェック
		String login = (String)session.getAttribute("login");
		if ("ok".equals(login)) {
			model.addAttribute("userName", "スクー太郎");
			return "logout";
		} else {
			return "index";
		}
	}
	
	/**
	 * ログイン処理
	 * @param loginForm ログインForm
	 * @param bindingResult 入力チェック結果
	 * @return 処理結果ページのパス
	 */
	@PostMapping("login")
	public String login(@Validated LoginForm loginForm,
			           BindingResult bindingResult,
			           Model model) {
		//入力チェック
		if(bindingResult.hasErrors()) {
			model.addAttribute("message", "ログインできませんでした");
			return "index";
		}
		
		//IDとパスワードのチェック
		if("schoo".equals(loginForm.getLoginId()) &&
		   "pass".equals(loginForm.getLoginPassword())){
			session.setAttribute("userName", "スクー太郎");
			return "login";
		} else {
			model.addAttribute("message", "ログインできませんでした");
			return "index";
		}
	}
	
	/**
	 * ログアウト処理
	 * @return
	 */
	@GetMapping("logout")
	public String logput(Model model) {
		session.invalidate();
		model.addAttribute("message", "ログアウトしました");
		return "index";
	}
	
	//--------------------メッセージ1～3入力のController------------------
	/** 
	@GetMapping("/")
	public String index() {
		 //user画面を呼び出す
		//return "user";
		return "input";
	}
	*/
	
	/**
	 * 入門処理リクエスト
	 * @param userForm ユーザー情報
	 * @param bindingResult ユーザー情報の入力チェック結果
	 * @param model 画面に受け渡しをする情報
	 * @return 入力画面
	 */
	/**
	@PostMapping("input")
	public String input(@RequestParam String message1,
			            @RequestParam String message2,
			            @RequestParam String message3,
			            Model model) {
		
		if(!"end".equals(message3)) {
			model.addAttribute("result", "処理が終了しました");
			ArrayList<String> messages = new ArrayList<>();
			messages.add(message1);
			messages.add(message2);
			messages.add(message3);
			model.addAttribute("messages",messages);
		}
		
		return "output";
		*/
	
	//-------------------------------------------------------------------------
		//String message;
		
		/**if(bindingResult.hasErrors()) {
		*	message = "入力内容に誤りがあります。";
		*} else {
		*	message = "正しく入力できました。";
		*}
		*/
		
		//model.addAttribute("message", message);
		//return "user";
	}
