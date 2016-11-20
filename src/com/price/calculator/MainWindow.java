package com.price.calculator;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.script.*;

public class MainWindow extends JFrame{
	public static void MainWindow(){
		JFrame mainWindow=new JFrame("¼ÆËãÆ÷");
		mainWindow.setSize(345, 280);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setLocationRelativeTo(null);
		mainWindow.setVisible(true);
		mainWindow.setResizable(false);
		JPanel panel=new JPanel();
		panel.setLayout(null);
		mainWindow.setContentPane(panel);
		JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,symbAdd,symbSub,symbMult,symbDiv,symbEqual,symbPoint,funcCE;
		num1=new JButton("1");
		num2=new JButton("2");
		num3=new JButton("3");
		num4=new JButton("4");
		num5=new JButton("5");
		num6=new JButton("6");
		num7=new JButton("7");
		num8=new JButton("8");
		num9=new JButton("9");
		num0=new JButton("0");
		symbAdd=new JButton("+");
		symbSub=new JButton("-");
		symbMult=new JButton("*");
		symbDiv=new JButton("/");
		symbEqual=new JButton("=");
		funcCE=new JButton("C");
		symbPoint=new JButton(".");
		panel.add(num1);
		panel.add(num2);
		panel.add(num3);
		panel.add(num4);
		panel.add(num5);
		panel.add(num6);
		panel.add(num7);
		panel.add(num8);
		panel.add(num9);
		panel.add(num0);
		panel.add(symbAdd);
		panel.add(symbSub);
		panel.add(symbMult);
		panel.add(symbDiv);
		panel.add(symbEqual);
		panel.add(symbPoint);
		panel.add(funcCE);
		panel.add(symbPoint);
		num1.setBounds(10, 195, 45, 45);
		num2.setBounds(65, 195, 45, 45);
		num3.setBounds(120, 195, 45, 45);
		num4.setBounds(10, 140, 45, 45);
		num5.setBounds(65, 140, 45, 45);
		num6.setBounds(120, 140, 45, 45);
		num7.setBounds(10, 85, 45, 45);
		num8.setBounds(65, 85, 45, 45);
		num9.setBounds(120, 85, 45, 45);
		num0.setBounds(175, 195, 45, 45);
		symbAdd.setBounds(175, 140, 45, 45);
		symbSub.setBounds(175, 85, 45, 45);
		symbMult.setBounds(230, 85, 45, 45);
		symbDiv.setBounds(230, 140, 45, 45);
		symbEqual.setBounds(230, 195, 45, 45);
		funcCE.setBounds(285, 140, 45, 100);
		symbPoint.setBounds(285, 85, 45, 45);
		TextArea text=new TextArea();
		panel.add(text);
		text.setBounds(10, 10, 320, 60);
		num1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"1");
				
			}});
		num2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"2");
			}});
		num3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"3");
				
			}});
		num4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"4");
				
			}});
		num5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"5");
				
			}});
		num6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"6");
				
			}});
		num7.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"7");
				
			}});
		num8.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"8");
				
			}});
		num9.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"9");
				
			}});
		num0.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"0");
				
			}});
		symbAdd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"+");
				
			}});
		symbSub.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"-");
				
			}});
		symbMult.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"*");
				
			}});
		symbDiv.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+"/");
				
			}});
		symbEqual.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.setText(operation(text.getText()));
				
			}});
		funcCE.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				text.setText("");
			}});
		symbPoint.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String temp=text.getText();
				text.setText(temp+".");
			}});
	}
	
	public static String operation(String equation){
		String result=equation;
		ScriptEngine js=new ScriptEngineManager().getEngineByName("JavaScript");
		try
		{
			result=js.eval(result).toString();
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e.toString(), "´íÎó", JOptionPane.ERROR_MESSAGE);
		}
		return result;
	}	
	public static void main(String[] args){
		MainWindow();
	}
}
