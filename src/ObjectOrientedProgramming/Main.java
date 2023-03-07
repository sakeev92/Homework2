package ObjectOrientedProgramming;

public class Main {
    public static void main(String[] args) {

        Gryffindor potter = new Gryffindor("Harry", "Potter", 10, 10, 10, 10, 10);
        Gryffindor granger = new Gryffindor("Hermione", "Granger", 2, 2, 2, 3, 2);
        Gryffindor weasley = new Gryffindor("Ron", "Weasley", 60, 75, 76, 50, 40);

        Hufflepuff smith = new Hufflepuff("Zachariah", "Smith", 60, 53, 23, 40, 20);
        Hufflepuff diggory = new Hufflepuff("Cedric", "Diggory", 80, 75, 90, 70, 12);
        Hufflepuff finchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", 40, 60, 70, 4, 56);

        Ravenclaw chang = new Ravenclaw("Zhou", "Chang", 50, 80, 56, 20, 50, 86);
        Ravenclaw patil = new Ravenclaw("Padma", "Patil", 59, 20, 10, 26, 60, 2);
        Ravenclaw belby = new Ravenclaw("Marcus", "Belby", 40, 10, 12, 2, 4, 21);


        Slytherin malfoy = new Slytherin("Draco", "Malfoy", 5, 10, 2, 4, 6, 4, 40);
        Slytherin montague = new Slytherin("Graham", "Montague", 10, 20, 30, 40, 50, 9, 60);
        Slytherin goyle = new Slytherin("Gregory", "Goyle", 5, 6, 7, 8, 9, 80, 70);


        granger.compareStudentsInFaculty(potter);
        System.out.println("_______________________");
        smith.compareStudentsInFaculty(finchFletchley);
        System.out.println("_______________________");
        chang.compareStudentsInFaculty(belby);
        System.out.println("_______________________");
        malfoy.compareStudentsInFaculty(goyle);
        System.out.println("_______________________");
        potter.compareStudents(malfoy);
    }
}

