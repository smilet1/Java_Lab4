/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

/**
 * Информация о Подразделении
 * @author Максим Усков
 */
public class Subdivision {
    /** Название Подразделения */
    private String Division;
    /** ID Подразделения */
    private int id;
    /**
     * Заполнение полей класса
     * @param Division Название подразделения
     * @param i Вспомогательная переменная для заполнения ID Подразделения
     */
    public void set(String Division,int i){
        this.Division=Division;
        id= 5000+i;
    }
    /**
     * @return Информация о подразделении
     */
    public String get(){
        return Integer.toString(id)+' '+Division;
    }
    /**
     * @return  ID Подразделения
     */
    public int getId(){
        return id;
    }
    /**
     * @return Название Подразделения
     */
    public String getDivision(){
        return Division;
    }
}
