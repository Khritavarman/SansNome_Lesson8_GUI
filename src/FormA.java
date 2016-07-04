import javax.swing.*;

/**
 * Created by Akharu on 6/5/2016.
 */
public class FormA {

    private Person contact = new Person();
    private JPanel rootPanel;
    private JTextField surname;
    private JTextField name;
    private JTextField secondName;
    private JButton switch1to2Button;

    public FormA() {

    }

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

    public void setPerson(Person person) {
        contact.setName(person.getName());
        contact.setSurname(person.getSurname());
        contact.setSecondName(person.getSecondName());
    }

    public Person getPerson() {
        contact.setName(name.getText());
        contact.setSurname(surname.getText());
        contact.setSecondName(secondName.getText());
        return contact;
    }
}
