package com.loftschool.loftcoin;

import android.content.Context;

import com.loftschool.loftcoin.data.remote.service.coins.CoinsRepo;
import com.loftschool.loftcoin.data.remote.service.currency.CurrencyRepo;
import com.loftschool.loftcoin.utils.image_loader.ImageLoader;


public interface BaseComponent {
    Context context();
    CoinsRepo coinsRepo();
    CurrencyRepo currencyRepo();
    ImageLoader imageLoader();
}
