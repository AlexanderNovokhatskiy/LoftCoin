package com.loftschool.loftcoin.utils.viewmodel;

import androidx.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory viewModelFactory(ViewModelFactory impl);

}
