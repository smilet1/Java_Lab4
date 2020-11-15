/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;


import java.io.*;
import java.util.*;

import com.opencsv.*;
/**
 * Список сатрудников
 * @author Максим Усков
 */
public class Employees {
    /**Список сотрудников со всей  информацией */
    List<Person> person;
    /** 
     * Конструктор - создание нового объекта
     * @see Employees#Employees(List)
     */
    public Employees(){
        person=new ArrayList<Person>();
    }
    /**
     * Считывание файла формата csv и заполнение List информацией взятой из этого файла
     * @param csvFilePath путь к файлу
     * @param separator разделитель
     * @param tmp вспомогательный объект для заполнения класса
     */
    public void Read(String csvFilePath) throws Exception { 
        Character separator = ';';
        try (InputStream in = Employees.class.getClassLoader().getResourceAsStream(csvFilePath);
                CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), separator)) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine=reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                Person tmp=new Person();
                tmp.set(nextLine);
                person.add(tmp);
            }
            
        }
     
    }
    /**
     * Вывод всего списка
     * @param i счетчик элементов в Листе(Необходим в качестве критерия останова)
     */
    public void Print(){
        int i=0;
        while (i==person.size()-1){
            person.get(i).print();
            i++;
        }
    }
    /**
     * Получение информации о Сотруднике по его месту в списке
     * @param i Позиция сотрудника в списке (отсчет с 0)
     * @return Информацию о Сотруднике
     */
    public String Get(int i){
        Person tmp=person.get(i);
        return tmp.getAll();
    }
    
}
