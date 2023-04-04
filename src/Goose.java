public class Goose extends Ability implements IAnimal {
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    public Goose(){
        setFlyingAbility(new IsFlying());
        setWalkingAbility(new IsWalking());
        System.out.println("Goose is Made");
    }
    public IAnimal makeCopy() {
        System.out.println("Goose is Being Made");
        Goose gooseObject = null;
        try {
            // Calls the Animal super classes clone()
            // Then casts the results to Goose
            gooseObject = (Goose) super.clone();
        }
        // If Animal didn't extend Cloneable this error
        // is thrown
        catch (CloneNotSupportedException e) {
            System.out.println("The Goose was Turned to Bat");
            e.printStackTrace();
        }
        return gooseObject;
    }



    public String toString(){
        return "Here comes my Hero, Honk";
    }
}
