package com.lernen.math.controller;

import com.lernen.math.Calc;
import com.lernen.math.CollectData;
import com.lernen.math.Dao.Dict;
import com.lernen.math.Repository.DictRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Controller

public class Control {


    private Calc calc;

    @Autowired
    private DictRepository dictRepository;

    public Control(Calc calc) {
        this.calc = calc;
    }


    @GetMapping("/")
    public String indexPage() {

        return "mainPage";
    }

    @GetMapping("/addWord")
    public String getcolor() {
        return "addWord";
    }

    @PostMapping("/addWord")
    public String addWord(@Valid String arabic, @Valid String article, @Valid String german, @Valid String english) {
        Dict dict = new Dict();
        dict.setArabic(arabic);
        dict.setArticle(article);
        dict.setGerman(german);
        dict.setEnglish(english);
        dictRepository.save(dict);


        return "redirect:addWord";
    }

    @GetMapping("/words")
    public String wordsList(Model model) {
        return "wordList";
    }


    @GetMapping("/mal")
    public String dataMal(Model model) {
        List<String> list1 = calc.malLernen(1,10,40);


        List<CollectData> collectDataList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            CollectData collectData = new CollectData();
            collectData.setCol1(list1.get(i));
            collectData.setCol2(list1.get(i + 20));
            collectDataList.add(collectData);
        }

        model.addAttribute("operations", collectDataList);

        return "mal";

    }

    @GetMapping("/rest")
    public String dataRest(Model model) {
        List<String> list1 = calc.buildRest();


        List<CollectData> collectDataList = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            CollectData collectData = new CollectData();
            collectData.setCol1(list1.get(i));
            collectData.setCol2(list1.get(i + 25));
            collectData.setCol3(list1.get(i + 50));
            collectData.setCol4(list1.get(i + 75));
            collectDataList.add(collectData);
        }

        model.addAttribute("operations", collectDataList);

        return "dataRest";

    }

    @GetMapping("/examples")
    public String data(Model model) {
        List<String> collect3 = calc.callPlus(1, 80, 1, 90, 90);
        collect3.addAll(calc.callMinus(1, 60, 1, 22, 40));
        Collections.shuffle(collect3);


        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();


        collect3.stream().limit(24).forEach(e -> list1.add(e));
        collect3.stream().skip(24).limit(24).forEach(e -> list2.add(e));
        collect3.stream().skip(48).limit(24).forEach(e -> list3.add(e));
        collect3.stream().skip(72).limit(24).forEach(e -> list4.add(e));
        collect3.stream().skip(96).limit(24).forEach(e -> list5.add(e));

        List<CollectData> collectDataList = new ArrayList<>();

        for (int i = 0; i < 24; i++) {
            CollectData collectData = new CollectData();
            collectData.setCol1(list1.get(i));
            collectData.setCol2(list2.get(i));
            collectData.setCol3(list3.get(i));
            collectData.setCol4(list4.get(i));
            collectData.setCol5(list5.get(i));
            collectDataList.add(collectData);
        }

        model.addAttribute("operations", collectDataList);

        return "data";

    }

    @GetMapping("/examples1")
    public String getbrand(Model model) {

        List<String> collect1 = calc.callMal();

        List<String> collect3 = calc.callPlus(1, 100, 2, 180, 120);

        List<String> collect6 = calc.callMinus(1, 100, 1, 110, 120);

        List<String> collect8 = calc.callDivide();


        List<String> collect10 = calc.callMal2();

        List<String> collect12 = calc.callDivide1();


        List<String> newList = new ArrayList<>();
        collect1.stream().forEach(e -> newList.add(e));
        collect3.stream().forEach(e -> newList.add(e));
        collect6.stream().forEach(e -> newList.add(e));
        collect8.stream().forEach(e -> newList.add(e));
        collect10.stream().forEach(e -> newList.add(e));
        collect12.stream().forEach(e -> newList.add(e));
        Collections.shuffle(newList);
        List<String> collect13 = newList.stream().limit(120).collect(Collectors.toList());
        Collections.shuffle(collect13);

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();


        collect13.stream().limit(24).forEach(e -> list1.add(e));
        collect13.stream().skip(24).limit(24).forEach(e -> list2.add(e));
        collect13.stream().skip(48).limit(24).forEach(e -> list3.add(e));
        collect13.stream().skip(72).limit(24).forEach(e -> list4.add(e));
        collect13.stream().skip(96).limit(24).forEach(e -> list5.add(e));

        List<CollectData> collectDataList = new ArrayList<>();

        for (int i = 0; i < 24; i++) {
            CollectData collectData = new CollectData();
            collectData.setCol1(list1.get(i));
            collectData.setCol2(list2.get(i));
            collectData.setCol3(list3.get(i));
            collectData.setCol4(list4.get(i));
            collectData.setCol5(list5.get(i));
            collectDataList.add(collectData);
        }

        model.addAttribute("operations", collectDataList);

        return "data";
    }
}

