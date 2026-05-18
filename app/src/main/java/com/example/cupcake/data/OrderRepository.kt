package com.example.cupcake.data

import kotlinx.coroutines.flow.Flow

class OrderRepository(private val orderDao: OrderDao) {

    fun getAllOrdersStream(): Flow<List<OrderEntity>> = orderDao.getAll()

    suspend fun insertOrder(order: OrderEntity) {
        orderDao.insert(order)
    }
}