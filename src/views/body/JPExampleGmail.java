package views.body;

import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPExampleGmail extends JPanel {

    public JPExampleGmail(){
        setLayout(new BorderLayout());
        setAlignmentX(CENTER_ALIGNMENT);
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {
        addJLabelExample();
    }

    private void addJLabelExample() {
        JLabel jlExampleGmail = new JLabel();
        jlExampleGmail.setHorizontalTextPosition(JLabel.CENTER);
        jlExampleGmail.setVerticalAlignment(JLabel.BOTTOM);
        //jlExampleGmail.setPreferredSize(new Dimension(1366,603));
        jlExampleGmail.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.BANNER_GMAIL)));
        jlExampleGmail.setBorder(null);
        add(jlExampleGmail,BorderLayout.PAGE_START);
    }
}
