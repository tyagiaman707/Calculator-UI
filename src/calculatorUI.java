import javax.swing.*;
import java.awt.*;

public class calculatorUI {
    JFrame frame= new JFrame("Calculator");
    JTextField textbox = new JTextField("0");
    JButton[] buttons= new JButton[20];
    JPanel panel = new JPanel();
    calculatorUI(){
        frame.setSize(480,560);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        addbox();
        frame.setVisible(true);
    }
    private void addbox(){
        textbox.setBounds(20,30,430,40);
        frame.add(textbox);
        textbox.setFont(new Font("arial",Font.PLAIN,20));
        textbox.setHorizontalAlignment(JTextField.RIGHT);
        textbox.setBackground(Color.white);
        textbox.setBorder(BorderFactory.createLineBorder(Color.black,2));
        textbox.setEditable(false);
        addButtons();
    }
    private void addButtons(){
        String[] str= {"Back","CE","C","%","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
        panel.setBounds(20,90,425,410);
        frame.add(panel);
        panel.setLayout(new GridLayout(5,4,5,5));
        for(int i=0;i<20;i++){
            buttons[i]= new JButton(str[i]);
            panel.add(buttons[i]);
            if(i==3 || i==7 || i==11 || i==15 || i==19){
                buttons[i].setForeground(Color.red);
            }
            else{
                buttons[i].setForeground(Color.blue);
            }
            buttons[i].setFont(new Font("arial",Font.PLAIN,25));
        }
    }
    public static void main(String[] args) {
        new calculatorUI();
    }
}