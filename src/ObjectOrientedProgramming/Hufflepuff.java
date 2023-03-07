package ObjectOrientedProgramming;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    private  int sumCharater(){
        return hardworking+loyal+honest;
    }

    public Hufflepuff(String name, String lastName, int witchcraft, int transgressAbility, int hardworking, int loyal, int honest) {
        super(name, lastName, witchcraft, transgressAbility);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public String toString() {
        String info = "";
        info += "\n" + this.getName() + " "+this.getLastName();
        info += "\nТрудолюбивы: " + this.hardworking;
        info += "\nВерны: " + this.loyal;
        info += "\nЧестны: " + this.honest;
        return info;

    }
    public void compareStudentsInFaculty(Hufflepuff student) {
        if (sumCharater() > student.sumCharater()) {
            System.out.println(toString()+"\n" + student.toString() + " "+"\n"+this.getName() + " " + this.getLastName() + " лучший Пуффендуец, чем " +
                    student.getName() + " " + student.getLastName());
        } else {
            System.out.println(toString()+"\n" + student.toString() + " "+"\n"+student.getName() + " " + student.getLastName() + " лучший Пуффендуец, чем " +
                    this.getName() + " " + this.getLastName());
        }
    }}