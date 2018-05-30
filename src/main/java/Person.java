


import javax.persistence.*;

@Entity
public class Person {


    @Id
    @GeneratedValue

    private int personId;

    private String personName;

    private PersonDetail personDetail;

    @OneToOne(cascade = CascadeType.ALL )
    @Column(name = "pDetail_FK")
    public PersonDetail getPersonDetail() {
        return personDetail;
    }

    public void setPersonDetail(PersonDetail personDetail) {
        this.personDetail = personDetail;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
