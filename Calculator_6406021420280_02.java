import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class Calculator_6406021420280_02 implements ActionListener{
    JLabel numberLabel;    
    JTextField textField, txtField;    
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, plus, minus, multi, divide, equal, save, clear, show;    
    JFrame window;
    Cal_02 cal; 

    public Calculator_6406021420280_02() {          
        window = new JFrame("Calculator");       
        Container container = window.getContentPane();       
        container.setLayout( new FlowLayout() );           
        numberLabel = new JLabel( "Enter Number : " );  
        numberLabel.setFont(new Font("Courier New",Font.BOLD,20));     
        container.add( numberLabel );       
        textField = new JTextField( 10 ); 
        textField.setFont(new Font("Courier New",Font.BOLD,20));      
        container.add( textField );  
        txtField = new JTextField( 25 ); 
        txtField.setFont(new Font("Courier New",Font.BOLD,20));      
        container.add( txtField );  

        save = new JButton(" Save "); 
        save.setFont(new Font("Courier New",Font.BOLD,20));       
        save.addActionListener(this);       
        container.add( save ); 
        clear = new JButton(" Clear "); 
        clear.setFont(new Font("Courier New",Font.BOLD,20));       
        clear.addActionListener(this);       
        container.add( clear ); 
        show = new JButton(" Show "); 
        show.setFont(new Font("Courier New",Font.BOLD,20));       
        show.addActionListener(this);       
        container.add( show ); 

        btn7 = new JButton(" 7 "); 
        btn7.setFont(new Font("Courier New",Font.BOLD,20));       
        btn7.addActionListener(this);       
        container.add( btn7 ); 
        btn8 = new JButton(" 8 "); 
        btn8.setFont(new Font("Courier New",Font.BOLD,20));             
        btn8.addActionListener(this);       
        container.add( btn8 );  
        btn9 = new JButton(" 9 ");  
        btn9.setFont(new Font("Courier New",Font.BOLD,20));            
        btn9.addActionListener(this);       
        container.add( btn9 );       
        multi = new JButton(" * ");      
        multi.setFont(new Font("Courier New",Font.BOLD,20));        
        multi.addActionListener(this);
        container.add( multi );    
        
        btn4 = new JButton(" 4 "); 
        btn4.setFont(new Font("Courier New",Font.BOLD,20));             
        btn4.addActionListener(this);       
        container.add( btn4 );
        btn5 = new JButton(" 5 ");     
        btn5.setFont(new Font("Courier New",Font.BOLD,20));         
        btn5.addActionListener(this);       
        container.add( btn5 ); 
        btn6 = new JButton(" 6 "); 
        btn6.setFont(new Font("Courier New",Font.BOLD,20));             
        btn6.addActionListener(this);       
        container.add( btn6 ); 
        divide = new JButton(" / ");     
        divide.setFont(new Font("Courier New",Font.BOLD,20));         
        divide.addActionListener(this);
        container.add( divide );

        btn1 = new JButton(" 1 ");  
        btn1.setFont(new Font("Courier New",Font.BOLD,20));            
        btn1.addActionListener(this);       
        container.add( btn1 );  
        btn2 = new JButton(" 2 ");  
        btn2.setFont(new Font("Courier New",Font.BOLD,20));            
        btn2.addActionListener(this);       
        container.add( btn2 ); 
        btn3 = new JButton(" 3 ");  
        btn3.setFont(new Font("Courier New",Font.BOLD,20));            
        btn3.addActionListener(this);       
        container.add( btn3 ); 
        minus = new JButton(" - ");   
        minus.setFont(new Font("Courier New",Font.BOLD,20));           
        minus.addActionListener(this);
        container.add( minus );

        btn0 = new JButton(" 0 "); 
        btn0.setFont(new Font("Courier New",Font.BOLD,20));             
        btn0.addActionListener(this);       
        container.add( btn0 );
        equal = new JButton(" = "); 
        equal.setFont(new Font("Courier New",Font.BOLD,20));             
        equal.addActionListener(this);       
        container.add( equal );
        plus = new JButton(" + ");      
        plus.setFont(new Font("Courier New",Font.BOLD,20));        
        plus.addActionListener(this);
        container.add( plus );      
                
        window.setAlwaysOnTop(true);
        window.setSize(370,350);       
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        window.setVisible(true);    
    }

    public void actionPerformed( ActionEvent event ){
        

        if (event.getSource() == plus) {
            cal.setValue2(textField.getText());
            cal.setOpt("+");
            cal.setFree();
            textField.setText(cal.toString());
        }
        else if (event.getSource() == minus) {
            cal.setValue2(textField.getText());
            cal.setOpt("-");
            cal.setFree();
            textField.setText(cal.toString());
        }
        else if (event.getSource() == multi) {
            cal.setValue2(textField.getText());
            cal.setOpt("*");
            cal.setFree();
            textField.setText(cal.toString());
        }
        else if (event.getSource() == divide) {
            cal.setValue2(textField.getText());
            cal.setOpt("/");
            cal.setFree();
            textField.setText(cal.toString());
        }
        else if (event.getSource() == btn1) {
            cal.addValue("1");
            textField.setText(cal.toString());
        }
        else if (event.getSource() == btn2) {
            cal.addValue("2");
            textField.setText(cal.toString());
        }
        else if (event.getSource() == btn3) {
            cal.addValue("3");
            textField.setText(cal.toString());
        }
        else if (event.getSource() == btn4) {
            cal.addValue("4");
            textField.setText(cal.toString());
        }
        else if (event.getSource() == btn5) {
            cal.addValue("5");
            textField.setText(cal.toString());
        }
        else if (event.getSource() == btn6) {
            cal.addValue("6");
            textField.setText(cal.toString());
        }
        else if (event.getSource() == btn7) {
            cal.addValue("7");
            textField.setText(cal.toString());
        }
        else if (event.getSource() == btn8) {
            cal.addValue("8");
            textField.setText(cal.toString());
        }
        else if (event.getSource() == btn9) {
            cal.addValue("9");
            textField.setText(cal.toString());
        }
        else if (event.getSource() == btn0) {
            cal.addValue("0");
            textField.setText(cal.toString());
        }
        else if(event.getSource() == equal){
            cal.Cal_Value(textField.getText());
            textField.setText(cal.toString());
            txtField.setText(cal.toString());
        }
        else if(event.getSource() == clear){
            cal.setValue1(0);
            cal.setFree();
            textField.setText(cal.toString());
            txtField.setText(cal.toString());
        }
        else if(event.getSource() == save){
            int value = Integer.parseInt(txtField.getText()); 
            cal.setValue3(value); 
            txtField.setText(""); 
        }
        else if(event.getSource() == show){
            txtField.setText(cal.toString());
        }
        
    }

    public static void main(String[] args) {
        Calculator_6406021420280_02 e1 = new Calculator_6406021420280_02();
        e1.cal = new Cal_02();
        e1.textField.setText(e1.cal.toString());
    }
}
