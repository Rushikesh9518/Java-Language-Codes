
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Library {

    String libaryName;
    int noOfStudents;
    int fees;
    int noofDesk;

    Library(String libraryName, int noOfStudents, int fees, int noofDesk) {

        this.libaryName = libraryName;
        this.noOfStudents = noOfStudents;
        this.fees = fees;
        this.noofDesk = noofDesk;
    }

    void libraryInfo() {

        System.out.println("LIBRARY INFO :");
        System.out.println("Name : " + libaryName);
        System.out.println("total students : " + noOfStudents);
        System.out.println("fees : " + fees);
        System.out.println("total Desk : " + noofDesk);
    }
}

public class PassArgtoConstructor {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter library name : ");
        String libName = br.readLine();

        System.out.print("Enter noOfStudent : ");
        int noOfStudent = Integer.parseInt(br.readLine());

        System.out.print("Enter noOfDesk : ");
        int noOfDesk = Integer.parseInt(br.readLine());

        System.out.print("Enter fees : ");
        int fees = Integer.parseInt(br.readLine());

        Library obj = new Library(libName, noOfStudent, fees, noOfDesk);
        obj.libraryInfo();
        br.close();

    }
}
