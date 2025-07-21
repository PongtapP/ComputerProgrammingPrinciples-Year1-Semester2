import javax.swing.JOptionPane;
class Swing 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String name=JOptionPane.showInputDialog("Enter Interger??");
		int number=Integer.parseInt(name);
		JOptionPane.showMessageDialog(null,name);
	}
}
