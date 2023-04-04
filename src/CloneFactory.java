import java.util.HashMap;
import java.util.Map;

public class CloneFactory {
    static Map<String, IAnimal> animals = new HashMap<>();
    enum  AnimalsEnum{
        WHITEGOOSE{
            @Override
            public IAnimal getInstance() {
                IAnimal wg = (IAnimal) (new Goose());
                wg.setName("Swift");
                return wg;
            }
        },
        CYBERMOUSE{
            @Override
            public IAnimal getInstance() {
                IAnimal cm = (IAnimal) (new Mouse());
                cm.setName("Mauser"); // Imagine this was more setup
                return cm;
            }
        },
        MOUSE{
            public IAnimal getInstance(){
                return (IAnimal)(new Mouse());
            }
        },
        SHEEP{
            public IAnimal getInstance(){
                return (IAnimal)(new Sheep());
            }
        };
        public abstract IAnimal getInstance();

    }
        // Receives any IAnimal, or IAnimal subclass and
        // makes a copy of it and stores it in its own
        // location in memory
        // CloneFactory has no idea what these objects are
        // except that they are subclasses of Animal
        public IAnimal getClone(AnimalsEnum whichAnimal) {
            IAnimal prototype = animals.get(whichAnimal.toString());
            if(prototype == null){
                prototype = whichAnimal.getInstance();
            }
            return prototype.makeCopy();
        }
}

