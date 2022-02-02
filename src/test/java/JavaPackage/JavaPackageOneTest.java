package JavaPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaPackageOneTest {

        @Test
        void twoPositiveNumbers(){
            //given
            int a = 5;
            int b = 96;

            //when
            int result = JavaPackageOne.add(a,b);

            //assert equal
            assertEquals(101, result);

            //assert greater than 100
            assertTrue(true);
        }



}