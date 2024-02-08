package com.mahammadjafarzade.common.base

import com.mahammadjafarzade.common.flowState.State
import kotlinx.coroutines.flow.MutableStateFlow

open class BaseViewModel {
    val state : MutableStateFlow<State?> = MutableStateFlow(null)
}