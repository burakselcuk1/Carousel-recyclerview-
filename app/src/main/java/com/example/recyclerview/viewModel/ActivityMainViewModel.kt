package com.example.recyclerview.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recyclerview.model.Beef
import com.example.recyclerview.model.BeefItems
import kotlinx.coroutines.launch

class ActivityMainViewModel: ViewModel() {

    private val _categryValues : MutableLiveData<ArrayList<Beef>> = MutableLiveData()
    val cateforyValues : MutableLiveData<ArrayList<Beef>> = _categryValues
    val c = BeefItems()


    init {
        viewModelScope.launch {
            _categryValues.postValue(c.defineDatas())
        }

}
}