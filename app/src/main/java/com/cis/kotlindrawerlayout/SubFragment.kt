package com.cis.kotlindrawerlayout


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_sub.view.*

/**
 * A simple [Fragment] subclass.
 */
class SubFragment : Fragment() {
//    val str1: String? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_sub, container, false)
//        v.subTv.text = str1

        return v
    }


}
