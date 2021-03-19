package edu.itesm.pokedex

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pokemon(val picture:Int,
                 val name:String,
                 val type:String,
                 val description: String) : Parcelable
