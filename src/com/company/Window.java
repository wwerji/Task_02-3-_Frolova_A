package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class Window extends JFrame {
    public Window() throws FileNotFoundException {
        super("List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); //открытие на весь экран = false
        setLocationRelativeTo(null); //расположение по центру
        setSize(400, 100);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3, 5, 5));


        Elements elements = new Elements();
        elements.input();
        elements.output();
        List list = new List();


        panel.add(new JLabel("Write elements: "));
        JTextField textField1 = new JTextField();
        panel.add(textField1);
        JButton input = new JButton("Input");
        panel.add(input);
        ActionListener actionListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(elements.getC());//считываем строку с текстового файла input
            }
        };
        input.addActionListener(actionListener1);//при нажатии на кнопку input


        panel.add(new JLabel("Results: "));
        JTextField textField2 = new JTextField();
        panel.add(textField2);
        JButton output = new JButton("Output");
        panel.add(output);
        getContentPane().add(panel);//добавляет элементы
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textField1.getText();//считываем с текстового поля строку
                list.setStr(a);//сортируем
                textField2.setText(list.getStr2());//возвращаем в ответ
            }
        };
        output.addActionListener(actionListener2);//при нажатии на кнопку output

    }
}

