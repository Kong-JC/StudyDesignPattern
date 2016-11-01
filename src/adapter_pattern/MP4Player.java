package adapter_pattern;

import adapter_pattern.interface_.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {

	}

	public void playMP4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}

}
