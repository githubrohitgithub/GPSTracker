package com.rohit.gpstracker.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.rohit.gpstracker.model.RepositoryData
import com.rohit.gpstracker.network.RetroRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val repository: RetroRepository)
    : ViewModel(){

    fun getAllRepositoryList(): LiveData<List<RepositoryData>> {
        return repository.getAllRecords()
    }

    fun makeApiCall(query:String) {
        repository.makeApiCall(query)
    }
}