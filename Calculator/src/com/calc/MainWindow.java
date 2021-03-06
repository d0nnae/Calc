package com.Calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Dialog.ModalExclusionType;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Window.Type;
import javax.swing.UIManager;

public class MainWindow {

	private JFrame frmSimplecalc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmSimplecalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmSimplecalc = new JFrame();
		frmSimplecalc.setType(Type.UTILITY);
		frmSimplecalc.setTitle("SimpleCalc");
		frmSimplecalc.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmSimplecalc.setResizable(false);
		frmSimplecalc.setBounds(100, 100, 209, 272);
		frmSimplecalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimplecalc.getContentPane().setLayout(null);
		
		JTextArea outputArea = new JTextArea();
		outputArea.setEditable(false);
		outputArea.setLineWrap(true);
		outputArea.setBackground(Color.WHITE);
		outputArea.setBounds(10, 11, 186, 57);
		outputArea.setMargin(new Insets(2, 5, 5, 2));
		frmSimplecalc.getContentPane().add(outputArea);
		
		JButton btnReset = new JButton("C");
		btnReset.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				outputArea.setText("");
				CalculatorMain.reset();
			}
		});
		btnReset.setBounds(10, 79, 39, 23);
		frmSimplecalc.getContentPane().add(btnReset);
		
		//TODO: "1 step back button" integrieren
		
		JButton button = new JButton("(");
		button.setMargin(new Insets(0, 0, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.bracketLeft());
			}
		});
		button.setBounds(59, 79, 39, 23);
		frmSimplecalc.getContentPane().add(button);
		
		JButton button_1 = new JButton(")");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.bracketRight());
			}
		});
		button_1.setBounds(108, 79, 39, 23);
		frmSimplecalc.getContentPane().add(button_1);
		
		JButton button7 = new JButton("7");
		button7.setMargin(new Insets(0, 0, 0, 0));
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.numSeven());
			}
		});
		button7.setBounds(10, 113, 39, 23);
		frmSimplecalc.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.numEigth());
			}
		});
		button8.setBounds(59, 113, 39, 23);
		button8.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.numNine());
			}
		});
		button9.setBounds(108, 113, 39, 23);
		button9.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button9);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.numFour());
			}
		});
		button4.setBounds(10, 147, 39, 23);
		button4.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.numFive());
			}
		});
		button5.setBounds(59, 147, 39, 23);
		button5.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.numSix());
			}
		});
		button6.setBounds(108, 147, 39, 23);
		button6.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button6);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.numOne());
				
			}
		});
		button1.setBounds(10, 181, 39, 23);
		button1.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.numTwo());
			}
		});
		button2.setBounds(59, 181, 39, 23);
		button2.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.numThree());
			}
		});
		button3.setBounds(108, 181, 39, 23);
		button3.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button3);
		
		JButton button_11 = new JButton("+/-");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_11.setBounds(10, 215, 39, 23);
		frmSimplecalc.getContentPane().add(button_11);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				outputArea.append(CalculatorMain.numZero());
			}
		});
		button0.setBounds(59, 215, 39, 23);
		button0.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button0);
		
		
		//TODO: integrate dot-button functionality (delete from userEquation/textarea til first ., next input as integer/delete dot
		JButton button_13 = new JButton(".");
		button_13.setBounds(108, 215, 39, 23);
		frmSimplecalc.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.operatorDivide());
			}
		});
		button_14.setBounds(157, 79, 39, 23);
		button_14.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button_14);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.operatorMultiply());
			}
		});
		btnX.setBounds(157, 113, 39, 23);
		btnX.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(btnX);
		
		JButton button_16 = new JButton("-");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.operatorMinus());
			}
		});
		button_16.setBounds(157, 147, 39, 23);
		button_16.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("+");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(CalculatorMain.operatorPlus());
			}
		});
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_17.setBounds(157, 181, 39, 23);
		button_17.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (CalculatorMain.operatorResult() == "Error") {
					outputArea.setText("Fehler in der Gleichung!");
				} else {
				outputArea.append(" = " + CalculatorMain.operatorResult());
				}
			}
		});
		button_18.setBounds(157, 215, 39, 23);
		button_18.setMargin(new Insets(0, 0, 0, 0));
		frmSimplecalc.getContentPane().add(button_18);
		frmSimplecalc.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnReset, button, button_1, button7, button8, button9, button4, button5, button6, button1, button2, button3, button_11, button0, button_13, button_14, btnX, button_16, button_17, button_18}));
	}
	
}