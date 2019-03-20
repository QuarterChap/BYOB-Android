package com.cearleysoftware.byob.ui.fragments.alex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cearleysoftware.byob.R
import com.cearleysoftware.byob.databinding.FragmentAlexBinding
import com.cearleysoftware.byob.extensions.inflateWithBinding
import com.cearleysoftware.byob.ui.viewmodels.MainViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

//  Copyright © 2019 Cearley Software. All rights reserved.

class AlexFragment: Fragment() {

    private lateinit var binding: FragmentAlexBinding
    private val mainViewModel by sharedViewModel<MainViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = inflater.inflateWithBinding(R.layout.fragment_alex, container)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}