package com.gpf.api.controller;

import com.gpf.api.entities.Article;
import com.gpf.common.annotations.LogAnnotation;
import com.gpf.model.result.ResultMap;
import com.gpf.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 控制层
 * @Auther: GuoPengfei
 * @Date: 2019/9/1 13:34
 */
@RestController
public class ArticleController {


    @Autowired
    private ArticleService articleService;

    @GetMapping("/article/get")
    @LogAnnotation(operation = "查询",description = "查找所有文章列表")
    public ResultMap get(){
        return articleService.get();
    }

    @PostMapping("/article/update")
    public ResultMap update(Article article){
        return articleService.update(article);
    }
}
