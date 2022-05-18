import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DietPlannerTest {
    private DietPlanner dietPlanner;
    @BeforeAll
    static void beforeAll(){
        System.out.println("Executes before all unit tests");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Executes after all tests");
    }
    @BeforeEach
    void setup(){
        this.dietPlanner = new DietPlanner(20, 50, 30);
    }
    @AfterEach
    void afterEach(){
        System.out.println("A unit test was finished. ");
    }
    @Test
    void should_ReturnCorrectDietPlan_When_CorrectCoder() {
        //given
        Coder coder = new Coder(1.82, 75.0, 26, Gender.MALE);
        DietPlan expected = new DietPlan(2202, 110, 122, 165);
        //when
        DietPlan actual = dietPlanner.calculateDiet(coder);
        //then
        assertAll(
                () -> assertEquals(expected.getCalories(), actual.getCalories()),
                () -> assertEquals(expected.getProtein(), actual.getProtein()),
                () -> assertEquals(expected.getFat(), actual.getFat()),
                () -> assertEquals(expected.getCarbohydrate(), actual.getCarbohydrate())
        );
    }
}