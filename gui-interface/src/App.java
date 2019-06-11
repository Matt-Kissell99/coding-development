import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class App {

    private JPanel panelMain;
    private JButton testingButtonButton;
    private JCheckBox isThisWorkingCheckBox;
    private JFormattedTextField iSwearThisIsFormattedTextField;

    public App() {
        testingButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("SHALOM!!");
            }
        });
        isThisWorkingCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (isThisWorkingCheckBox.isSelected()) {
                    System.out.println("The checkbox is ticked!!!");
                } else {
                    System.out.println("The checkbox is not ticked!!!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("App");
        myFrame.setSize(1000, 800);
        myFrame.setContentPane(new App().panelMain);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
