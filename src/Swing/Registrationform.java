package Swing;

import javax.swing.*;
import java.awt.Font;

public class Registrationform {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        JLabel titleLabel = new JLabel("Registration Form");
        titleLabel.setBounds(20, 10, 460, 50);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(titleLabel);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 70, 60, 20);
        frame.add(nameLabel);
        JTextField nameField = new JTextField("Enter your name here!");
        nameField.setBounds(90, 70, 180, 20);
        frame.add(nameField);

        // Contact
        JLabel contactLabel = new JLabel("Contact:");
        contactLabel.setBounds(20, 110, 70, 20);
        frame.add(contactLabel);
        JTextField contactField = new JTextField("Enter your contact number");
        contactField.setBounds(90, 110, 180, 20);
        frame.add(contactField);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 150, 50, 20);
        frame.add(emailLabel);
        JTextField emailField = new JTextField("Enter your email");
        emailField.setBounds(90, 150, 180, 20);
        frame.add(emailField);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 190, 60, 20);
        frame.add(genderLabel);
        JRadioButton maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(90, 190, 60, 20);
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(160, 190, 80, 20);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);

        // Language
        JLabel languagesLabel = new JLabel("Interested in:");
        languagesLabel.setBounds(20, 230, 90, 20);
        frame.add(languagesLabel);

        JCheckBox cCheckBox = new JCheckBox("C");
        cCheckBox.setBounds(110, 230, 40, 20);
        frame.add(cCheckBox);

        JCheckBox cppCheckBox = new JCheckBox("C++");
        cppCheckBox.setBounds(160, 230, 60, 20);
        frame.add(cppCheckBox);

        JCheckBox javaCheckBox = new JCheckBox("Java");
        javaCheckBox.setBounds(220, 230, 60, 20);
        frame.add(javaCheckBox);

        JCheckBox pythonCheckBox = new JCheckBox("Python");
        pythonCheckBox.setBounds(280, 230, 80, 20);
        frame.add(pythonCheckBox);

        // Education Level
        JLabel educationLabel = new JLabel("Department:");
        educationLabel.setBounds(20, 270, 70, 20);
        frame.add(educationLabel);

        String[] educationLevels = {"INFT", "CMPN", "EXCS", "EXTC", "BIOM"};
        JComboBox<String> educationComboBox = new JComboBox<>(educationLevels);
        educationComboBox.setBounds(110, 270, 150, 20);
        frame.add(educationComboBox);

        // Comments
        JLabel commentsLabel = new JLabel("Address:");
        commentsLabel.setBounds(20, 310, 80, 20);
        frame.add(commentsLabel);

        JTextArea commentsArea = new JTextArea("Enter your address here!", 5, 30);
        commentsArea.setBounds(110, 310, 300, 100);
        JScrollPane scrollPane = new JScrollPane(commentsArea);
        scrollPane.setBounds(110, 310, 300, 100);
        frame.add(scrollPane);

        // Submit
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(190, 430, 100, 30);
        frame.add(submitButton);

        frame.setLayout(null);
        frame.setBounds(100, 100, 500, 550);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
