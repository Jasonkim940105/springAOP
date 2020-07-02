package jaden.spring.board.service;

import jaden.spring.board.vo.ArticleNotFoundException;
import jaden.spring.board.vo.ArticleVO;
import jaden.spring.common.annotation.AfterReturn;
import org.springframework.stereotype.Service;

@Service
public class ReadArticleServiceImpl implements ReadArticleService {

    @AfterReturn
    public ArticleVO getArticleIncreaseReadCount(int id) throws ArticleNotFoundException {
        if(id == 0){
            throw new ArticleNotFoundException();
        }
        return new ArticleVO();
    }
}
