package com.example.cupcake.data

data class OrderUiState(
    val quantity: Int = 0,
    val flavor: String = "",
    val date: String = "",
    val price: String = "",
    val pickupOptions: List<String> = listOf(),
    val orderHistory: List<OrderEntity> = listOf() // Ditambah untuk memegang data Room
)