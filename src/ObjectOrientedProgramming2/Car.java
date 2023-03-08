package ObjectOrientedProgramming2;

import javax.tools.Diagnostic;

public class Car extends Transport implements Diagnosed{

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
