public class Main {
    public static void main(String[] args){

        // Handles routing makeCopy method calls to the
        // right subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

//        Decorating animals with abilities
        Sheep sally = (Sheep) animalMaker.getClone(CloneFactory.AnimalsEnum.SHEEP);
        System.out.println(sally.walk());
        System.out.println(sally);
        System.out.println("----------------------------------------------------------------");

        Mouse stinky = (Mouse) animalMaker.getClone(CloneFactory.AnimalsEnum.MOUSE);
        System.out.println(sally.walk());
        System.out.println(stinky);
        System.out.println("----------------------------------------------------------------");


        Mouse mause = (Mouse) animalMaker.getClone(CloneFactory.AnimalsEnum.CYBERMOUSE);
        System.out.println(sally.walk());
        System.out.println("----------------------------------------------------------------");

        Goose swine = (Goose) animalMaker.getClone(CloneFactory.AnimalsEnum.WHITEGOOSE);
        System.out.println(swine.walk());
        System.out.println(swine.fly());
        System.out.println(swine);
        System.out.println("----------------------------------------------------------------");


        sally.setName("Sally");
        stinky.setName("Jones");

        System.out.println(sally.getName() + stinky.getName() + mause.getName() + swine.getName());
    }



}