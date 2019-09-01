package com.gpf.service;

import com.gpf.entities.Article;
import com.gpf.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Auther: GuoPengfei
 * @Date: 2019/9/1 14:14
 */
@Service
public class ArticleService{

    @Autowired
    private ArticleMapper articleMapper;

    public Article getById(){
        return articleMapper.getArticleByID();
    }
}
