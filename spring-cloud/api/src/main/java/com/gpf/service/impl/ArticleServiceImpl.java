package com.gpf.service.impl;

import com.gpf.contants.Operations;
import com.gpf.entities.Article;
import com.gpf.dao.ArticleDao;
import com.gpf.result.ResultMap;
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
    private ArticleDao articleMapper;

    @Override
    public ResultMap get() {
        return new ResultMap().getResults(articleMapper.getArticleByID(), Operations.SELECT.getOperation());
    }

    @Override
    public ResultMap update(Article article) {
        articleMapper.updateArticleById(article);
        return new ResultMap().getResult(article,Operations.UPDATE.getOperation());
    }
}
