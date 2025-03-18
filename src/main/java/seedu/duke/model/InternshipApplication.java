package seedu.duke.model;

public class InternshipApplication {
    private String companyName;
    private String jobTitle;
    private ApplicationStatus status;

    public InternshipApplication(String companyName, String jobTitle, ApplicationStatus status) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.status = status;
    }

    public InternshipApplication(String companyName, String jobTitle) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.status = ApplicationStatus.APPLIED;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getStatusToString() {
        return this.status.toString();
    }
}
