import javax.swing.JOptionPane;

class ShowTwoNumbers {
    public static void main(String[] args) {
        String num1, num2;
        String notification = "You've just entered ";
        double num_1, num_2;

        try {
            num1 = JOptionPane.showInputDialog(null, "Please enter the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
            notification += num1 + " and ";
            num_1 = Double.parseDouble(num1);

            num2 = JOptionPane.showInputDialog(null, "Please enter the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
            notification += num2;
            num_2 = Double.parseDouble(num2);
            
            JOptionPane.showMessageDialog(null, notification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }  
    }
}