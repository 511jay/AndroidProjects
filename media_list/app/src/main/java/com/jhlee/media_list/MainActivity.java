package com.jhlee.media_list;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URL;


public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoV);
        Uri vUrl = Uri.parse("https://vod-progressive.akamaized.net/exp=1617175441~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F152%2F20%2F500762371%2F2280354878.mp4~hmac=6b9fde638a64ca413767528cceb69b8c4ca316f8546f8ec80bc0adf6bc210eb5/vimeo-prod-skyfire-std-us/01/152/20/500762371/2280354878.mp4?download=1&filename=Mountains+-+61818.mp4");
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(vUrl);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(videoView!=null&&videoView.isPlaying()){
            videoView.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(videoView!=null){
            videoView.stopPlayback();
        }
    }
}