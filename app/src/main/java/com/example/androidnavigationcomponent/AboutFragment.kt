package com.example.androidnavigationcomponent

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_about.*

class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_about,container,false)
    }


    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // *** in this method we want to fetch data that passed from shopfragment
        // when we set aboutFragment as a fragment that getArguments in nag_graph , a AboutFragmentArgs automatically generated
        // this symbol means ?. if the arguments is not null
        arguments?.let {
            val safeArgs : AboutFragmentArgs = AboutFragmentArgs.fromBundle(it)
            tv_product_count.text = "Total Products Available: ${safeArgs.productCount}"
        }
    }


}