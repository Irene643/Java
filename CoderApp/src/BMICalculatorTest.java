import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
    @Nested
    class IsDietRecommended{
        @ParameterizedTest
//    @ValueSource(doubles = {70.0, 89.0, 110.0})
        @CsvSource(value = {"89.0, 1.72", "95.0, 1.75", "110.0, 1.78"})

        void should_ReturnTrueWhenDietIsRecommended(Double coderWeight, Double coderHeight) {
            //given
            double weight = coderWeight;
            double height = coderHeight;
            //when
            boolean recommended = BMICalculator.isDietRecommended(weight, height);

            //then
            assertTrue(recommended);
        }

        @RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME)
        void should_ReturnFalseWhenDietNotRecommended() {
            //given
            double weight = 50.0;
            double height = 1.92;
            //when
            boolean recommended = BMICalculator.isDietRecommended(weight, height);

            //then
            assertFalse(recommended);
        }
        @Test
        void should_ThrowArithmeticException_When_HeightZero() {
//        //given
//        double weight = 50.0;
//        double height = 0.00;
//        //when
//        Executable executable = BMICalculator.isDietRecommended(weight, height);
//
//        //then
//        assertThrows(ArithmeticException.class, executable);
        }
    }

    @Nested
    class CoderWithWorstBMI{
        @Test
        void should_ReturnCoder_With_WorstBMI(){
            //given
            List<Coder> coders = new ArrayList<>();
            coders.add(new Coder(1.8, 60.00));
            coders.add(new Coder(1.82, 98.00));
            coders.add(new Coder(1.82, 64.7));

            //when
            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);
            //then
            assertAll(
                    () -> assertEquals(1.82, coderWorstBMI.getHeight()),
                    () -> assertEquals(98.00, coderWorstBMI.getWeight())
            );
        }

        @Test
        void should_ReturnCoderWithWorstBMIIn1Ms_When_CoderListHas1000Elements(){
            //given
            List<Coder> coders = new ArrayList<>();
            for(int i = 0; i<1000; i++){
                coders.add(new Coder(1.0 + i, 10.0 + i));
            }
            //when
            Executable executable = () -> BMICalculator.findCoderWithWorstBMI(coders);
            //then
            assertTimeout(Duration.ofMillis(500), executable);
        }
    }

    @Nested
    @DisplayName("Coder List")
//    @Disabled
//    @DisabledOnOs(OS.WINDOWS)
    class CoderList{
        @Test
        void should_ReturnNull_When_CoderListEmpty(){
            //given
            List<Coder> coders = new ArrayList<>();

            //when
            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);
            //then
            assertNull(coderWorstBMI);
        }

        @Test
        void should_ReturnCorrectBMIScoreArray_When_CoderListNotEmpty(){
            //given
            List<Coder> coders = new ArrayList<>();
            coders.add(new Coder(1.8, 60.00));
            coders.add(new Coder(1.82, 98.00));
            coders.add(new Coder(1.82, 64.7));

            double[] expected = {18.52, 29.59, 19.53};
            //when
            double[] bmiScore = BMICalculator.getBMIScores(coders);
            //then
            assertArrayEquals(expected, bmiScore);
        }
    }
}