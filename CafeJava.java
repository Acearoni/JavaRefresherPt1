

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String owedMoneyMessage = ", sorry about that, we owe you $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 4.1;
        double lattePrice = 2.7;
        double cappPrice = 1.8;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        };
        
        // Noah ordered a cappucino. Use an if statement to check the status of his
        // order and print the correct status message. If it is ready, also print the
        // message to display the total. Note: Outcomes may be different depending on
        // what you assigned as the status.
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage + " and " + displayTotalMessage + cappPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        // Sam just ordered 2 lattes, print the message to display their total. 
        //Next, use an if statement to print the appropriate order status message. 
        //Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        double samTotal = 2 * lattePrice;
        System.out.println(customer2 + ", " + displayTotalMessage + samTotal);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else  {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy just realized he was charged for a coffee but had ordered a latte. 
        //Print the total message with the new calculated total (what he owes) to make up the difference.
        double jimmyNewTotal =  dripPrice - lattePrice;
        System.out.println(customer3 + owedMoneyMessage + jimmyNewTotal);
    }
}
