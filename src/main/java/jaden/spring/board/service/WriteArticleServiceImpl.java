package jaden.spring.board.service;

import jaden.spring.board.dao.ArticleDAO;
import jaden.spring.board.vo.ArticleVO;
import jaden.spring.common.annotation.HelloLog;
import jaden.spring.common.annotation.TimeCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WriteArticleServiceImpl implements WriteArticleService{

    @Autowired
    private ArticleDAO articleDAO;

    @TimeCheck
    @HelloLog
    public void write(ArticleVO article) {
        System.out.println("WriteArticleServiceImpl.write() 메소드 실행");
        articleDAO.insert(article);

    }
}
