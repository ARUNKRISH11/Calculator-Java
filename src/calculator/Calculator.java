/* Java calculator project developed by ARUNKRISHNAN K */
/* Global commands */

package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean operationCliked=false;
	int operation;
	String oldValue;
	int flag;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton divisionButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton multiplicationButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton minusButton;
	JButton pointButton;
	JButton zeroButton;
	JButton additionButton;
	JButton equalButton;
	JButton clearallButton;
	
/*Designing the window and adding buttons for calculations */

	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,100);
		
		displayLabel=new JLabel();
		displayLabel.setFont(new Font("Serif", Font.BOLD, 25));
		displayLabel.setBounds(30, 30, 520, 30);
		displayLabel.setBackground(Color.blue);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(50, 180, 60, 60);
		sevenButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(sevenButton);
		sevenButton.addActionListener(this);
		
		eightButton=new JButton("8");
		eightButton.setBounds(140, 180, 60, 60);
		eightButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(eightButton);
		eightButton.addActionListener(this);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 180, 60, 60);
		nineButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(nineButton);
		nineButton.addActionListener(this);
		
		divisionButton=new JButton("/");
		divisionButton.setBounds(320, 180, 60, 60);
		divisionButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(divisionButton);
		divisionButton.addActionListener(this);
		
		fourButton=new JButton("4");
		fourButton.setBounds(50, 270, 60, 60);
		fourButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(fourButton);
		fourButton.addActionListener(this);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(140, 270, 60, 60);
		fiveButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 270, 60, 60);
		sixButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(sixButton);
		sixButton.addActionListener(this);
		
		multiplicationButton=new JButton("*");
		multiplicationButton.setBounds(320, 270, 60, 60);
		multiplicationButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(multiplicationButton);
		multiplicationButton.addActionListener(this);
		
		oneButton=new JButton("1");
		oneButton.setBounds(50, 360, 60, 60);
		oneButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(oneButton);
		oneButton.addActionListener(this);
		
		twoButton=new JButton("2");
		twoButton.setBounds(140, 360, 60, 60);
		twoButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(twoButton);
		twoButton.addActionListener(this);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 360, 60, 60);
		threeButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(threeButton);
		threeButton.addActionListener(this);
		
		minusButton=new JButton("-");
		minusButton.setBounds(320, 360, 60, 60);
		minusButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(minusButton);
		minusButton.addActionListener(this);
		
		pointButton=new JButton(".");
		pointButton.setBounds(50, 450, 60, 60);
		pointButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(pointButton);
		pointButton.addActionListener(this);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(140, 450, 60, 60);
		zeroButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 450, 60, 60);
		equalButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(equalButton);
		equalButton.addActionListener(this);
		
		additionButton=new JButton("+");
		additionButton.setBounds(320, 450, 60, 60);
		additionButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(additionButton);
		additionButton.addActionListener(this);
		
		clearallButton=new JButton("CLEAR ALL");
		clearallButton.setBounds(50, 90, 330, 60);
		clearallButton.setFont(new Font("Serif", Font.BOLD, 25));
		jf.add(clearallButton);
		clearallButton.addActionListener(this);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

/* Providing usage instructions to each buttons to work properly*/

	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==oneButton) {
			if(operationCliked==true) {
				displayLabel.setText("1");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()==twoButton) {
			if(operationCliked==true) {
				displayLabel.setText("2");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()==threeButton) {
			if(operationCliked==true) {
				displayLabel.setText("3");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if(e.getSource()==fourButton) {
			if(operationCliked==true) {
				displayLabel.setText("4");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()==fiveButton) {
			if(operationCliked==true) {
				displayLabel.setText("5");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()==sixButton) {
			if(operationCliked==true) {
				displayLabel.setText("6");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource()==sevenButton) {
			if(operationCliked==true) {
				displayLabel.setText("7");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}else if(e.getSource()==eightButton) {
			if(operationCliked==true) {
				displayLabel.setText("8");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}else if(e.getSource()==nineButton) {
			if(operationCliked==true) {
				displayLabel.setText("9");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource()==zeroButton) {
			if(operationCliked==true) {
				displayLabel.setText("0");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}else if(e.getSource()==pointButton) {
			if(operationCliked==true) {
				displayLabel.setText(".");
				operationCliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}else if(e.getSource()==equalButton) {
			
		String newValue=displayLabel.getText();
		
		float oldValue1=Float.parseFloat(oldValue);
		float newValue1=Float.parseFloat(newValue);
		
		if(flag==1) {
			float result=oldValue1+newValue1;
			displayLabel.setText(result+"");
		}else if(flag==2) {
			float result=oldValue1-newValue1;
			displayLabel.setText(result+"");
		}else if(flag==3) {
			float result=oldValue1*newValue1;
			displayLabel.setText(result+"");
		}else if(flag==4) {
			float result=oldValue1/newValue1;
			displayLabel.setText(result+"");
		}
		}
		else if(e.getSource()==additionButton) {
			flag=1;
			operationCliked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText(displayLabel.getText()+"+");
		}else if(e.getSource()==minusButton) {
			flag=2;
			operationCliked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText(displayLabel.getText()+"-");
		}else if(e.getSource()==multiplicationButton) {
			flag=3;
			operationCliked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText(displayLabel.getText()+"*");
		}else if(e.getSource()==divisionButton) {
			flag=4;
			operationCliked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText(displayLabel.getText()+"/");
		}else if(e.getSource()==clearallButton) {
			displayLabel.setText("");
		}
		
	}
	
}