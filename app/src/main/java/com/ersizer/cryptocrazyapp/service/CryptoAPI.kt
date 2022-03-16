package com.ersizer.cryptocrazyapp.service

import com.ersizer.cryptocrazyapp.model.Crypto
import com.ersizer.cryptocrazyapp.model.CryptoList
import com.ersizer.cryptocrazyapp.model.CryptoListItem
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoAPI {

    //"https://api.nomics.com/v1/currencies/ticker?key=your-key-here&ids=BTC,ETH,XRP&interval=1d,30d&convert=EUR&platform-currency=ETH&per-page=100&page=1"
    //prices?key=f20c5675d26ce823104ecccc826429ada5bb7fe6

    @GET("prices")
    suspend fun getCryptoList(
        @Query("key") key : String
    ) : CryptoList

    //https://api.nomics.com/v1/currencies?key=<Kendi API Anahtarınız>&ids=BTC&attributes=id,name,logo_url

    @GET("currencies")
    suspend fun getCrypto(
        @Query("key") key : String,
        @Query("ids") id : String,
        @Query("attributes") attributes : String
    ) : Crypto


}