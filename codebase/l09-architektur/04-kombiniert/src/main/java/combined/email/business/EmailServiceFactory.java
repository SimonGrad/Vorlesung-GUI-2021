package combined.email.business;

import combined.email.business.api.EmailService;
import combined.email.business.impl.EmailServiceDummyImpl;

public class EmailServiceFactory {
    public static EmailService createEmailService() {
        return new EmailServiceDummyImpl();
    }
}
