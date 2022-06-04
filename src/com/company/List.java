package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    private String str = "";
    private String str2 = "";
    private ArrayList<Integer> two = new ArrayList<>();
    private ArrayList<Integer> newelements = new ArrayList<>();

    /**
     * @param str считывается строка с текстового поля, переводится в список и сортируется
     */
    public void setStr(String str) {
        this.str = str;
        ArrayList<String> one = new ArrayList<String>(Arrays.asList(str.split(" ")));
        for (int i = 0; i < one.size(); i++) {
            two.add(Integer.valueOf(one.get(i)));
        }
        setNewelements(two);
    }

    /**
     * @param elements сортировка
     */
    public void setNewelements(ArrayList<Integer> elements) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) % 2 != 0) {
                this.newelements.add(elements.get(i));
            }
        }
        setStr2(this.newelements);

    }

    /**
     * @param newelements отсортированный список переводится обратно в строку
     */
    public void setStr2(ArrayList<Integer> newelements) {
        for (int i = 0; i < newelements.size(); i++) {
            str2 += newelements.get(i) + " ";
        }
    }

    public String getStr2() {
        return str2;
    }

}


