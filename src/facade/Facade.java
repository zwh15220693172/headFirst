package facade;

public class Facade {
    private SubSystem subSystem = new SubSystem();
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();

    public void function(){
        subSystem.function();
        subSystemA.function();
        subSystemB.function();
    }
}
