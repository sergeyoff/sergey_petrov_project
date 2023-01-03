package FinalProject_Calc;

import FinalProject_Calc.components.DigitJButton;
import FinalProject_Calc.components.OperatorJButton;

import javax.swing.*;
import java.awt.*;

public class AplicationForm extends JFrame {

    public AplicationForm(String title) {
        super(title);
        setBounds(1100, 100, 280, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setJMenuBar(createMenu());

        setLayout(new BorderLayout());
        add(createTopPanel(), BorderLayout.NORTH);
        add(createCentralPanel(), BorderLayout.CENTER);
        



        setVisible(true);
    }

    private JPanel createCentralPanel() {
        JPanel centrelPanel = new JPanel();
        centrelPanel.setLayout(new BorderLayout());

        centrelPanel.add(createDigitPanel(), BorderLayout.CENTER);
        centrelPanel.add(createOperatorsPanel(), BorderLayout.WEST);


        return centrelPanel;
    }

    private JPanel createOperatorsPanel() {
        JPanel operPanel = new JPanel();
        operPanel.setLayout(new GridLayout(4, 1));

        JButton plus = new OperatorJButton("+");
        operPanel.add(plus);
        JButton minus = new OperatorJButton("-");
        operPanel.add(minus);
        JButton multiply = new OperatorJButton("x");
        operPanel.add(multiply);
        JButton divide = new OperatorJButton("/");
        operPanel.add(divide);


        return operPanel;
    }

    private JPanel createDigitPanel() {
        JPanel digitPanel = new JPanel();
        digitPanel.setLayout(new GridLayout(4,3));

        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new DigitJButton(buttonTitle);
             digitPanel.add(btn);
        }

        JButton calc = new OperatorJButton("=");
        digitPanel.add(calc);

        JButton clear = new OperatorJButton("C");
        digitPanel.add(clear);



        return digitPanel;
    }

    private JPanel createTopPanel() {
            JPanel top = new JPanel();
            top.setLayout(new BorderLayout());
            JTextField inputField = new JTextField();
            inputField.setEditable(false);
            top.add(inputField);
            inputField.setFont(new Font("TimesNewRoman", Font.PLAIN, 30 ));
            inputField.setMargin(new Insets(5, 10, 5, 3));
            inputField.setBackground(new Color(165, 167, 167));
            inputField.setText(" 2 x 2 = 4 ");

        return top;
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("Файл");
        menuBar.add(menuFile);
        menuFile.add(new JMenuItem("Очистить"));
        menuFile.add(new JMenuItem("Выход"));

        menuBar.add(new JMenuItem("Помощь"));
        menuBar.add(new JMenuItem("О программе"));
        return menuBar;
    }
}
