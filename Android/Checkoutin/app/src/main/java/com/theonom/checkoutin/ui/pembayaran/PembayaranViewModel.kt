package com.theonom.checkoutin.ui.pembayaran

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PembayaranViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ini Fragment Pembayaran"
    }
    val text: LiveData<String> = _text
}