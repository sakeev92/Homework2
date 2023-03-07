package ObjectOrientedProgramming;


public class Hogwarts {
    private String name;
    private String lastName;
    private int witchcraft;
    private int transgressAbility;

    private int sumCharater() {
        return witchcraft + transgressAbility;
    }

    public Hogwarts(String name, String lastName, int witchcraft, int transgressAbility) {
        this.name = name;
        this.lastName = lastName;
        this.witchcraft = witchcraft;
        this.transgressAbility = transgressAbility;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgressAbility() {
        return transgressAbility;
    }

    public String property() {
        return  "\nКолдовство: " + this.witchcraft + "\nУмение трансгрессировать: " + this.transgressAbility + "\n";
    }

    public final void compareStudents(Hogwarts student) {
        if (sumCharater() > student.sumCharater()) {
            System.out.println(this.getName() + this.getLastName()+property()+"\n"+student.name  + student.lastName +
                    student.property() + this.name + " " + this.lastName + " большей мощностью магии, чем " +
                    student.name + " " + student.lastName);
        } else {
            System.out.println(this.getName()  + this.getLastName() +property()+"\n" + student.property() + "\n"+student.name + " " +
                    student.lastName + " большей мощностью магии, чем " +
                    this.name + " " + this.lastName);
        }

    }
}




