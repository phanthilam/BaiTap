package O_Person;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList personList = new PersonList();

        while (true) {
            System.out.println("0. Exit program "
                    + "\n1. Add a new student"
                    + "\n2. Add a new teacher"
                    + "\n3. Update person by id"
                    + "\n4. Delete person by id"
                    + "\n5. Find person by id"
                    + "\n6. Display all person"
                    + "\n7. The highest teacher salary");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exit program!");
                    sc.close();
                    return;
                case 1:
                    Student student = new Student();
                    personList.addPerson(student);
                    break;

                case 2:
                    Teacher teacher = new Teacher();
                    personList.addPerson(teacher);
                    break;
                case 3:
                    System.out.print("Enter person id to update: ");
                    String updated = sc.nextLine();
                    personList.updatePersonById(updated);
                    break;
                case 4:
                    System.out.print("Enter person id to delete: ");
                    String deleted = sc.nextLine();
                    personList.deletePersonById(deleted);
                    break;
                case 5:
                    System.out.println("Enter person id to find: ");
                    String findID = sc.nextLine();
                    Person founded = personList.findPersonById(findID);
                    if (founded != null) {
                        founded.displayDetails();
                    }
                    break;
                case 6:
                    personList.displayAllPersons();
                    break;
                case 7:
                    personList.highTeacherSalary();
                    break;
            }
        }
    }
}
