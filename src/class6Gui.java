import javax.swing.JOptionPane; // ugradjeni imput za pravljenje GUI aplikacija

public class class6Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello "+name+"!");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        // Ugradjena Integer klasa .parseInt konvertuje string u integer
        JOptionPane.showMessageDialog(null, name+"'s age is "+age+"!");
    }
}
