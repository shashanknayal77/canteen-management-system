/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class userdao {
    public static void save(User user)
    {
        String query="insert into user(name,email,mobileno,address,password,securityquestion,answer,status)values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileno()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityquestion()+"','"+user.getAnswer()+"','false')";
       Dboperations.setDataOrDelete(query, "Registered Successfully!Wait for admin approval");
    }
    public static User login(String email,String password)
    {
        User user=null;
        try{
           ResultSet rs=Dboperations.getData("select * from user where email='"+email+"' and password='"+password+"'");
           while(rs.next())
           {
               user= new User();
               user.setStatus(rs.getString("status"));
           }

        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null,e);
        }
        return user;
    }
    public static User getSecurityQuestion(String email)
    {
        User user=null;
        try{
           ResultSet rs=Dboperations.getData("select * from user where email='"+email+"'");
           while(rs.next())
           {
               user= new User();
               user.setSecurityquestion(rs.getString("SecurityQuestion"));
               user.setAnswer(rs.getString("answer"));
           }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    public static void update(String email,String newpassword)
    {
        String query="update user set password='"+newpassword+"'where email='"+email+"'";
        Dboperations.setDataOrDelete(query,"password changed successfully");
    }
    public static ArrayList<User> getALLRecords(String email)
    {
        ArrayList<User> arrayList= new ArrayList<User>();
        try{
            ResultSet rs=Dboperations.getData("select * from user where email like'%"+email+"%'");
            while(rs.next())
           {
               User user= new User();
               user.setId(rs.getInt("id"));
               user.setName(rs.getString("name"));
               user.setEmail(rs.getString("email"));
               user.setMobileno(rs.getString("mobileno"));
               user.setAddress(rs.getString("address"));
               user.setSecurityquestion(rs.getString("securityquestion"));
               user.setStatus(rs.getString("status"));
               arrayList.add(user);
           }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return arrayList;
    }
    public static void changeStatus(String email,String status)
    {
        String query="update user set status='"+status+"' where email='"+email+"'";
         Dboperations.setDataOrDelete(query,"status changed successfully");
    }
    public static void Changepassword(String email,String oldpassword,String newpassword)
    {
       try{
       ResultSet rs=Dboperations.getData("select * from user where email ='"+email+"' and password='"+oldpassword+"'");
       if(rs.next()){
           update(email,newpassword);
       }
       else
       {
           JOptionPane.showMessageDialog(null,"old password is wrong");
       }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
    }
    public static void Changesecurityquestion(String email,String password,String question,String answer)
    {
       try{
       ResultSet rs=Dboperations.getData("select * from user where email ='"+email+"' and password='"+password+"'");
       if(rs.next()){
           update(email,question,answer);
       }
       else
       {
           JOptionPane.showMessageDialog(null," password is wrong");
       }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
    }
    public static void update(String email,String question,String answer)
    {
        String query="update user set securityquestion='"+question+"',answer='"+answer+"'where email='"+email+"'";
        Dboperations.setDataOrDelete(query,"Security question updated successfully");
    }
}
