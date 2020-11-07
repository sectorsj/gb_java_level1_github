package homeworks.level2.homework4.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class AppChatClass {
    private JFrame mainFrame;

    public AppChatClass() {
        mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setTitle("App chat");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(100, 100,300, 500);

        JPanel top = new JPanel();
        mainFrame.add(top, BorderLayout.NORTH);
        JPanel bottom = new JPanel();
        mainFrame.add(bottom, BorderLayout.CENTER);

        //Многострочное текстовое поле
        JTextArea jta = new JTextArea();
        top.setLayout(new BorderLayout());
        jta.setPreferredSize(new Dimension(top.getWidth(), 400));
        top.add(jta);
        //Однострочное текстовое поле
        JTextField jtf = new JTextField();
        bottom.setLayout(new BorderLayout());
        bottom.add(jtf);


        //Button
        JButton jbt = new JButton("SEND");
        jbt.setLayout(new BorderLayout());
        mainFrame.add(jbt, BorderLayout.SOUTH);

        SendButtonListener sendButtonListener = new SendButtonListener(jta, jtf);
        jbt.addActionListener(sendButtonListener);



        mainFrame.setVisible(true);

    }
}
