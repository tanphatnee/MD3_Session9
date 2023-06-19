package bt2;

public class VideoPlayer implements IPlayable{
    @Override
    public void play(String str) {
        System.out.println("Play Video: "+str);
    }

}
