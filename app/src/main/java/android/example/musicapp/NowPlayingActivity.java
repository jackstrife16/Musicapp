package android.example.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class NowPlayingActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            int currentPlaying = extras.getInt(MainActivity.Playing);
            SongArrayList nowPlayingSong = MainActivity.SongInfo.get(currentPlaying);

            TextView textView = findViewById(R.id.now_playing_song_name);
            textView.setText(nowPlayingSong.getSongName());

            ImageView imageView = findViewById(R.id.now_playing_song_image);
            imageView.setImageResource(nowPlayingSong.getImageId());

            TextView textView2 = findViewById(R.id.now_playing_song_artist);
            textView2.setText(nowPlayingSong.getArtistName());

            TextView textView1 = findViewById(R.id.now_playing_song_album);
            textView1.setText(nowPlayingSong.getAlbumName());
        }
    }
}
