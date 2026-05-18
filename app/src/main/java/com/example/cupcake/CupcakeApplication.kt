package com.example.cupcake

import android.app.Application
import com.example.cupcake.data.CupcakeDatabase
import com.example.cupcake.data.OrderRepository

class CupcakeApplication : Application() {
    // Membina dependensi secara malas (lazy)
    val database by lazy { CupcakeDatabase.getDatabase(this) }
    val repository by lazy { OrderRepository(database.orderDao()) }
}