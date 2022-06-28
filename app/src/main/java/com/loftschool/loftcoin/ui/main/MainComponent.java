package com.loftschool.loftcoin.ui.main;

import com.loftschool.loftcoin.BaseComponent;
import com.loftschool.loftcoin.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
    MainModule.class
}, dependencies = {
    BaseComponent.class
})
public abstract class MainComponent {

    abstract void inject(MainActivity activity);

}
