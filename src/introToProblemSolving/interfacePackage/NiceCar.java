package introToProblemSolving.interfacePackage;

public class NiceCar extends Car{

        private Engine engine;
        private MediaPlayer media = new CDPlayer();

        public NiceCar(){
            engine = new PowerEngine();
        }
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void musicStart(){
            media.mediaStart();
    }

    public void musicStop(){
            media.mediaStop();
    }

    public void startEngine(){
            engine.start();
    }

    public void stopEngine(){
            engine.stop();
    }
}
