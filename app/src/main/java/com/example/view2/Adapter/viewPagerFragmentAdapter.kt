package com.example.view2.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.view2.Fragments.firstFragmnet
import com.example.view2.Fragments.secondFragment
import com.example.view2.Fragments.thirdFragment

class viewPagerFragmentAdapter(activity:FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 3



    override fun createFragment(position: Int): Fragment {
        return when (position){

            0->firstFragmnet()
            1->secondFragment()
            2->thirdFragment()
            else->firstFragmnet()
       }
    }
}