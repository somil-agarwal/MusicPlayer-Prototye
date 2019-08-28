package com.benoi.alex.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Music> playList = new ArrayList<>();
    PlayerAdapter mAdapter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.songs_list_view);
        mAdapter = new PlayerAdapter(playList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));


        recyclerView.addOnItemTouchListener(new BackToPlaylist(getApplicationContext(), recyclerView, new BackToPlaylist.ClickListener() {

            @Override
            public void onClick(View view, int position) {

                Music music = playList.get(position);
                Intent intent = new Intent(getApplicationContext(), PlayMusic.class);

                intent.putExtra("MUSIC_NAME", music.getMusic_name());
                intent.putExtra("ALBUM_NAME", music.getAlbum_name());
                intent.putExtra("ARTIST_NAME", music.getArtist_name());
                startActivity(intent);
            }


            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        recyclerView.setAdapter(mAdapter);
        prepareMusicsData();
    }

    private void prepareMusicsData() {
        playList.add(new Music("Malare", "Vijay Yesudas", "Premam - "));
        playList.add(new Music("Ente Kannil Ninakkai", "Nazriya Nazim", "Bangalore Days - "));
        playList.add(new Music("Nenjodu Cherthu", "Aalaap Raju", "Yuvvh - "));
        playList.add(new Music("Rockaankuthu", "Anirudh Ravichander", "Premam - "));
        playList.add(new Music("Akale", "Malgudi Subha", "Charlie - "));
        playList.add(new Music("Kaalam Kettu Poyi", "Shabareesh Verma", "Premam - "));
        playList.add(new Music("Ee Shishirakaalam", "Kavya Ajit", "Jacobinte Swargarajyam - "));
        playList.add(new Music("O Rabba Bhayangariya", "Ziya Ul-Haq", "Godha - "));
        playList.add(new Music("Enne Thallendammaava", "Vineeth Sreenivasa", "Oru Vadakkan Selfie - "));
        playList.add(new Music("Kannanjunnoru Naadu", "Shaan Rahmaan", "Godha - "));
        playList.add(new Music("Aaro Nenji", "Gowry Lekshmi", "Godha - "));
        playList.add(new Music("Raave", "Anil Ram, Neha Nair", "Iyobinte Pusthakam - "));
        playList.add(new Music("Namma Ooru Bengaluru", "Gopi Sunder", "Banglore Days - "));
        playList.add(new Music("Earan Kaatin Eenam Pole ", "Shreya Ghoshal", "Salaha Mobiles - "));
        playList.add(new Music("Nokki Nokki", "Abhay Jodhpurkar", "Jomonte Suviseshangal - "));
        mAdapter.notifyDataSetChanged();
    }
}

