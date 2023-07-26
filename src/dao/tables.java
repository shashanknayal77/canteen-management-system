/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class tables {
      public static void main(String[] args)
    {
        try{
            String userTable="create table User(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileno varchar(10),address varchar(200),password varchar(200),securityquestion varchar(20),answer varchar(200),status varchar(20),UNIQUE(email))";
            String adminDetails="insert into user(name,email,mobileno,address,password,securityquestion,answer,status)values('admin','admin@gmail.com',1234567890,'india','admin','what is ur nickname?','abc','true')";
            String categorytable="create table category (id int AUTO_INCREMENT primary key,name varchar(200))";
            String producttable="create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            String billtable="create table bill(id int primary key,name varchar(200),mobileno varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
            Dboperations.setDataOrDelete(userTable,"User Table created Successfully"); 
            Dboperations.setDataOrDelete(adminDetails,"admin details added Successfully");
            Dboperations.setDataOrDelete(categorytable,"category table added Successfully");
            Dboperations.setDataOrDelete(producttable,"product table created Successfully");
            Dboperations.setDataOrDelete(billtable,"bill table table created Successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
