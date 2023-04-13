
import Runnable
import java.text.FieldPosition
import javax.swing.text.Position

fun main(){
    val Person=Person("cynthia",19)
    Person.introduce()
    val Shape=Shape.RectangleArea(12.5,6.2)
    Shape.getArea()
    println(Car("The Car is running"))
    val EmployeePerson=EmployeePerson("mumbua",23,"secretarial")
    EmployeePerson.work()

    
}

//Create a class called Person with properties for name and age.
//Write a method called introduce that prints "Hi, my name is {name} and I am {age} years old."
class Person(val name:String,val age:Int){
    fun introduce(){
        println("Hi,my name is $name and i am $age years old")
    }
}

//Create a data class called Employee that extends Person and adds a property for position.
//Write a method called work that prints "I am a {position}."
data class EmployeePerson(val name:String, val age:Int,val position:String){
    fun work(){
        println("I am a {Position}")
    }
}
//Create an abstract class called Shape with an abstract method called area.
//Create a subclass called Rectangle that implements area using the formula width * height.
abstract  class Shape(val area:Double){
    //abstract area
    class RectangleArea(val width:Double,val height:Double){
        fun getArea(){
            val result=width*height
            println(result)
        }
    }
}
//Create an interface called Runnable with a method called run.
//Create a class called Car that implements Runnable and overrides the run method to print "The car is running."
interface Runnable{
    var run:String}
open class Car(val Runnable:String) {
    override fun toString(): String {
        return super.toString()
    }
}




