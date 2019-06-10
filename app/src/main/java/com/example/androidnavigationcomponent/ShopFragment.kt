package com.example.androidnavigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_shop.*
import java.util.*

class ShopFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_about.setOnClickListener {
            // navigate to a fragment with id of that fragment layout
//            Navigation.findNavController(it).navigate(R.id.about_destination)

            // *** Pass value from shopFragment to AboutFragment with safeArgs
            val nextAction : ShopFragmentDirections.NextAction = ShopFragmentDirections.nextAction()
            nextAction.productCount = Random().nextInt(200)
            Navigation.findNavController(it).navigate(nextAction)

            /**
             * we can navigate to a fragment with action like below , just before this we should set a connection in nav_graph file
             * next_action is the id of action that connected shop to about in nav_graph file
             */
//            Navigation.findNavController(it).navigate(R.id.next_action)
        }
    }
}