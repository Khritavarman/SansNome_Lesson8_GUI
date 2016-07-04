import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kostyan on 04.07.2016.
 */
public class MyFrame extends JFrame {

    FormA formA = new FormA();
    FormB formB = new FormB();

    public MyFrame() {
        setSize(400, 300);
        setContentPane(formA.getRootPanel());

        formA.getSwitch1to2Button().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchToB();
            }
        });

        formB.getSwitch2to1Button().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchToA();
            }
        });
    }

    public void switchToB() {
        setContentPane(formB.getRootPanel());
        revalidate();
        repaint();
        formB.getFio().setText(formA.getPerson().getSurname() + " " + formA.getPerson().getName() + " " + formA.getPerson().getSecondName());
    }

    public void switchToA() {
        setContentPane(formA.getRootPanel());
        revalidate();
        repaint();
        formA.setPerson(formB.getPerson());
    }
}
