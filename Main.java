// Objectives given here: https://docs.google.com/document/d/1VyqRG5wR3q0exFC8klmNL9SVNYCZzdsOd8hYDabRpMk/edit
public class Main {
    public static void main(String[] args) {
        // Leader: Cole
        // Members: Amanda, Ben, Owen
<<<<<<< HEAD
        //mainMenu();
    	
    	Roster r = new Roster();
    	r.addStudents();
    
        
=======
        mainMenu();
        System.out.println("Cole Pull Request #1.");
        System.out.println("Cole Pull Request #2.");
>>>>>>> 66e1695b48d671066556147a5d76f970fd12e087
    }

    private static void mainMenu() {
        // NOTE: Most methods should be able to be coded into the Roster class.
        // with that said, please don't code into the Main class. thx!
        addOrDeleteStudent();
        changeGradeOrSchedule();
        sortStudents();
    }

    private static void addOrDeleteStudent() {
        // addStudent();
        // removeStudent();
    }

    private static void changeGradeOrSchedule() {
        // changeGrade();
        // changeSchedule();
    }

    private static void sortStudents() {
        // sortLastName();
        // sortGPA();
        // sortPeriod();
    }
}