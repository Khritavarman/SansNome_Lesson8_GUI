import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Akharu on 6/6/2016.
 */
public class FormB {

    private Person contact = new Person();
    private JPanel rootPanel;
    private JTextField fio;
    private JButton switch2to1Button;

    public FormB() {


    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JTextField getFio() {
        return fio;
    }

    public JButton getSwitch2to1Button() {
        return switch2to1Button;
    }

    public void setPerson(Person person) {
        contact.setName(person.getName());
        contact.setSurname(person.getSurname());
        contact.setSecondName(person.getSecondName());
    }

    public Person getPerson() {
        String[] text = fio.getText().trim().split("[\\s]+");
        try {
            contact.setName(text[0]);
            contact.setSurname(text[1]);
            contact.setSecondName(text[2]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            e1.printStackTrace();
        }
        return contact;
    }
}
