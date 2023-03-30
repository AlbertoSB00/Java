import java.time.LocalDate;

public class Student {
    private String idCard;
    private String fullName;
    private LocalDate birthDate;

    public Student(String idCard, String fullName, LocalDate birthDate){
        this.idCard = idCard;
        this.fullName = fullName;
        this.birthDate = birthDate;
    }

    public String getIdCard() { return idCard; }
    public void setIdCard(String idCard) { this.idCard = idCard; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    @Override
    public String toString() {
        return "Student{" +
                "idCard='" + idCard + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}