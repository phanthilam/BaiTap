package O_Person;

import java.util.ArrayList;

public class PersonList {

    ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        person.addPerson();
        personList.add(person);
        System.out.println("Added!");
        return;
    }

    public void updatePersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equalsIgnoreCase(id)) {
                person.updatePerson();
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public void deletePersonById(String id) {
        boolean remove = personList.removeIf(person -> person.getId().equals(id));
        if (remove) {
            System.out.println("Delete person by ID: " + id);
        } else {
            System.out.println("Not found person by ID: " + id);
        }
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equalsIgnoreCase(id)) {
                return person;
            }
        }
        System.out.println("Not found person ID: " + id);
        return null;
    }

    public void displayAllPersons() {
        if (personList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Person person : personList) {
                person.displayDetails();
            }
        }
    }

    public void highTeacherSalary() {
        double maxSalary = 0;
        Teacher bestTeacher = null;

        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;

                if (teacher.getBaseSalary() > maxSalary) {
                    maxSalary = teacher.getBaseSalary();
                    bestTeacher = teacher;
                }
            }
        }
        if (bestTeacher != null) {
            System.out.println("The teacher have a high salary: ");
            bestTeacher.displayDetails();
        } else {
            System.out.println("Not found the teacher have a high salary ");
        }
    }
}
