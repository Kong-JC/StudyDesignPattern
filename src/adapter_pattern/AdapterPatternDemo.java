package adapter_pattern;

/**
 * 适配器模式
 */
public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("vlc", "asd.vlc");
		audioPlayer.play("MP3", "asd.mp3");
		audioPlayer.play("mp4", "asd.mp4");
		audioPlayer.play("wmv", "asd.wmv");
		
	}

}
