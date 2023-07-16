/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Thabiso
 */
public class GreetingsGUI extends JFrame {
    // Panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    // Labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    // TextFields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    // TextArea
    private JTextArea greetingsTxtArea;
    
    // Buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public GreetingsGUI() {
        // Configure the GUI
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700, 750);
        setBackground(Color.YELLOW);
        
        // Create the panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2, 1));
        
        greetingsAreaPnl = new JPanel(new FlowLayout());
        greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 
        1), "Greetings"));
        
        btnPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        // Create the labels
        headingLbl = new JLabel("Greetings App");
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        
        // Create the text fields
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        // Create the text area
        greetingsTxtArea = new JTextArea(40, 50);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [name] [surname]");
        
        // Create the buttons
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        // Add a heading to a heading panel
        headingPnl.add(headingLbl);
        
        // Add name label and textfield to the name panel
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        // Add surname label and textfield to the surname panel
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        // Add the name and surname panel to the collective panel
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        // Add the greetings area to its panel
        greetingsAreaPnl.add(greetingsTxtArea);
        
        // Add buttons to their panel
        btnPnl.add(greetBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        // Add all the panels to the main panel
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        // Add the main panel to the frame's panel
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        
        // make the frame visible
        setVisible(true);
    }
    
}

