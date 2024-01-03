package com.example.videodemo

import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import java.net.URI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)  //gives access to media buttons like play,pause,fast forward,rewind
        mediaController.setAnchorView(videoView)  //Set the view that acts as the anchor for the control view.

        val uri : Uri = parse("android.resource://"+packageName+"/"+R.raw.uigoku_vs_jiren)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}