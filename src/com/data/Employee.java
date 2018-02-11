/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data;

/**
 *
 * @author lab.informtica12
 */
public class Employee {
    private String id;
    private String name;
    private String cellphone;

    public Employee(String id, String name, String cellphone) {
        this.id = id;
        this.name = name;
        this.cellphone = cellphone;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the cellphone
     */
    public String getCellphone() {
        return cellphone;
    }
    /**
     * @param args the command line arguments
     */
   
    
}
