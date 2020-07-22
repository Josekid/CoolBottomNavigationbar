package com.example.smartbottomnavigationbar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.luseen.spacenavigation.SpaceItem
import com.luseen.spacenavigation.SpaceNavigationView
import com.luseen.spacenavigation.SpaceOnClickListener


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var navigationView = findViewById<SpaceNavigationView>(R.id.space)
        navigationView.initWithSaveInstanceState(savedInstanceState)
        navigationView.addSpaceItem(SpaceItem("",R.drawable.ic_baseline_add_24))
        navigationView.addSpaceItem(SpaceItem("",R.drawable.ic_baseline_favorite_24))
        navigationView.addSpaceItem(SpaceItem("",R.drawable.ic_baseline_history_24))
        navigationView.addSpaceItem(SpaceItem("",R.drawable.ic_baseline_settings_24))

        navigationView.setSpaceOnClickListener(object : SpaceOnClickListener
        {
            override fun onCentreButtonClick()
            {
                Toast.makeText(this@MainActivity, "onCentreButtonClick", Toast.LENGTH_SHORT).show()
            }

            override fun onItemClick(itemIndex: Int, itemName: String)
            {
                Toast.makeText(this@MainActivity, "$itemIndex $itemName", Toast.LENGTH_SHORT).show()
            }

            override fun onItemReselected(itemIndex: Int, itemName: String)
            {
                Toast.makeText(this@MainActivity,"$itemIndex $itemName", Toast.LENGTH_SHORT).show()
            }
        }
        )
    }

}