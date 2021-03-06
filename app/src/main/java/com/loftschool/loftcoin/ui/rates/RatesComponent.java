package com.loftschool.loftcoin.ui.rates;

import androidx.lifecycle.ViewModelProvider;


import com.loftschool.loftcoin.BaseComponent;
import com.loftschool.loftcoin.ui.rates.RatesAdapter;
import com.loftschool.loftcoin.utils.viewmodel.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
    RatesModule.class,
    ViewModelModule.class
}, dependencies = {
    BaseComponent.class
})
abstract class RatesComponent {

    abstract ViewModelProvider.Factory viewModelFactory();

    abstract RatesAdapter ratesAdapter();

}
