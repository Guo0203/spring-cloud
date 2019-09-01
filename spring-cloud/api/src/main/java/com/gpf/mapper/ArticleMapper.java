package com.gpf.mapper;

import com.gpf.entities.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Auther: GuoPengfei
 * @Date: 2019/9/1 13:22
 */
@Mapper
public interface ArticleMapper {
    public Article getArticleByID();
}
