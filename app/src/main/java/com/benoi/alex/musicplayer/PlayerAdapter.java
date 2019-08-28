package com.benoi.alex.musicplayer;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.MyViewHolder> {

    private List<Music> playList;

    PlayerAdapter(List<Music> playList) {
        this.playList = playList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.player_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Music music = playList.get(position);
        holder.music.setText(music.getMusic_name());
        holder.artist.setText(music.getArtist_name());
        holder.album.setText(music.getAlbum_name());
    }

    @Override
    public int getItemCount() {
        return playList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView music, artist, album;

        MyViewHolder(View view) {
            super(view);
            music = view.findViewById(R.id.song_name);
            artist = view.findViewById(R.id.artist_name);
            album = view.findViewById(R.id.album_name);
        }
    }


}
