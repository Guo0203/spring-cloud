package com.gpf.api.service.impl;

import com.gpf.api.entities.Article;
import com.gpf.api.service.ArticleService;
import com.gpf.model.contants.Operations;
import com.gpf.api.dao.ArticleDao;
import com.gpf.model.result.ResultMap;
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
