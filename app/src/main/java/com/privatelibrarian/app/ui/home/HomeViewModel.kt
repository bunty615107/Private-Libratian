package com.privatelibrarian.app.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class HomeUiState(
    val searchQuery: String = "",
    val isSearching: Boolean = false,
    val results: List<String> = emptyList(), // Placeholder for now
    val isIndexing: Boolean = false
)

class HomeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    fun onSearchQueryChanged(query: String) {
        _uiState.value = _uiState.value.copy(searchQuery = query)
        // Trigger search logic here
    }

    fun onSearchTriggered() {
        // Perform search
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isSearching = true)
            // Simulate search
            kotlinx.coroutines.delay(1000)
            _uiState.value = _uiState.value.copy(
                isSearching = false,
                results = listOf("Result 1", "Result 2", "Result 3")
            )
        }
    }
}
