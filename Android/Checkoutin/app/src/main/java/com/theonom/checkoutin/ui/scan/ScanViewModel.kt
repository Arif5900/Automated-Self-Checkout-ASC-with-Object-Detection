package com.theonom.checkoutin.ui.scan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScanViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ini Fragment Scan"
    }
    val text: LiveData<String> = _text
}