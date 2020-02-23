import javax.swing.JOptionPane;

class ShowTwoNumbers {
    public static void main(String[] args) {
        String num1, num2;
        String notification = "You've just entered ";

        num1 = JOptionPane.showInputDialog(null, "Please enter the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        notification += num1 + " and ";

        num2 = JOptionPane.showInputDialog(null, "Please enter the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        notification += num2;

        JOptionPane.showMessageDialog(null, notification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}