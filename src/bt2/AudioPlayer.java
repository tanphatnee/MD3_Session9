package bt2;

public class AudioPlayer implements IPlayable{
    @Override
    public void play(String str) {
        System.out.println("Play Audio: "+str);
    }

}
