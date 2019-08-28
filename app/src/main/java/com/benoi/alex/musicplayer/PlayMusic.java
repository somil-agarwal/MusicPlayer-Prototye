package com.benoi.alex.musicplayer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PlayMusic extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_screen);

        Intent in = getIntent();

        TextView music_name = findViewById(R.id.music_name);
        TextView artist_name = findViewById(R.id.artist_name);
        TextView album_name = findViewById(R.id.album_name);
        music_name.setText(in.getStringExtra("MUSIC_NAME"));
        artist_name.setText(in.getStringExtra("ARTIST_NAME"));
        album_name.setText(in.getStringExtra("ALBUM_NAME"));

    }

    public void Rewind(View view) {

        Toast.makeText(this, "Rewind the music by 10 seconds", Toast.LENGTH_SHORT).show();
    }

    public void Forward(View view) {

        Toast.makeText(this, "Forward the song by 10sec", Toast.LENGTH_SHORT).show();
    }

    public void Play(View view) {

        Toast.makeText(this, "Play the music", Toast.LENGTH_SHORT).show();
    }

    public void Pause(View view) {

        Toast.makeText(this, "Pause the music", Toast.LENGTH_SHORT).show();
    }

    public void Stop(View view) {

        Toast.makeText(this, "Stop the music", Toast.LENGTH_SHORT).show();
    }
}
