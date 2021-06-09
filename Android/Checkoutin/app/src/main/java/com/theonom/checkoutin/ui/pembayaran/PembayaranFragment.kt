package com.theonom.checkoutin.ui.pembayaran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.theonom.checkoutin.R

class PembayaranFragment : Fragment() {

    private lateinit var pembayaranViewModel: PembayaranViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        pembayaranViewModel =
                ViewModelProvider(this).get(PembayaranViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_pembayaran, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        pembayaranViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}