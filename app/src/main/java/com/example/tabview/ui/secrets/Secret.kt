package com.example.tabview.ui.secrets

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tabview.R

class Secret : Fragment() {



    private lateinit var secretViewModel: SecretViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        secretViewModel = ViewModelProvider(this)[SecretViewModel::class.java]
        return inflater.inflate(R.layout.fragment_secret, container, false)

    }



}