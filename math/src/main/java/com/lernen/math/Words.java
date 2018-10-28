package com.lernen.math;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class Words {

    @Id
    @GeneratedValue
    Long id;

    @NotNull
    @Column(nullable = false ,  unique = true)
    String arabic;

    @NotNull
    @Column(nullable = false ,  unique = true)
    String english;

    @Enumerated(EnumType.STRING)
    Article article;

    @NotNull
    @Column(nullable = false ,  unique = true)
    String german;

    public Words() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }



    public String getGerman() {
        return german;
    }

    public void setGerman(String german) {
        this.german = german;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
