package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // 이 어노테이션을 사용해야 DB가 해당 객체를 인식 가능!
public class Article {


    @Id  //엔티티에는 기본값이 필요함 = 주민등록번호같은거
    @GeneratedValue //자동 생성 어노테이션션
   private Long id;

    @Column
    private String title;

    @Column
    private String content;

    //생성자 추가

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
