import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleJUnitTest {

    int result;
@BeforeAll
static void beforeAll(){
    System.out.println("### beforeAll()\n");
}
  @BeforeEach
  void beforeEach(){
      System.out.println("new \n###      beforeEach()");
      result = getResult();
  }
  @AfterEach
  void afterEach(){
      System.out.println("###       afterEach()\n");
      result = 0;
  }
    @Test
    void firstTest() {
        System.out.println("###      firstTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        int result = getResult();
        System.out.println("###      secondTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        int result = getResult();
        System.out.println("###      thirdTest()");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }

    @AfterAll
    static void afterAll(){
        System.out.println("\n ### afterAll()");
    }

}