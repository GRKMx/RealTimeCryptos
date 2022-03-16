package com.ersizer.cryptocrazyapp.viewmodel

import androidx.lifecycle.ViewModel
import com.ersizer.cryptocrazyapp.model.Crypto
import com.ersizer.cryptocrazyapp.repository.CryptoRepository
import com.ersizer.cryptocrazyapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
) : ViewModel() {

    suspend fun getCrypto(id: String) : Resource<Crypto>{
        return repository.getCrypto(id)
    }

}