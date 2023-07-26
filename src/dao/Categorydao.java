/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;
/**
 *
 * @author user
 */
public class Categorydao {
    public static void save(Category category)
    {
    String query="insert into category(name) values('"+category.getName()+"')";
    Dboperations.setDataOrDelete(query,"category added successfully");
    }
    public static ArrayList<Category> getAllRecords(){
    ArrayList<Category> arrayList=new ArrayList<>();
    try{
     ResultSet rs=Dboperations.getData("select * from category");
     while(rs.next())
           {
               Category category= new Category();
               category.setId(rs.getInt("id"));
               category.setName(rs.getString("name"));
               arrayList.add(category);
           }
    }
    catch(Exception e)
    {
       JOptionPane.showConfirmDialog(null,e);
    }
    return arrayList;
    }
    public static void delete(String id)
    {
      String query="delete from category where id='"+id+"'";
      Dboperations.setDataOrDelete(query,"category deleted successfully");
    }
    
    
}
