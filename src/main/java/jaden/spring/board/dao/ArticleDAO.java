package jaden.spring.board.dao;

import jaden.spring.board.vo.ArticleVO;

public interface ArticleDAO {
    void insert(ArticleVO article);
    void updateReadCount(int id);
}
