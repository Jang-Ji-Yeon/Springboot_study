package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

//dto = form data를 받아올 그릇
public class ArticleForm {

    private String title;
    private String content;

    //생성자 = constructor
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    //toString
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    //article 메서드 생성
    public Article toEntity() {
        return new Article(null,title,content);
    }
}
