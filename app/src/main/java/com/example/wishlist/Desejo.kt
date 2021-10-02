package com.example.wishlist

import java.io.Serializable


import android.os.Bundle
import android.widget.*

class Desejo (var descricao: String, var nota: Int): Serializable{
    override fun toString(): String {
        return "${descricao} - ${nota} "
    }
}