import org.assertj.core.api.Assertions.*
import org.junit.Test

class FizzBuzzTest {
    @Test
    fun `It should contain only numbers from 1 to 100,'Fizz','Buzz' or 'FizzBuzz'`() {

        val validElements = HashSet<Any>()
        validElements.addAll(1..100)
        validElements.add("Fizz")
        validElements.add("Buzz")
        validElements.add("FizzBuzz")

        assertThat(fizzBuzzList()).allSatisfy {
            assertThat(it).isIn(validElements)
        }
    }

    @Test
    fun `It should print 'Fizz' for multiples of 3`(){
        val thirdElement = fizzBuzzList()[2]
        assertThat(thirdElement).isEqualTo("Fizz")

        val thirtyThirdElement = fizzBuzzList()[32]
        assertThat(thirtyThirdElement).isEqualTo("Fizz")
    }

    @Test
    fun `it should print 'Buzz' for multiples of 5`(){
        val fifthElement = fizzBuzzList()[4]
        assertThat(fifthElement).isEqualTo("Buzz")

        val fiftyFifthElement = fizzBuzzList()[54]
        assertThat(fiftyFifthElement).isEqualTo("Buzz")

    }

    @Test
    fun `it should print 'FizzBuzz' for numbers that are multiples of 3 and 5`(){
        val fifteenthElement = fizzBuzzList()[14]
        assertThat(fifteenthElement).isEqualTo("FizzBuzz")

        val seventyFifthElement = fizzBuzzList()[74]
        assertThat(seventyFifthElement).isEqualTo("FizzBuzz")

    }

}