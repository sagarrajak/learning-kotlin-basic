import com.testkotlin.Person
import com.testkotlin.enum_example.Color
import com.testkotlin.enum_example.ColorInput
import com.testkotlin.enum_example.getWarmth
import com.testkotlin.enum_example.mix
import com.testkotlin.enum_example.mixOptimized

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
//    var person  = Person("sagar", "rajak", 5.5F, 25, false);
//    var person2 = Person("sagar", "rajak", 5.5F, 25, false);
////    println(person.toString());
////    println(person.firstName)
////    println(person.lastName)
////    println(person.fullName)
////    println(person.fullName)
////    person.firstName = "test"
////    println(person.firstName)
////    println(person.fullName)
//    println(person == person2)
//    val person3 = Person(_lastName = "testking",  _firstName = "donkey");
//    val person4 = Person(_lastName = "testking wife",  _firstName = "female", _partener = person3);
//    println(person4);
    println(ColorInput.BLUE.rgb())
    println(ColorInput.getMnemonic(ColorInput.BLUE))
    println(getWarmth(ColorInput.BLUE))
    println(mix(ColorInput.RED, ColorInput.YELLOW));
    println(mix(ColorInput.YELLOW, ColorInput.RED))
    println(mixOptimized(ColorInput.YELLOW, ColorInput.RED))
}