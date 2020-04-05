import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgramTest {

	@Test
	public void test() {
		// Make new empty "Study" playlist 
		Playlist studyPlaylist = new Playlist("Study");		

		// Make "Synth Pop" playlist and add 2 songs to it.
		Playlist synthPopPlaylist = new Playlist("Synth Pop");
		Song synthPopSong1 = new Song("Girl Like You", "Toro Y Moi" );
		Song synthPopSong2 = new Song("Outside", "TOPS");
		synthPopPlaylist.add(synthPopSong1);
		synthPopPlaylist.add(synthPopSong2);

		// Make "Experimental" playlist and add 3 songs to it, 
		// then set playback speed of the playlist to 0.5x
		Playlist experimentalPlaylist = new Playlist("Experimental");		
		Song experimentalSong1 = new Song("About you", "XXYYXX");
		Song experimentalSong2 = new Song("Motivation", "Clams Casino");	
		Song experimentalSong3 = new Song("Computer Vision", "Oneohtrix Point Never");
		experimentalPlaylist.add(experimentalSong1);
		experimentalPlaylist.add(experimentalSong2);
		experimentalPlaylist.add(experimentalSong3);
		float slowSpeed = 0.5f;
		experimentalPlaylist.setPlaybackSpeed(slowSpeed);
		
		// Add the "Synth Pop" playlist to the "Experimental" playlist
		experimentalPlaylist.add(synthPopPlaylist);

		// Add the "Experimental" playlist to the "Study" playlist
		studyPlaylist.add(experimentalPlaylist);
		
		
		
		
		Song glitchSong = new Song("Textuell", "Oval");
		float fasterSpeed = 1.25f;
		glitchSong.setPlaybackSpeed(fasterSpeed);
		glitchSong.play(); 
		String name = glitchSong.getName(); 
		assertEquals(name, "Textuell");
		
		String artist = glitchSong.getArtist();
		assertEquals(artist, "Oval");

		studyPlaylist.add(glitchSong);

		studyPlaylist.play(); 
		System.out.println ("The Playlist's name is " + studyPlaylist.getName() );
		assertEquals(studyPlaylist.getName(), "Study");
	}

}
