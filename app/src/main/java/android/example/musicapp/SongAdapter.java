package android.example.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class SongAdapter extends ArrayAdapter<SongArrayList> {
    private Context mContext;
    private List<SongArrayList> SongList;

    public SongAdapter(@NonNull Context context, ArrayList<SongArrayList> List) {
        super(context, 0, List);
        mContext = context;
        SongList = List;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.activity_list, parent, false);

        SongArrayList currentSong = SongList.get(position);

        ImageView image = (ImageView) listItem.findViewById(R.id.album_art);
        image.setImageResource(currentSong.getImageId());

        TextView name = (TextView) listItem.findViewById(R.id.song_name);
        name.setText(currentSong.getSongName());

        TextView release = (TextView) listItem.findViewById(R.id.song_artist);
        release.setText(currentSong.getArtistName());


        return listItem;
    }


}