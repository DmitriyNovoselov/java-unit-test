 @RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
	 // Инициализируй поля класса в конструкторе
  }

  // Пометь метод аннотацией для параметров
     @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
                { 19, true},
                { 10, false},
                { 18, true},
                { 18, true}
		 // Заполни массив тестовыми данными и ожидаемым результатом
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
      
	 // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Возраст 18 и 21", result, isAdult);
	}
}