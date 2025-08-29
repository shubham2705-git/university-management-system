package university.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AddFaculty extends JFrame {
    JTextField textName,textFather;
    JLabel empText;
    JDateChooser cdob;

    Random ran = new Random();

    long f4 = Math.abs(ran.nextLong()%9000L) + 1000L;

    AddFaculty(){

        getContentPane().setBackground(new Color(166,164,252));


        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("serif",Font.BOLD,20));
        add(name);

        textName = new JTextField();
        textName.setBounds(200,150,200,30);
        add(textName);

        JLabel fname = new JLabel("Father Name");
        fname.setBounds(450,150,150,30);
        fname.setFont(new Font("serif",Font.BOLD,20));
        add(fname);

        textFather = new JTextField();
        textFather.setBounds(600,150,150,30);
        add(textFather);

        JLabel empID = new JLabel("Employee ID");
        empID.setBounds(50,200,150,30);
        empID.setFont(new Font("serif",Font.BOLD,20));
        add(empID);

        empText = new JLabel("1409"+f4);
        empText.setBounds(200,200,150,30);
        empText.setFont(new Font("serif",Font.BOLD,20));
        add(empText);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(400,200,150,30);
        dob.setFont(new Font("serif",Font.BOLD,20));
        add(dob);





        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddFaculty() ;
    }
}
