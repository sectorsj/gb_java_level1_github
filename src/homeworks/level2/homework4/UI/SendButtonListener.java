package homeworks.level2.homework4.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendButtonListener implements ActionListener {
    private JTextArea jta;
    private JTextField jtf;
    private StringBuilder sb;

    public SendButtonListener(JTextArea jta, JTextField jtf) {
        this.jta = jta;
        this.jtf = jtf;
        this.sb = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String val = sb.append(jta.getText())
                .toString();
        jtf.setText(val);
        sb.setLength(0);
    }
}
