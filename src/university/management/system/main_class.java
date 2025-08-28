package university.management.system;

import javax.swing.*;
import java.awt.*;

public class main_class extends JFrame {
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





        setJMenuBar(mb);

        setSize(1540,850);
        setVisible(true);
    }
    public static void main(String[] args) {
        new main_class();
    }
}
