package com.gpf.controller;

import com.gpf.entities.Article;
import com.gpf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: GuoPengfei
 * @Date: 2019/9/1 13:34
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/article/get")
    public Article get(){

        return articleService.getById();
    }
}
