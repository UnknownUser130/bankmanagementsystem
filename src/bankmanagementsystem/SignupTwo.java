/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;

/**
 *
 * @author admin
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    long random;
    JRadioButton syes,sno,exyes,exno;
    JTextField pan,aadhar;
    JButton next;
    JComboBox religion,category,income,occupation,education;
    String formno;
    SignupTwo(String formno){
        
        this.formno=formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails=new JLabel("Page 2:Additional Details:");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name=new JLabel("Religion");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        
        String[] valReligion={"Hindu","Muslim","Sikh","Christian","Jain","Buddhist","Others"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname=new JLabel("Category");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String[] valcategory={"General","OBC","SC","ST","Other"};
        category=new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob=new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String[] valincome={"0-1,00,000","1,10,000-3,50,000","3,60,000-7,50,000","More than 8,00,000"};
        income=new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel gender=new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        JLabel email=new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String[] valeducation={"Non-Graduate","Graduate","Post-Graduate","Doctorate","Other"};
        education=new JComboBox(valeducation);
        education.setBounds(300,300,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel marital=new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String[] valoccupation={"Salaried","Self-Employed","Student","Retired","Other"};
        occupation=new JComboBox(valoccupation);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        JLabel address=new JLabel("Pan No:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel city=new JLabel("Aadhar No:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel state=new JLabel("Senior citizen");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,60,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup sop = new ButtonGroup();
        sop.add(syes);
        sop.add(sno);
              
        JLabel pincode=new JLabel("Existing account");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        exyes = new JRadioButton("Yes");
        exyes.setBounds(300,590,60,30);
        exyes.setBackground(Color.WHITE);
        add(exyes);
        
        exno = new JRadioButton("No");
        exno.setBounds(450,590,120,30);
        exno.setBackground(Color.WHITE);
        add(exno);
        
        ButtonGroup exop = new ButtonGroup();
        exop.add(exyes);
        exop.add(exno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String sreligion=(String)religion.getSelectedItem();//returns object so String typecasting 
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen ="No";
        }
        String span=pan.getText();
        String saadhar=aadhar.getText();
        String existingaccount=null;
        if(exyes.isSelected()){
            existingaccount="Yes";
        }else if(exno.isSelected()){
            existingaccount="No";
        }        
       try{
           Conn c=new Conn();
           String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+span+"','"+saadhar+"','"+existingaccount+"')";
           c.s.executeUpdate(query);//DML command execution
       } catch(Exception e){
           System.out.println(e);
       }
       
    }
  
    public static void main(String args[]){
        new SignupTwo("");
    }
    
}

