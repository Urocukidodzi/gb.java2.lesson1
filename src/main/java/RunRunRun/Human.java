package RunRunRun;

import Interface.InterfaceMove;

class Human implements InterfaceMove {
    final String className = "Human";

    int jumping = 4;
    int runnig = 100;

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
