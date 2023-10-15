@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        boolean expected = true;
        // Напиши код здесь
        assertEquals("Пользователю меньше лет", expected, isAdult);
        }