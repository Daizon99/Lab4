import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz_tc1() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void fizzBuzz_invalid_tc2() { 
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(26));
    }

    @Test
    public void fizzBuzz_tc3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void fizzBuzz_invalid_tc4() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(23));
    }

    @Test
    public void fizzBuzz_tc5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void fizzBuzz_invalid_tc6() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(31));
    }

    @Test
    public void fizzBuzz_tc7() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void fizzBuzz_invalid_tc8() {
        assertEquals("15", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void fizzBuzz_tc9() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    public void fizzBuzz_invalid_tc10() {
        assertEquals("6", FizzBuzz.fizzBuzz(6));
    }

}
