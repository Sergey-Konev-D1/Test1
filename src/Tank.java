public class Tank {

    static final String MODEL="T-34";
    static int nTanks=0;

    private int x=0;
    private int y=0;
    private int direction=0;
    private int fuel;
    private int n=0;
    private int c=0;// проверка GIT

    public Tank() {
        this(0,0,100);
    }

    public Tank(int x, int y) {
        this (x,y,100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n=++nTanks;
    }

    public void goForward(int a) {
        if (a < 0 && -a > -fuel)
            a = -fuel;
        else if (a > fuel) // расстояние,которое нужно проехать,не может быть больше количества топлива в баке
            a = fuel;

        if (direction==0) x=x+a;
        else if (direction==1) y=y+a;
        else if (direction==2) x= x-a;
        else y=y-a;
        fuel=fuel-Math.abs(a);// количество топлива минус расстояние пройденное, взято по модулю значение


    }

    public void printPosition () {
        System.out.println("The Tank " + MODEL + "-" + n +" is at " + x + "," + y + " now");
    }

    public void turnRight(){
        direction = direction+1;
        if (direction==4) direction=0;
    }

    public void turnLeft(){
        direction=direction-1;
        if (direction==-1) direction=3;
        }


    public void goBackward(int a) {
        goForward(-a);
    }





}
