package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    main_class(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb = new JMenuBar();

        // new information

        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.white);
        newInfo.add(studentInfo);

        //details

        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        mb.add(details);

        JMenuItem FacultyDetails = new JMenuItem("View Faculty Details");
        FacultyDetails.setBackground(Color.WHITE);
        details.add(FacultyDetails);

        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.white);
        details.add(studentDetails);


         // leave

        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        mb.add(leave);

        JMenuItem FacultyLeave = new JMenuItem("Faculty Leave");
        FacultyLeave.setBackground(Color.WHITE);
        leave.add(FacultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.white);
        leave.add(studentLeave);



         // Leave Details
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
        mb.add(leaveDetails);

        JMenuItem FacultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        FacultyLeaveDetails.setBackground(Color.WHITE);
        leaveDetails.add(FacultyLeaveDetails);

        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.white);
        leaveDetails.add(studentLeaveDetails);


        //exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        mb.add(exam);

        JMenuItem ExaminationDetails = new JMenuItem("Examination Results");
        ExaminationDetails.setBackground(Color.WHITE);
        exam.add(ExaminationDetails);

        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.white);
        exam.add(EnterMarks);

        //update info
        JMenu updateInfo = new JMenu("UpdateInfo");
        updateInfo.setForeground(Color.BLACK);
        mb.add(updateInfo);

        JMenuItem updateFacultyInfo = new JMenuItem("Update Faculty Details");
        updateFacultyInfo.setBackground(Color.WHITE);
        updateInfo.add(updateFacultyInfo);

        JMenuItem updateStudentInfo = new JMenuItem("Update Student Details");
        updateStudentInfo.setBackground(Color.white);
        updateInfo.add(updateStudentInfo);

        //fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLACK);
        mb.add(fee);

        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        fee.add(feeStructure);

        JMenuItem freeForm = new JMenuItem("Student Fee Form");
        freeForm.setBackground(Color.white);
        fee.add(freeForm);

        //utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        mb.add(utility);

        JMenuItem Calculator = new JMenuItem("Calculator");
        Calculator.setBackground(Color.WHITE);
        Calculator.addActionListener(this);
        utility.add(Calculator);

        JMenuItem NotePad = new JMenuItem("NotePad");
        NotePad.setBackground(Color.white);
        NotePad.addActionListener(this);
        utility.add(NotePad);

        //about
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLACK);
        mb.add(about);

        JMenuItem About = new JMenuItem("About");
        About.setBackground(Color.WHITE);
        about.add(About);

        //exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setBackground(Color.WHITE);
        Exit.addActionListener(this);
        exit.add(Exit);




        setJMenuBar(mb);

        setSize(1540,850);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
        if(sm.equals("Exit")){
            System.exit(15);
        }else if(sm.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception E){
                E.printStackTrace();
            }
        }else if(sm.equals("NotePad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception E){
                E.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new main_class();
    }
}
