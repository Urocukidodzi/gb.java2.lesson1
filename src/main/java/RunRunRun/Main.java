package RunRunRun;

import Interface.InterfaceMove;
import Interface.Obstruction;


public class Main {


    public static void main(String[] args) {

        InterfaceMove[] users = createUsers();
        Obstruction[] obstructions = createObstruction();

        start(users, obstructions);

    }

    private static void start(InterfaceMove[] users, Obstruction[] obstructions) {

        boolean isFinished = true;

        for (InterfaceMove user:users) {

            isFinished = true;

            System.out.println("\n" + getName(user) + " start");
            for (Obstruction obstruction:obstructions) {
                if(!tryingFinish(user, obstruction)){
                    System.out.println(getName(user) + " is lost");
                    isFinished = false;
                    break;
                }
                System.out.println(getName(user) + " finished!");
            }
            if (isFinished){
                System.out.println(getName(user)+ " is WIN!!!");
            }
        }

    }

    private static String getName(InterfaceMove user) {
        if (user instanceof Cat){
            return ((Cat) user).className;
        } else if (user instanceof Robot){
            return ((Robot) user).className;
        } else if (user instanceof Human){
            return ((Human) user).className;
        } else {
            return  "unknown class";
        }
    }

    private static boolean tryingFinish(InterfaceMove user, Obstruction obstruction){
                if (obstruction instanceof Wall){
                    if(user.jump()>=((Wall) obstruction).getHeight()){
                        return true;
                    }
                    return false;
                } else if (obstruction instanceof RunTrace){
                    if(user.run()>=((RunTrace) obstruction).getLength()){
                        return true;
                    }
                    return false;
                }
                return false;
    }

    private static Obstruction[] createObstruction() {

        Obstruction[] result = new Obstruction[4];

        for (int i = 1; i < result.length+1; i++) {
            if(i%2==0){
                result[i-1] = new Wall(i);
            } else {
                result[i-1] = new RunTrace(i*10);
            }
        }


        return  result;
    }

    private static InterfaceMove[] createUsers() {

        InterfaceMove[] result = new InterfaceMove[3];

                result[0]= new Cat();
                result[1]= new Human();
                result[2]= new Robot();

        return result;
    }

}
