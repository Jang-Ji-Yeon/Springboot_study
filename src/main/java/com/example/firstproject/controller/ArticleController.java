package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired //스프링부터가 미리 생성해놓은 객체를 자동 연결해줌!
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {

        return "articles/new";
    }

    //데이터를 쏴야하기 때문에
    //ArticleForm = DTO
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());

        //1. DTO를 Entity로 변환 -> Article class 만들기 -> ArticleForm에 entity method 만들기
        Article article =form.toEntity();
        System.out.println(form.toString());


        //2. Repository에게 Entitiy를 DB안에 저장하게 함
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        return "";
    }

}
