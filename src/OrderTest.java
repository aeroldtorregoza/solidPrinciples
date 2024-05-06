public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        InvoiceGenerator invoiceGenerator = new InvoiceAction();
        invoiceGenerator.generateInvoice("order_123.pdf");

        EmailNotifier emailNotifier = new EmailNotificationAction();
        emailNotifier.sendEmailNotification("johndoe@example.com");
    }
}
