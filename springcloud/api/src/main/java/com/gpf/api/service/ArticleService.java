package com.gpf.api.service;

import com.gpf.api.entities.Article;
import com.gpf.model.result.ResultMap;


/**
 * @Description: 业务层
 * @Auther: GuoPengfei
 * @Date: 2019/9/1 14:14
 */
public interface ArticleService<T>{

    public ResultMap get();

    public ResultMap update(Article article);

}
