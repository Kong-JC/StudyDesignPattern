package adapter_pattern;

import adapter_pattern.interface_.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	public void playMP4(String fileName) {

	}

}
