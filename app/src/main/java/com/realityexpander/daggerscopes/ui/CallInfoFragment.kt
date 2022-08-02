package com.realityexpander.daggerscopes.ui

import androidx.fragment.app.Fragment
import androidx.navigation.navGraphViewModels
import com.realityexpander.daggerscopes.R
import com.realityexpander.daggerscopes.SessionViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CallInfoFragment: Fragment() {

    private val viewModel: SessionViewModel by navGraphViewModels(R.navigation.nested_graph)
}