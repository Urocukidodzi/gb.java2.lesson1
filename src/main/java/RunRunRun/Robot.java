package RunRunRun;

import Interface.InterfaceMove;

class Robot implements InterfaceMove {
    final String className = "Robot";

    int jumping = 1;
    int runnig = 1000;

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
