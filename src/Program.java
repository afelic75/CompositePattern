
public class Program {
	public static void main(String args[]) {
		
		// Make new empty "Study" playlist 
		Playlist studyPlaylist = new Playlist("Study");		

		// Make "Synth Pop" playlist and add 2 songs to it.
		Playlist synthPopPlaylist = new Playlist("Beatles");
		Song synthPopSong1 = new Song("I Made It", "Stand By Me" );
		Song synthPopSong2 = new Song("Outside", "TOPS");
		synthPopPlaylist.add(synthPopSong1);
		synthPopPlaylist.add(synthPopSong2);

		// Make "Experimental" playlist and add 3 songs to it, 
		// then set playback speed of the playlist to 0.5x
		Playlist experimentalPlaylist = new Playlist("Some Song");		
		Song experimentalSong1 = new Song("Music", "Other Songs");
		Song experimentalSong2 = new Song("Motivation", "Rock");	
		Song experimentalSong3 = new Song("Rap", "Classical");
		experimentalPlaylist.add(experimentalSong1);
		experimentalPlaylist.add(experimentalSong2);
		experimentalPlaylist.add(experimentalSong3);
		float slowSpeed = 0.5f;
		experimentalPlaylist.setPlaybackSpeed(slowSpeed);
		
		
		experimentalPlaylist.add(synthPopPlaylist);

		
		studyPlaylist.add(experimentalPlaylist);

		
		Song glitchSong = new Song("Blues", "Jazz");
		float fasterSpeed = 1.25f;
		glitchSong.setPlaybackSpeed(fasterSpeed);
		glitchSong.play(); 
		String name = glitchSong.getName(); 
		String artist = glitchSong.getArtist(); 
		System.out.println ("The song name is " + name );
		System.out.println ("The song artist is " + artist );

		
		studyPlaylist.add(glitchSong);

		
		studyPlaylist.play(); 

		
		System.out.println ("The Playlist's name is " + studyPlaylist.getName() );
		}

}
