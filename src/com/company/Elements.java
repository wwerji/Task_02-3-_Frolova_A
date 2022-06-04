package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Elements {
    List list = new List();
    String c = "";// input
    ArrayList<Integer> elements = new ArrayList<>();

    public void input() throws FileNotFoundException {
        /**
         * чтение из текстового файла input
         */
        String path1 = "\\Users\\admin\\Desktop\\Task_02-3-_Frolova_A-main\\src\\com\\company\\input";
        File input = new File(path1);
        Scanner scan = new Scanner(input);
        while (scan.hasNextInt()) {
            elements.add(scan.nextInt());
        }
    }

    public String getC() {
        for (int i = 0; i < elements.size(); i++) {
            c += elements.get(i) + " ";
        }
        return c;
    }

    public void output() throws FileNotFoundException {
        /**
         * внесение результата текстового файла input в текстовый файл output
         */
        String path2 = "\\Users\\admin\\Desktop\\Task_02-3-_Frolova_A-main\\src\\com\\company\\output";
        File output = new File(path2);
        PrintWriter v = new PrintWriter(output);
        list.setNewelements(elements);
        v.print(list.getStr2());
        v.close();
    }
}