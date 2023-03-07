package ObjectOrientedProgramming;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;
    private int sumCharacter() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;

    }
    public Slytherin(String name, String lastName, int witchcraft, int transgressAbility, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, lastName, witchcraft, transgressAbility);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public String toString() {
        String info = "";
        info += "\n" +this.getName() + " "+this.getLastName();
        info += "\nХитрость: " + this.cunning;
        info += "\nРешительность: " + this.determination;
        info += "\nАмбициозность: " + this.ambition;
        info += "\nНаходчивость: " + this.resourcefulness;
        info += "\nЖажда власти: " + this.thirstForPower;
        return info;

    }

    public void compareStudentsInFaculty(Slytherin student) {
        if (sumCharacter() > student.sumCharacter() ) {
            System.out.println(toString()+"\n" + student.toString() + " "+"\n"+this.getName() + " " + this.getLastName() + " лучший Слизеринец, чем " +
                    student.getName() + " " + student.getLastName());
        } else {
            System.out.println(toString()+"\n" + student.toString() + " "+"\n"+student.getName() + " " + student.getLastName() + " лучший Слизеринец, чем " +
                    this.getName() + " " + this.getLastName());
        }
    }
}
