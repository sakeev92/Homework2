package ObjectOrientedProgramming;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;
    private int sumCharacter() {
        return mind + wisdom + wit + creativity ;}

    public Ravenclaw(String name, String lastName, int witchcraft, int transgressAbility, int mind, int wisdom, int wit, int creativity) {
        super(name, lastName, witchcraft, transgressAbility);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public String toString() {
        String info = "";
        info += "\n" + this.getName() + " "+this.getLastName();
        info += "\nУм: " + this.mind;
        info += "\nМудрость: " + this.wisdom;
        info += "\nОстроумие: " + this.wit;
        info += "\nТворчество: " + this.creativity;
        return info;
    }

    public void compareStudentsInFaculty(Ravenclaw student) {
        if (sumCharacter() > student.sumCharacter()) {
            System.out.println(toString()+"\n" + student.toString() + " "+"\n"+this.getName() + " " + this.getLastName() + " лучший Когтевранец, чем " +
                    student.getName() + " " + student.getLastName());
        } else {
            System.out.println(toString()+"\n" + student.toString() + " "+"\n"+student.getName() + " " + student.getLastName() + " лучший Когтевранец, чем " +
                    this.getName() + " " + this.getLastName());
        }
    }}