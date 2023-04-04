public class Ability {
    private IFly  flyingAbility;
    private IWalk walkingAbility;

    public String fly(){
        return flyingAbility.fly();
    }
    public  String walk(){
        return walkingAbility.walk();
    }
    public void setFlyingAbility(IFly flyingAbility) {
        this.flyingAbility = flyingAbility;
    }

    public void setWalkingAbility(IWalk walkingAbility) {
        this.walkingAbility = walkingAbility;
    }
}
