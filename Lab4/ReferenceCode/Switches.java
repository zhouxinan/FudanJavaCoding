package lab4;

import javax.swing.JOptionPane;

public class Switches {
	public static void main(String[] args){
		String in1 = JOptionPane.showInputDialog(null,"������һ������0��100�����֣�");
		double num1 = Double.parseDouble(in1);
		if(num1>=0&&num1<=100){
		}else{
			JOptionPane.showMessageDialog(null, "�Բ���������Ĳ������֣�");
			System.out.println("�Բ���������Ĳ������֣�");
			System.exit(0);
		}
		String in2 = JOptionPane.showInputDialog(null,"������+-*/��һ�������");
		int temp = 0;
		if(in2.equals("+")){
			temp = 1;
		}
		else if(in2.equals("-")){
			temp = 2;
		}
		else if(in2.equals("*")){
			temp = 3;
		}
		else if(in2.equals("/")){
			temp = 4;
		}else{
			JOptionPane.showMessageDialog(null, "�������˲���ȷ��δ֪���ţ�");
			System.out.println("�������˲���ȷ��δ֪���ţ�");
			System.exit(0);
		}
		String in3 = JOptionPane.showInputDialog(null,"������һ������0��100�����֣�");
		double num2 = Double.parseDouble(in3);
		if(num2>=0&&num2<=100){
			
		}else{
			JOptionPane.showMessageDialog(null, "�Բ���������Ĳ������֣�");
			System.out.println("�Բ���������Ĳ������֣�");
			System.exit(0);
		}
		double ans = 0;
		switch(temp){
		case 1:
			ans = num1 + num2;
			break;
		case 2:
			ans = num1 - num2;
			break;
		case 3:
			ans = num1 * num2;
			break;
		case 4:
			if(num2==0){
				JOptionPane.showMessageDialog(null, "0������Ϊ������");
				System.out.println("0������Ϊ������");
				System.exit(0);
			}
			else{
				ans = num1/num2;
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "���Ϊ"+ans);
	}
}
