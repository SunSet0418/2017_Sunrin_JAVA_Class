package JavaPackage;


public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Television television = new Television();
        OnTv TvOn = new OnTv(television);
        remote.setCommand(TvOn);
        remote.onClick();
    }
}
