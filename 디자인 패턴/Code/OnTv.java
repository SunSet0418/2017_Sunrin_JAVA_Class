package JavaPackage;

public class OnTv implements Command {
    private Television televisionn;

    OnTv(Television television){
        televisionn = television;
    }
    public void execute(){
        televisionn.on();
    }
}
