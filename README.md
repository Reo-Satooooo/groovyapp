# SpringBoot+Groovyで簡単なアプリケーションを作成してみる

パッケージの設定は以下の通り  
[Spring.io](https://start.spring.io/)

Project:Maven  
Language:Groovy  
SpringBoot:2.4.5  
Java:11  
Dependencies:SpringWeb,Groovy Templates(いらないかも),Thymeleaf

## 参考文献
[Spring Boot で『Thymeleaf』 テンプレートを使う](https://cloudear.jp/blog/?p=799)  
@EnableAutoConfiguration というアノテーションを使用することで自動読み込みしてくれる。@Grabアノテーションを使おうとしたけど、イマイチわからないのでこちらで解決

Spring Boot2 プログラミング入門 chapter2 Groovyによる超簡単アプリケーション開発  
書籍ではSpringBootCLIを用いた開発を行っているが、ある程度実践的な開発を想定してパッケージ設定をSpringinitializrから行った。
Groovyテンプレートは書籍内で紹介があったため導入したが、正直Thymeleafの方が格段にわかりやすい。
