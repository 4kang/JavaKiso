package matomeschoo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MatomeController {
	/**
	 * トップページへのリクエスト
	 * @return user.htmlへのパス
	 */
	@GetMapping("/")
	public String index() {
		 //user画面を呼び出す
		//return "user";
		return "input";
	}
	
	/**
	 * 入門処理リクエスト
	 * @param userForm ユーザー情報
	 * @param bindingResult ユーザー情報の入力チェック結果
	 * @param model 画面に受け渡しをする情報
	 * @return 入力画面
	 */
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
}
