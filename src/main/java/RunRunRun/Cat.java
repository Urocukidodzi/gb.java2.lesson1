package RunRunRun;

import Interface.InterfaceMove;

class Cat implements InterfaceMove {

    final String className = "Cat";

    int jumping = 2;
    int runnig = 30;

    public String getName (){
        return className;
    }

    @Override
    public int run() {
        System.out.print("Running. ");
        return runnig;
    }

    @Override
    public int jump() {
        System.out.print("Jumping. ");
        return jumping;
    }
}
