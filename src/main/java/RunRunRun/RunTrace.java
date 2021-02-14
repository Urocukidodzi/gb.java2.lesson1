package RunRunRun;

import Interface.Obstruction;

class RunTrace implements Obstruction {
    private int length;

    protected RunTrace(int length) {
        this.length = length;
    }

    public int getLength() {
        System.out.println("trace length is " + length);
        return length;
    }
}
