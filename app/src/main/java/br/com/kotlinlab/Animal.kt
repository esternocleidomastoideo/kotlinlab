package br.com.kotlinlab

open class Animal {

    fun voar(){

        println("voando")
    }



    class Passaro:Animal(){


    }

    fun main(args: Array<String>){


        val passaro=Passaro()
        passaro.voar()



    }

}