package com.example.zclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.zclone.databinding.ActivityHomePageBinding

class Homepage : AppCompatActivity() {

    private lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Delivery())
        binding.bottomNavigationView.setOnItemSelectedListener{

                when(it.itemId){
                    R.id.delivery -> replaceFragment(Delivery())
                    R.id.dining -> replaceFragment(Dining())
                    R.id.money -> replaceFragment(Money())
                else ->{

                }

                }
              true

        }
    }

       private fun replaceFragment(fragment: Fragment){
           val fragmentManager = supportFragmentManager
           val fragmentTransaction = fragmentManager.beginTransaction()
           fragmentTransaction.replace(R.id.frame_layout,fragment)
           fragmentTransaction.commit()


       }
}