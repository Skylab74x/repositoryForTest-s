package pack;

public abstract class Character {

    abstract void combo();
    abstract void followUp();

    public void youLose() {
        System.out.println("YOU LOSE");
    }
}
