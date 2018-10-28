package com.lernen.math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Services {
    @Autowired
    WordRepository wordRepository;

    public List<Words> getALlWords(){
        return wordRepository.findAll();
    }
}
