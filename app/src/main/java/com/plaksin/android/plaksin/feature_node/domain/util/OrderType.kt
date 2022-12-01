package com.plaksin.android.plaksin.feature_node.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}