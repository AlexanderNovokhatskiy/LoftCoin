package com.loftschool.loftcoin.ui.currency;

import androidx.lifecycle.ViewModelProvider;

import com.loftschool.loftcoin.BaseComponent;
import com.loftschool.loftcoin.utils.viewmodel.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
    CurrencyModule.class,
    ViewModelModule.class
}, dependencies = {
    BaseComponent.class
})
abstract class CurrencyComponent {

    abstract ViewModelProvider.Factory viewModelFactory();

}
