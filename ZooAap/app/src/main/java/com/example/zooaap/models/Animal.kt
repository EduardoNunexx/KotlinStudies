package com.example.zooaap.models

import com.example.zooaap.R

class Animal(val id:Int,
             val name:String,
             val imageRes:Int,
             val description: String,
             val curiosities:String,
    var isFavorite:Boolean=false,
             val species:String )val animalList = listOf(Animal(id=1,
    name="Dog",
    imageRes= R.drawable.cat,
    description="The dog is one of the oldest humans pet ",
    curiosities="The dogs have around to 40 times more powerful flair than the humans  ",
        species="Canis lupus familiaris"),
        Animal(id=2,
            name="Cat",
            imageRes= R.drawable.cat,
            description="The cat is know by your agility and independence ",
            curiosities="Cats spend about 70% of his days sleeping",
            species="Felis catus"))