package at.ran.patterns.factory;

public class ActorFactory {
    public static Actor getActorRandomActor(){
        int random = (int) (Math.random() * 100);
        if(random < 50){
            return new Leaf("Leaf");
        }
        else if(random < 75){
            return new Tree("Tree");
        }
        else{
            return new Car();
        }
       
    }
}
