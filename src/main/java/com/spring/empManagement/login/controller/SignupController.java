package com.spring.empManagement.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class SignupController {

    private Map<String, String> radioMarriage;

    /**
     * ラジオボタンの初期化メソッド
     *
     * @return 既婚、未婚のステータスをMapに格納した変数 radio を返す
     */
    private Map<String, String> initRadioMarriage() {

        Map<String, String> radio = new LinkedHashMap<>();
        radio.put("Married", "true");
        radio.put("Unmarried", "false");

        return radio;
    }

    /**
     * GETリクエストが来たら、ModelクラスにMapを登録
     * 画面からMapの値を取得
     *
     * @param model
     * @return
     */
    @GetMapping("/signup")
    public String getSignUp(Model model) {

//      ラジオボタン初期化メソッドの呼び出し
        radioMarriage = initRadioMarriage();

        model.addAttribute("radioMarriage", radioMarriage);

        return "login/signup";
    }


    @PostMapping("/signup")
    public String postSignUp(Model model) {

//      遷移先のControllerクラスのメソッドが呼ばれる
//      /login にGETメソッドでHTTPリクエストが送られる(LoginController の getLogin メソッドが呼び出される)
        return "redirect:/login";
    }
}
