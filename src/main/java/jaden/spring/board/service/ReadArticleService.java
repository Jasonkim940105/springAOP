package jaden.spring.board.service;

import jaden.spring.board.vo.ArticleNotFoundException;
import jaden.spring.board.vo.ArticleVO;
import jaden.spring.common.annotation.AfterReturn;
import org.aspectj.lang.annotation.AfterReturning;



public interface ReadArticleService {
    ArticleVO getArticleIncreaseReadCount(int id) throws ArticleNotFoundException;
}
