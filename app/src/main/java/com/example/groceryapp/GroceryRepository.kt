package com.example.groceryapp

import androidx.lifecycle.ViewModel

class GroceryRepository (private val db:GroceryDataBase):ViewModel(){

    suspend fun insert(items: GroceryItems)=db.getGroceryDao().insert(items)
    suspend fun delete(items: GroceryItems)=db.getGroceryDao().delete(items)

    fun getAllItems() = db.getGroceryDao().getAllGroceryItems()
}