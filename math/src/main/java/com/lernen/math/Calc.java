package com.lernen.math;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Calc {

    public List<String> buildRest() {
        List<NumObject> numObjects = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 10; j++) {
                NumObject numObject = new NumObject(i, j);
                numObjects.add(numObject);
            }
        }
        Collections.shuffle(numObjects);
        List<NumObject> collect = numObjects.stream().limit(100).collect(Collectors.toList());
        List<String> collect1 = collect.stream().map(e -> e.getFirstNum() + ":" + e.getSecondNum().toString() + " = _____" + " R " + "_____").collect(Collectors.toList());
        return collect1;
    }

    public List<String> callMal() {

        List<NumObject> numObjects = new ArrayList<>();

        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                NumObject numObject = new NumObject(i, j);
                numObjects.add(numObject);
            }
        }

        Collections.shuffle(numObjects);
        List<NumObject> collect = numObjects.stream().limit(20).collect(Collectors.toList());
        List<String> collect1 = collect.stream().map(e -> e.getFirstNum() + " . " + e.getSecondNum().toString() + " = ____ ").collect(Collectors.toList());

        return collect1;
    }


    public List<String> callMinus(Integer fromValue1, Integer toValue1, Integer fromValue2, Integer toValue2, Integer counts) {
        List<NumObject> numObjects3 = new ArrayList<>();
        for (int i = fromValue1; i <= toValue1; i++) {
            for (int j = fromValue2; j <= toValue2; j++) {
                NumObject numObject = new NumObject(i, j);
                numObjects3.add(numObject);
            }
        }
        List<NumObject> collect4 = numObjects3.stream().filter(e -> e.getFirstNum() - e.getSecondNum() > 0).collect(Collectors.toList());
        Collections.shuffle(collect4);
        List<NumObject> collect5 = collect4.stream().limit(counts).collect(Collectors.toList());
        List<String> collect6 = collect5.stream().map(e -> e.getFirstNum() + " - " + e.getSecondNum().toString() + " = ____").collect(Collectors.toList());
        return collect6;
    }

    public List<String> callDivide() {
        List<NumObject> numObjects4 = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                NumObject numObject = new NumObject(i, j);
                numObjects4.add(numObject);
            }
        }
        Collections.shuffle(numObjects4);
        List<NumObject> collect7 = numObjects4.stream().limit(20).collect(Collectors.toList());
        List<String> collect8 = collect7.stream().map(e -> e.getFirstNum() * e.getSecondNum() + " : " + e.getSecondNum().toString() + " = ____").collect(Collectors.toList());
        return collect8;
    }


    public List<String> callMal2() {
        List<NumObject> numObjects5 = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                NumObject numObject = new NumObject(i, j);
                numObjects5.add(numObject);
            }
        }
        Collections.shuffle(numObjects5);
        List<NumObject> collect9 = numObjects5.stream().limit(20).collect(Collectors.toList());
        List<String> collect10 = collect9.stream().map(e -> e.getFirstNum() + " . " + " _____ " + " = " + e.getFirstNum() * e.getSecondNum()).collect(Collectors.toList());
        return collect10;
    }

    public List<String> callDivide1() {

        List<NumObject> numObjects6 = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                NumObject numObject = new NumObject(i, j);
                numObjects6.add(numObject);
            }
        }
        Collections.shuffle(numObjects6);
        List<NumObject> collect11 = numObjects6.stream().limit(20).collect(Collectors.toList());
        List<String> collect12 = collect11.stream().map(e -> e.getFirstNum() * e.getSecondNum() + " :  _____ " + " = " + e.getSecondNum()).collect(Collectors.toList());
        return collect12;
    }


    public List<String> callPlus(Integer fromValue1, Integer toValue1, Integer fromValue2, Integer toValue2, Integer counts) {
        List<NumObject> numObjects1 = new ArrayList<>();
        for (int i = fromValue1; i <= toValue1; i++) {
            for (int j = fromValue2; j <= toValue2; j++) {
                NumObject numObject = new NumObject(i, j);
                numObjects1.add(numObject);
            }
        }
        Collections.shuffle(numObjects1);
        List<NumObject> collect2 = numObjects1.stream().limit(counts).collect(Collectors.toList());
        List<String> collect3 = collect2.stream().map(e -> e.getFirstNum() + " + " + e.getSecondNum().toString() + " = ____").collect(Collectors.toList());

        return collect3;
    }

    public List<String> malLernen(Integer fromValue, Integer toValue, Integer counts) {
        List<NumObject> numObjects1 = new ArrayList<>();
        for (int i = fromValue; i <= toValue; i++) {
            for (int j = fromValue; j <= toValue; j++) {
                NumObject numObject = new NumObject(i, j);
                numObjects1.add(numObject);
            }
        }
        List<String> collect3 = new ArrayList<>();
        Collections.shuffle(numObjects1);
        List<NumObject> collect2 = numObjects1.stream().limit(counts).collect(Collectors.toList());
        for (NumObject numObject : collect2) {
            String tmp = "";
            for (int i = 1; i < numObject.getSecondNum(); i++) {
                tmp = tmp + " ___ + ";
            }
            tmp = tmp + " ___ = _____";
            collect3.add(numObject.getFirstNum() + " × " + numObject.getSecondNum() + " = " + tmp);


        }
        //List<String> collect3 = collect2.stream().map(e -> e.getFirstNum() + " × " + e.getSecondNum().toString()).collect(Collectors.toList());

        return collect3;

    }

}
