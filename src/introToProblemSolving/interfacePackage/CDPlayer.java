package introToProblemSolving.interfacePackage;

public class CDPlayer implements MediaPlayer{
    @Override
    public void mediaStart() {
        System.out.println("music starts");
    }

    @Override
    public void mediaStop() {
        System.out.println("music stops");
    }
}
