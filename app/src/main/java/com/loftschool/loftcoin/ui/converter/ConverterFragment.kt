package com.loftschool.loftcoin.ui.converter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.loftschool.loftcoin.BaseComponent
import com.loftschool.loftcoin.R
import javax.inject.Inject

class ConverterFragment @Inject constructor(

) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
        = inflater.inflate(R.layout.fragment_converter, container, false)

}