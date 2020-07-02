package jaden.spring.board.dao;

import jaden.spring.board.vo.ArticleVO;
import jaden.spring.common.annotation.HelloLog;
import org.springframework.stereotype.Repository;

@Repository
public class OracleArticleDAO implements ArticleDAO {
    @HelloLog
    public void insert(ArticleVO article) {
        // DB 작업
        System.out.println("MyOracleDAO.insert() 실행");
    }

    public void updateReadCount(int id) {
        System.out.println("MyOracleDAO.updateReadCount() 실행");
    }
}
