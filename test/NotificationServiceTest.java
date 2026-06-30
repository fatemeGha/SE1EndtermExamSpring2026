import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    void testDepositNotification() {

        NotificationService service = new NotificationService();

        String result = service.accountDepositNotification();

        assertEquals("Deposit notification sent successfully.", result);
    }

    @Test
    void testWithdrawalNotification() {

        NotificationService service = new NotificationService();

        String result = service.accountWithdrawalNotification();

        assertEquals("Withdrawal notification sent successfully.", result);
    }

    @Test
    void testInstallmentNotification() {

        NotificationService service = new NotificationService();

        String result = service.notificationOfInstallmentDueDate();

        assertEquals("Installment due date notification sent successfully.", result);
    }

    @Test
    void testCreateObject() {

        NotificationService service = new NotificationService();

        assertNotNull(service);
    }

}