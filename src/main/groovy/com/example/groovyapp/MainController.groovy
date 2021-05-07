package com.example.groovyapp

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@EnableAutoConfiguration//thymeleafテンプレートを利用可能にする

//@RestController//アプリケーション全体の処理をコントロールする（returnをそのまま返す）

@Controller//アプリケーション全体の処理をコントロールする（テンプレートを使用する場合）
class MainController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    //()内のアドレスにアクセスしたら、以下のメソッドを実行する(リクエストハンドラ)
    @ResponseBody
    //レスポンスをオブジェクトとして設定する（）
    def home(ModelAndView mav){//「モデル」と「ビュー」をレスポンスとして返す
        mav.setViewName("home")//setViewName(テンプレート名)。引数として指定した名前のテンプレートを「templates」から返す。拡張子不要。
        mav.addObject("msg","Pleas write your name...")//addObject(名前,値)。コントローラー側からビューを指定する。
        mav//メソッドの最後の行の内容がreturnされる
    }

    @RequestMapping(value = "/send",method = RequestMethod.POST)
    @ResponseBody
    def send(@RequestParam("text1")String str,ModelAndView mav){
        //@RequestParam("text1")引数の前に付けられたアノテーション("tex1")に送られてきた値を引数に渡す
        //strは実際の引数
        mav.setViewName("home")
        mav.addObject("msg","Hello,"+str+"!!")
        mav.addObject("value",str)
        mav
    }
}
