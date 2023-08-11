package Swing;
import javax.swing.*;
public class Registrationform {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration");
        JLabel l = new JLabel("Registration form");
        l.setBounds(20,10,500,50);
        f.add(l);
        // Name
        JLabel namelabel = new JLabel("Name : ");
        namelabel.setBounds(20,60,50,20);
        f.add(namelabel);
        JTextField name = new JTextField("Enter your name here!");
        name.setBounds(80,60,140,20);
        f.add(name);

        // Contact
        JLabel contactlabel = new JLabel("Contact : ");
        contactlabel.setBounds(20,100,70,20);
        f.add(contactlabel);
        JTextField contact = new JTextField();
        contact.setBounds(80,100,140,20);
        f.add(contact);

        // Email
        JLabel emaillabel = new JLabel("Email : ");
        emaillabel.setBounds(20,140,70,20);
        f.add(emaillabel);
        JTextField email = new JTextField();
        email.setBounds(80,140,140,20);
        f.add(email);

        // Gender
        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(20,170,70,20);
        f.add(gender);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(80,170,60,20);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(160,170,90,20);
        ButtonGroup grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);
        f.add(male);
        f.add(female);

        // Language
        JLabel languages = new JLabel("Interested in");
        languages.setBounds(20,190,80,20);
        f.add(languages);

        JCheckBox c = new JCheckBox("C");
        c.setBounds(120,190,60,20);
        f.add(c);

        JCheckBox cpp = new JCheckBox("C++");
        cpp.setBounds(190,190,60,20);
        f.add(cpp);

        JCheckBox java = new JCheckBox("Java");
        java.setBounds(250,190,70,20);
        f.add(java);

        JCheckBox python = new JCheckBox("Python");
        python.setBounds(320,190,80,20);
        f.add(python);

        // Submit
        JButton b =  new JButton("Submit");
        b.setBounds(190,230,100,20);
        f.add(b);
        f.setLayout(null);
        f.setBounds(100,100,500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}