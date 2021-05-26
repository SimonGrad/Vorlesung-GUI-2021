package combined.customer.business;


import combined.email.business.EmailServiceFactory;
import combined.email.business.api.EmailDto;
import combined.email.business.api.EmailService;
import combined.email.business.impl.EmailServiceDummyImpl;

public class CustomerServiceImpl implements CustomerService {

    private EmailService emailService = EmailServiceFactory.createEmailService();

    @Override
    public void registerNewCustomer(CustomerDto newCustomer) {
        //this.emailService.sendEmail(new EmailDto("wellcome...", "address"));
        //do stuff
        emailService.sendEmail(new EmailDto(null, null, null));
    }
}
