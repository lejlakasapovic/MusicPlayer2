package com.example.student.musicplayer;


import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainSong extends AppCompatActivity {


    private MediaPlayer song1;


    private Button pauseButton;
    private Button playButton;
    private Button stopButton;
    private Button rewindButton;
    private Button forwardButton;


    private TextView currentTimeView;
    private TextView totalTimeView;
    private TextView title;
    private TextView author;


    private double currentTimeMS;
    private double totalTimeMS;


    private Handler time = new Handler();


    private SeekBar seek;
    //private int seekTime = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_song);


        //Title + Author Config
        title = (TextView) findViewById(R.id.title);
        author = (TextView) findViewById(R.id.author);


        //Song Config
        song1 = MediaPlayer.create(getApplicationContext(), R.raw.arduous_task);


        //Seek Bar Config
        seek = (SeekBar) findViewById(R.id.seeker);
        seek.setMax((int) totalTimeMS);


        //Total time related items
        totalTimeMS = song1.getDuration();}}