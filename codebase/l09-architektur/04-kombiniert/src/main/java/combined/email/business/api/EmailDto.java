package combined.email.business.api;

public class EmailDto {
    private String recepient;
    private String summary;
    private String text;

    public EmailDto(String recepient, String summary, String text) {
        this.recepient = recepient;
        this.summary = summary;
        this.text = text;
    }

    public String getRecepient() {
        return recepient;
    }

    public String getSummary() {
        return summary;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "EmailDto{" +
                "recepient='" + recepient + '\'' +
                ", summary='" + summary + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
