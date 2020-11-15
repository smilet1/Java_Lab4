/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

/**
 * Информация о Сотруднике
 * @author Максим Усков
 */
public class Person {
    /** Id Сотрудника */
    private int id;
    /** Имя Сотрудника */
    private String name;
    /** Пол Сотрудника */
    private String gender;
    /** Дата рождения Сотрудника */
    private String BirthDay;
    /** Зарплата Сотрудника */
    private double Salary;
    /** Информация о подразделении Сотрудника */
    private Subdivision subdivision; 
    /**
     * Конструктор создание объекта
     */
    public Person(){
        subdivision = new Subdivision();
    }
    /**
     * Заполнение полей класса
     * @param str Строка содержашяя информацию о человеке
     */
    public void set(String[] str){
        id = Integer.parseInt(str[0]);
        name = str[1];
        gender= str[2];
        BirthDay=str[3];
        Salary=Double.parseDouble(str[5]);
        subdivision.set(str[4],id);
    }
    /**
     * Вывод на экран всей информации содержащейся в классе
     */
    public void print(){
            System.out.print(id+" "+name+' '+gender + ' ' +BirthDay+' '+ subdivision.get()+' '+ Salary +'\n' );
    }
    /**
     * @return Id Сотрудника
     */
    public int getId(){
        return id;
    }
    /**
     * @return Имени Сотрудника
     */
    public String getName(){
        return name;
    }
    /**
     * @return Пол Сотрудника
     */
    public String getGender(){
        return gender;
    }
    /**
     * @return Дата Рождения Сотрудника
     */
    public String getBirthDay(){
        return BirthDay;
    }
    /**
     * @return Зарплата Сотрудника
     */
    public double getSalary(){
        return Salary;
    }
    /**
     * @return ID подразделения Сотрудника
     */
    public double getSubdivisionId(){
        return subdivision.getId();
    }
    /**
     * @return Название подразделения Сотрудника
     */
    public String getSubdivisionDivision(){
        return subdivision.getDivision();
    }
    /**
     * @return В качестве строки возвращяет всю информацию хранящуюся в классе
     */
    public String getAll(){
        return Integer.toString(id)+" "+name+' '+gender + ' ' +BirthDay+' '+ subdivision.get()+' '+ Double.toString(Salary); 
    }
}
