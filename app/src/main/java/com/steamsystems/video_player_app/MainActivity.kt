package com.steamsystems.video_player_app

import android.R
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import android.net.Uri.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.steamsystems.video_player_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoView = findViewById<VideoView>(binding.testView.id)

        //creating media controller
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        //specifying the location of media file
        val uri:Uri = parse("android.resource://" + packageName + "/raw/test")

        //setting MediaController & URI, then starting the videoView
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
        }
    }
