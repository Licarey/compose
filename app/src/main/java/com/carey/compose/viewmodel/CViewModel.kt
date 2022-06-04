package com.carey.compose.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

class CViewModel(defaultCount: Int = 0) : ViewModel() {

    private val _count = MutableLiveData(defaultCount)

    val count: LiveData<Int>
        get() = _count

    fun onCountChanged(count: Int) {
        _count.postValue(count)
    }

}

@HiltAndroidApp
class TwoViewModel @Inject constructor(defaultCount: Int) : ViewModel() {

    private val _count = MutableLiveData(defaultCount)

    val count: LiveData<Int>
        get() = _count

    fun onCountChanged(count: Int) {
        _count.postValue(count)
    }

}

class CViewModelFactory(private val defaultCount: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CViewModel(defaultCount) as T
    }

}