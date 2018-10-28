package com.lernen.math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationInitialiser {

    @Autowired
    WordRepository wordRepository;

    @Bean
    ApplicationRunner intialiseData(){
        return args ->  {
          Words word =new Words();
          word.setArabic("قلم");
          word.setEnglish("Pen");
          word.setGerman("Stift");
          word.setArticle(Article.der);
         // wordRepository.save(word);
        };
    }
}
