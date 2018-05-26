package com.github.simonpham.hasbrain.ea

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_explorer -> {
                message.setText(R.string.title_explore)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_saved -> {
                message.setText(R.string.title_saved)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_me -> {
                message.setText(R.string.title_me)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_quest -> {
                message.setText(R.string.title_quest)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_inbox -> {
                message.setText(R.string.title_inbox)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
