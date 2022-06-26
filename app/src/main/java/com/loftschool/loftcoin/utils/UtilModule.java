package com.loftschool.loftcoin.utils;

import com.loftschool.loftcoin.utils.image_loader.ImageLoader;
import com.loftschool.loftcoin.utils.image_loader.PicassoImageLoader;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class UtilModule {

    @Binds
    abstract ImageLoader imageLoader(PicassoImageLoader impl);

}
