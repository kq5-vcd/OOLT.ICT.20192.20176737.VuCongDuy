import javax.swing.JOptionPane;

class ShowQuotient {
    public static void main(String[] args) {
        String num1, num2;
        String notification = "You've just entered ";
        double dividend, divisor;

        try {
            num1 = JOptionPane.showInputDialog(null, "Please enter the dividend: ", "Input dividend", JOptionPane.INFORMATION_MESSAGE);
            notification += num1 + " and ";
            dividend = Double.parseDouble(num1);

            num2 = JOptionPane.showInputDialog(null, "Please enter the divisor: ", "Input divisor", JOptionPane.INFORMATION_MESSAGE);
            notification += num2;
            divisor = Double.parseDouble(num2);
            
            notification += "\nThe quotient of the two numbers is " + String.valueOf(dividend / divisor);

            JOptionPane.showMessageDialog(null, notification, "Show quotient", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }  
    }   
}