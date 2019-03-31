package android.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String Playing = "now play";
    public static ArrayList<SongArrayList> SongInfo;
    private ListView listView;
    private SongAdapter sAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.song_list);

        SongInfo = new ArrayList<>();
        SongInfo.add(new SongArrayList(R.drawable.killshot, getString(R.string.artist_eminem), getString(R.string.album_killshot), getString(R.string.song_killshot)));
        SongInfo.add(new SongArrayList(R.drawable.culture, getString(R.string.artist_migos), getString(R.string.album_culture_ii), getString(R.string.song_walk_it_talk_it)));
        SongInfo.add(new SongArrayList(R.drawable.jcole_kod, getString(R.string.artist_jcole), getString(R.string.album_kod), getString(R.string.song_1985)));
        SongInfo.add(new SongArrayList(R.drawable.logic_ysiv, getString(R.string.album_ysiv), getString(R.string.song_iconic), getString(R.string.artist_logic)));

        sAdapter = new SongAdapter(this, SongInfo);
        listView.setAdapter(sAdapter);

        TextView songName = (TextView) findViewById(R.id.song_name);
        songName.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
                setContentView(R.layout.activity_now_playing);

            }
        });
    }


}


