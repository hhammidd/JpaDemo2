import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class PersonDetail {

    @Id
    @GeneratedValue
    @JoinColumn(name = "detailId_PK")
    private int personDetailId;
    private String zipCode;
    private String job;
    private double income;


    public int getPersonDetailId() {
        return personDetailId;
    }

    public void setPersonDetailId(int personDetailId) {
        this.personDetailId = personDetailId;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
