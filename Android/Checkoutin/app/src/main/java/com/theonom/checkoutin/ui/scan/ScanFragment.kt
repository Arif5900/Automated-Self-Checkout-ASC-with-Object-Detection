package com.theonom.checkoutin.ui.scan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.theonom.checkoutin.R

class ScanFragment : Fragment() {

    private lateinit var scanViewModel: ScanViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        scanViewModel =
                ViewModelProvider(this).get(ScanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_scan, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        scanViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}