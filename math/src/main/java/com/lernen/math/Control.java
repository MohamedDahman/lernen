package com.lernen.math;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class Control {


    private WordRepository wordRepository;


    private Calc calc;


    public Control(WordRepository wordRepository, Calc calc) {
        this.wordRepository = wordRepository;
        this.calc = calc;
    }

    @GetMapping("/addWord")
    public String  addbrand(Model model) {

        return "addWord";
    }

    @PostMapping("/brand")
    public void addbrand(@Valid String arabic, @Valid String article,@Valid String german, @Valid String english) {

    }

        @GetMapping("/words")
        public String wordsList (Model model){
            return "wordList";
        }

        @GetMapping("/examples")
        public String data (Model model){
            List<String> collect3 = calc.callPlus1();
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
        public String getbrand (Model model){

            List<String> collect1 = calc.callMal();

            List<String> collect3 = calc.callPlus();

            List<String> collect6 = calc.callMinus();

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

