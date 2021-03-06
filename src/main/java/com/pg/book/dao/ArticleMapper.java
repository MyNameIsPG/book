package com.pg.book.dao;

import com.github.pagehelper.Page;
import com.pg.book.dto.ArticleDto;
import com.pg.book.entity.Article;

public interface ArticleMapper {

    Page<Article> queryAll(ArticleDto articleDto);

    Article queryOne(String uuid);

    int insert(Article article);

    int update(Article article);
}
