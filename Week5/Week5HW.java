import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalJFrame extends JFrame implements ActionListener{
    private JPanel mainPane;
    private JPanel contPane;
    CalJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello JFrame");
        setVisible(true);

        mainPane = new JPanel();
        contPane = new JPanel();
        setBounds(400,100,300,400);
        mainPane.setBounds(0, 0, 100, 100);
        
        mainPane.setLayout(new BorderLayout());
        
        setContentPane(mainPane);
        contPane.setLayout(new GridLayout(5,3,10,10));
        //setContentPane(contPane);

        Font font1 = new Font("SansSerif", Font.BOLD, 32);
    
        JTextField tf = new JTextField();
        tf.setFont(font1);
        mainPane.add(tf,BorderLayout.NORTH);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(this);
        contPane.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(this);
        contPane.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(this);
        contPane.add(btn3);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(this);
        contPane.add(btn4);
        
        JButton btn5 = new JButton("5");
        btn5.addActionListener(this);
        contPane.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(this);
        contPane.add(btn6);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(this);
        contPane.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(this);
        contPane.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(this);
        contPane.add(btn9);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(this);
        contPane.add(btnPlus);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(this);
        contPane.add(btn0);

        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(this);
        contPane.add(btnMinus);

        JButton btnMulti = new JButton("×");
        btnMulti.addActionListener(this);
        contPane.add(btnMulti);

        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(this);
        contPane.add(btnEqual);

        JButton btnSubstract = new JButton("÷");
        btnSubstract.addActionListener(this);
        contPane.add(btnSubstract);

        mainPane.add(contPane,BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e){
        JButton namBtn = (JButton)e.getSource();
        JOptionPane.showMessageDialog(null,namBtn.getText());
    }
}

public class Week5HW {
    public static void main(String[] args) {
        CalJFrame f1 = new CalJFrame();
    }
}
