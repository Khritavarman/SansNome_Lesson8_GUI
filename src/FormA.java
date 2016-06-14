import javax.swing.*;

/**
 * Created by Akharu on 6/5/2016.
 */
public class FormA {

    private JPanel rootPanel;
    private JTextField surname;
    private JTextField name;
    private JTextField secondName;
    private JButton switch1to2Button;

    public JPanel getRootPanel() {
        rootPanel.setFocusable(true);
        return rootPanel;
    }

    public JTextField getSecondName() {
        return secondName;
    }

    public JTextField getName() {
        return name;
    }

    public JTextField getSurname() {
        return surname;
    }

    public JButton getSwitch1to2Button() {
        return switch1to2Button;
    }
}
