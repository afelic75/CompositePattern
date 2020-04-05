import java.util.ArrayList;

public class Playlist implements IComponent{
	public String playlistName;
	public ArrayList<IComponent> playList = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	public void play() {
		for(IComponent song : this.playList){
			song.play();
		}
	}

	public void setPlaybackSpeed(float speed) {
		for(IComponent song : this.playList){
			song.setPlaybackSpeed(speed);
		}
	}
	
	public String getName() { return this.playlistName; }
	public void add(IComponent c) { this.playList.add(c); }
	public void remove(IComponent c) { this.playList.remove(c); }
	
}