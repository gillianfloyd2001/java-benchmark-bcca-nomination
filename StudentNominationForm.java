import java.io.Serializable;

public class StudentNominationForm implements Serializable {
    private static final long serialVersionUID = 1L;
    String nominatorName;
    String nominatorEmail;
    String schoolDistrictOrAffilation;
    String nominatorPosition;
    String relationshipToNomimee;
    String nomimeeName;
    String age;
    String contactInfoOfStudent;
    String expectedGraduationDate;
    String aptitude;
    String perseverance;
    String dedication;
    String workEthic;
    String extraInformation;

    public StudentNominationForm(String nominatorName, String nominatorEmail, String schoolDistrictOrAffilation,
            String nominatorPosition, String relationshipToNomiee, String nomimeeName, String age,
            String contactInfoOfStudent, String expectedGraduationDate, String aptitude, String perseverance,
            String dedication, String workEthic, String extraInformation) {
        this.nominatorName = nominatorName;
        this.nominatorEmail = nominatorEmail;
        this.schoolDistrictOrAffilation = schoolDistrictOrAffilation;
        this.nominatorPosition = nominatorPosition;
        this.relationshipToNomimee = relationshipToNomiee;
        this.nomimeeName = nomimeeName;
        this.age = age;
        this.contactInfoOfStudent = contactInfoOfStudent;
        this.expectedGraduationDate = expectedGraduationDate;
        this.aptitude = aptitude;
        this.perseverance = perseverance;
        this.dedication = dedication;
        this.workEthic = workEthic;
        this.extraInformation = extraInformation;

    }
}