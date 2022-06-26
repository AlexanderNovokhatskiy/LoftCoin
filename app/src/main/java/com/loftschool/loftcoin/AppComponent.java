package com.loftschool.loftcoin;

import android.app.Application;

import com.loftschool.loftcoin.data.DataModule;
import com.loftschool.loftcoin.utils.UtilModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
    com.loftschool.loftcoin.AppModule.class,
    DataModule.class,
    UtilModule.class
})
abstract class AppComponent implements com.loftschool.loftcoin.BaseComponent {

    @Component.Builder
    static abstract class Builder {
        @BindsInstance
        abstract Builder application(Application app);

        abstract AppComponent build();
    }

}
