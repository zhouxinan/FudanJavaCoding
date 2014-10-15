import javax.swing.JOptionPane;

public class TestForJavadoc {
	
	public static char changeUpperCaseToLowerCase(char ch){
		return (char)((int)ch-((int)'A'-(int)'a'));
	}
	
	public static void main(String[] args){
		String in = JOptionPane.showInputDialog("请输入一个大写字母：");
		if(in.charAt(0)>='A'&in.charAt(0)<='Z'){
			JOptionPane.showMessageDialog(null, changeUpperCaseToLowerCase(in.charAt(0)));
		}else{
			JOptionPane.showMessageDialog(null,"对不起，您的输入无效！");
		}
	}
}
