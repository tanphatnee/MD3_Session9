package bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        System.out.println("Audio's name: ");
        String audioName = new Scanner(System.in).nextLine();
        System.out.println("Video's name: ");
        String videoName = new Scanner(System.in).nextLine();
        audioPlayer.play(audioName);
        videoPlayer.play(videoName);
    }
}
