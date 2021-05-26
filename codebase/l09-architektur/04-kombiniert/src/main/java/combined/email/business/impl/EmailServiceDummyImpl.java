package combined.email.business.impl;

import combined.email.business.api.EmailDto;
import combined.email.business.api.EmailService;

public class EmailServiceDummyImpl implements EmailService {
    @Override
    public void sendEmail(EmailDto emailDto) {
        System.out.println("Send email " + emailDto);
    }
}
