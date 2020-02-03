import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Thank you for Nominating a Student:");
        System.out.println("Nominator Information \nPlease tell us a little more about you.");
        ArrayList<StudentNominationForm> nomineeForms = loadNomineeForms();
        informationOnNominatorAndNomineeAndWhyShouldGetIn();

        saveNomineeForms(nomineeForms);
    }

    private static ArrayList<StudentNominationForm> loadNomineeForms() {
        try {
            FileInputStream fileStream = new FileInputStream("nominationForm.ser");
            ObjectInputStream objInput = new ObjectInputStream(fileStream);
            ArrayList<StudentNominationForm> nomineeForms = (ArrayList<StudentNominationForm>) objInput.readObject();
            objInput.close();
            return nomineeForms;
        } catch (IOException | ClassNotFoundException | ClassCastException ex) {
            return new ArrayList<StudentNominationForm>();
        }
    }

    private static void saveNomineeForms(ArrayList<StudentNominationForm> nomineeForms) {
        try {
            FileOutputStream fileStream = new FileOutputStream("nominationForm.ser");
            ObjectOutputStream objOutput = new ObjectOutputStream(fileStream);
            objOutput.writeObject(nomineeForms);
            objOutput.close();
        } catch (IOException ex) {
            System.out.print("Sorry, can not save attenedence");
        }
    }

    private static StudentNominationForm informationOnNominatorAndNomineeAndWhyShouldGetIn() {
        System.out.println("Your Name: ");
        String nominatorName = in.nextLine();
        System.out.println("Email Address: ");
        String nominatorEmail = in.nextLine();
        System.out.println("School District/Affiliation: ");
        String schoolDistrictOrAffilation = in.nextLine();
        System.out.println("Position: ");
        String nominatorPosition = in.nextLine();
        System.out.println("Relationship to Nominee: ");
        String relationshipToNomiee = in.nextLine();
        System.out.println("\nNominee \nPlease share more about the nominee!");
        System.out.print("Name of Nominee: ");
        String nomimeeName = in.nextLine();
        System.out.println("Age of Nominee: ");
        String age = in.nextLine();
        System.out.println("Student contact information: ");
        String contactInfoOfStudent = in.nextLine();
        System.out.println("Expected Graduation Date (MM/DD/YYYY): ");
        String expectedGraduationDate = in.nextLine();
        System.out.println(
                "\nBase Camp Coding Academy looks for students with the aptitude and dedication to succeed in this program. Please explain why you believe this student will make an excellent candidate: \n");
        System.out.println(
                "\nAptitude: Do you have any experiences when this student has demonstrated a strong ability you think logically and/or strategically?\n");
        String aptitude = in.nextLine();
        System.out.println(
                "\nPerseverance: Is there any evidence of the applicant being engaged in something they are passionate about?\n");
        String perseverance = in.nextLine();
        System.out.println(
                "\nDedication: Do you think the applicant would be able to reliably attend the program five days a week in Water Valley?\n");
        String dedication = in.nextLine();
        System.out.println("\nWork Ethic/Heart: Why does this student deserve a position at Base Camp? \n");
        String workEthic = in.nextLine();
        System.out.println("\nAnything else you'd like to share about this nominee?\n");
        String extraInformation = in.nextLine();

        return new StudentNominationForm(nominatorName, nominatorEmail, schoolDistrictOrAffilation, nominatorPosition,
                relationshipToNomiee, nomimeeName, age, contactInfoOfStudent, expectedGraduationDate, aptitude,
                perseverance, dedication, workEthic, extraInformation);

    }
}