package com.example.elmapa

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Luchador")
class Luchador(
    val nombre:String,
    val apellido:String,
    val edad:Int,
    val altura:Int,
    val telefono:Int,
    val nombreusuario:String,
    val contraseña:String,

    @PrimaryKey(autoGenerate = true)
    var idLuchador: Int = 0):java.io.Serializable

