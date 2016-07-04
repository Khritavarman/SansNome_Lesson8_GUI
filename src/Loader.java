import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Akharu on 6/5/2016.
 */
public class Loader {
    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame();
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
    }

        /*WindowA windowA = new WindowA();
        FormA formA = new FormA();
        windowA.setContentPane(formA.getRootPanel());
        WindowB windowB = new WindowB();
        FormB formB = new FormB();
        windowB.setContentPane(formB.getRootPanel());
        windowA.setVisible(true);

        Action act = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (windowA.isVisible()) {
                    convertToB(formA, formB);
                    switchWindows(windowB, windowA);
                } else if(windowB.isVisible()) {
                    convertToA(formA, formB);
                    switchWindows(windowA, windowB);
                }
            }
        };

        KeyStroke key = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, InputEvent.CTRL_MASK);
        formA.getSwitch1to2Button().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(key, "act");
        formA.getSwitch1to2Button().getActionMap().put("act", act);
        formB.getSwitch2to1Button().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(key, "act");
        formB.getSwitch2to1Button().getActionMap().put("act", act);

        formA.getSwitch1to2Button().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (isMainFieldsFilled(formA)) {
                    convertToB(formA, formB);
                    switchWindows(windowB, windowA);
                } else {
                    JOptionPane.showConfirmDialog(formA.getRootPanel(),
                            "Please, type name and surname",
                            "Please, type name and surname",
                            JOptionPane.YES_NO_OPTION);
                }
            }
        });

        formB.getSwitch2to1Button().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                convertToA(formA, formB);
                switchWindows(windowA, windowB);
            }
        });
    }

    public static void switchWindows(JFrame windowVisible, JFrame windowInvisible) {
        windowVisible.setVisible(true);
        windowInvisible.setVisible(false);
    }

    public static void convertToA (FormA formA, FormB formB) {
        String[] text = formB.getFio().getText().trim().split("[\\s]+");
        try {
            formA.getSurname().setText(text[0]);
            formA.getName().setText(text[1]);
            formA.getSecondName().setText(text[2]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            e1.printStackTrace();
        }
    }

    public static boolean isMainFieldsFilled(FormA formA){
        return (!formA.getSurname().getText().equals("") && !formA.getName().getText().equals(""));
    }

    public static boolean isSecondNameFilled(FormA formA) {
        return (!formA.getName().getText().equals(""));
    }

    public static void convertToB(FormA formA, FormB formB) {
        String text = formA.getSurname().getText() + " " + formA.getName().getText() + " " + formA.getSecondName().getText();
        formB.getFio().setText(text);
    }*/
}


/*        windowA.setFocusable(true);
        formA.getRootPanel().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.isControlDown()){
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        formA.getSwitch1to2Button().doClick();
                    }
                }
            }
        });

        windowB.setFocusable(true);
        formB.getRootPanel().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.isControlDown()){
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        formB.getSwitch2to1Button().doClick();
                    }
                }
            }
        });*/
