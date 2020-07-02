package jaden.spring.common;

import jaden.spring.board.service.ReadArticleService;
import jaden.spring.board.service.WriteArticleService;
import jaden.spring.board.vo.ArticleNotFoundException;
import jaden.spring.board.vo.ArticleVO;
import jaden.spring.member.service.MemberService;
import jaden.spring.member.vo.MemberVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
        WriteArticleService writeArticle = context.getBean("writeArticleServiceImpl", WriteArticleService.class);
        MemberService memberService = context.getBean("memberServiceImpl", MemberService.class);
        ReadArticleService readArticle = context.getBean("readArticleServiceImpl", ReadArticleService.class);


        writeArticle.write(new ArticleVO());
        memberService.regist(new MemberVO());
        try {
            readArticle.getArticleIncreaseReadCount(1);
        } catch (ArticleNotFoundException e) {
            e.printStackTrace();
        }

    }
}
