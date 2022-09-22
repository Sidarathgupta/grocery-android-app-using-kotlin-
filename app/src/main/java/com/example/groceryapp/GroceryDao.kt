package com.example.groceryapp

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.groceryapp.GroceryItems

@Dao
interface GroceryDao {

        @Insert(onConflict= OnConflictStrategy.REPLACE)
        suspend fun insert(item: GroceryItems)

        @Delete
        suspend fun delete(item: GroceryItems)

        @Query("Select * from grocery_items")
        fun getAllGroceryItems(): LiveData<List<GroceryItems>>
}