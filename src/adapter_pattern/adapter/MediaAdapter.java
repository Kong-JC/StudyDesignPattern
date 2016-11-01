package adapter_pattern.adapter;

import adapter_pattern.MP4Player;
import adapter_pattern.VlcPlayer;
import adapter_pattern.interface_.AdvancedMediaPlayer;
import adapter_pattern.interface_.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
		}else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new MP4Player();
		}
	}

	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(fileName);
		}else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMP4(fileName);
		}
	}

}
