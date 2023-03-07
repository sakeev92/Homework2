package ObjectOrientedProgramming;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int sumCharacter() {
        return nobility + honor + bravery;
    }

    public Gryffindor(String name, String lastName, int witchcraft, int transgressAbility, int nobility, int honor, int bravery) {
        super(name, lastName, witchcraft, transgressAbility);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public void compareStudentsInFaculty(Gryffindor student) {
        if (sumCharacter() > student.sumCharacter()) {
            System.out.println(toString()+"\n" + student.toString() + " "+"\n"+this.getName() + " " + this.getLastName() + " лучший Гриффиндорец, чем " +
                    student.getName() + " " + student.getLastName());
        } else {
            System.out.println(toString()+"\n" + student.toString() + " "+"\n"+student.getName() + " " + student.getLastName() + " лучший Гриффиндорец, чем " +
                    this.getName() + " " + this.getLastName());
        }

    }


    @Override
    public String toString() {
        return this.getName() + " " + this.getLastName() + "\nБлагородство: " + this.nobility +
                "\nЧесть: " + this.honor + "\nХрабрость: " + this.bravery +"\n";
    }

}






