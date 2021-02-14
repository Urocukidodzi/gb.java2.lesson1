package RunRunRun;

import Interface.Obstruction;

class Wall implements Obstruction {
    private int height;

    protected Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        System.out.println("wall height is " + height);
        return height;
    }
}
