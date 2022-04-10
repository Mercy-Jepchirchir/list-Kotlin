fun main() {

    /* 1. Given a list of 10 strings, write a function that returns a list of the strings
    at even indices i.e index 2,4,6 etc     (2 points)

    2. Given a list of people’s heights in metres. Write a function that returns
    the average height and the total height    (2 points)

    3. Given a list of Person objects, each with the attributes, name, age,
    height and weight. Sort the list in order of descending age   (2 points)

    4.  Given a list similar to the one above, write a function in which you will
    create 2 more people objects and add them to the list at one go.
    (1 points)

    5. Write a function that takes in a list of Car objects each with a
            registration and mileage attribute and returns the average mileage of
            all the vehicles in the list*/
    //no.1
    var z = takeListStrings(
        listOf("Jepchirchir", "Anita", "Juana", "vida", "conslate", "Yasmin", "Verite", "Jerop", "Nadine", "Kipkemoi"))
    println(z)

    //no.2

    var height = takeAverage(listOf(66.5, 77.0, 6.6, 4.5, 88.0, 65.0))
    println(height)

    //no.3

    var Me = Person("Mercy", 21, 56.0, 60.0)
    var Mercykemboi = Person("kemboi", 23, 66.0, 70.0)
    var chiri = Person("chiri", 25, 46.0, 33.0)
    var naima = Person("naima", 23, 36.0, 66.0)

    var peoplee = listOf(Me, Mercykemboi, chiri, naima)
    var arrange = peoplee.sortedByDescending { person -> person.age }
    println(arrange)

    //no.4
    var kIR= Person("Kirigo",40,55.0,88.0)
    var cudram=Person("Cudra",33,43.0,55.0)
    var kim=Person("Kemboiii",6,7.0,26.0)

    var all= mutableListOf(kIR,cudram,kim)
    println(arrange.plus(all))


    //no.5
    var v8 = Car("KVN 555", 88)
    var toyota = Car("Kbm 666", 100)
    var subaru = Car("KNN 675", 234)

    var allCars = listOf(v8, toyota, subaru)
    println(mileage(allCars))
}

//no.1
fun takeListStrings(name:List<String>):List<String>{
    var x = mutableListOf<String>()
   name.forEachIndexed { index, n ->
       if (index%2==0){
           x.add(n)
       }
   }
    return x
}
//no.2
fun takeAverage(people:List<Double>):String{
    var allsum=people.sum()
    var totalaverage=people.average()
    var alltogether= "$allsum $totalaverage"

    return alltogether

}
//no.3
data class Person(var name:String, var age:Int, var height:Double, var weight:Double)

//no.4
fun anotherPerson(pple:List<Any>):List<Any>{
    return listOf()
}

//no.5
data class Car(var registration:String, var mileage:Int)

fun mileage(vehicles: List<Car>):Int{
    var v= 0
    vehicles.forEach { car -> car.mileage
        v+=car.mileage
    }
    var average=v/vehicles.count()
    return average

}