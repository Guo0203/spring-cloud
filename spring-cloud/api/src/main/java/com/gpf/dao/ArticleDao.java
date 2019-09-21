package com.gpf.dao;

import com.gpf.entities.Article;

import java.util.List;

/**
 * @Description: dao接口
 * @Auther: GuoPengfei
 * @Date: 2019/9/1 13:22
 */

public interface ArticleDao {

    public List<Article> getArticleByID();

    public void updateArticleById(Article article);
}
