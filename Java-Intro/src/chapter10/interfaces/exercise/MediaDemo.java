package chapter10.interfaces.exercise;

public class MediaDemo {

	public static void main(String[] args) {

		Media video = new Video();
		Media audio = new Audio();
		
		video.play();
		audio.play();
	}

}
