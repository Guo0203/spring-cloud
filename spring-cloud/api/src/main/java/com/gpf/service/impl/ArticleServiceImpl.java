package com.gpf.service.impl;

import com.gpf.entities.Article;
import com.gpf.mapper.ArticleMapper;
import com.gpf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: service实现类
 * @package: com.gpf.service.impl
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/9/20 14:21
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired(required = false)
    private ArticleMapper articleMapper;

    @Override
    public Article get() {
        return articleMapper.getArticleByID();
    }
}
