package whiteBoxTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest
{
  private Password password;

  @BeforeEach void setUp()
  {
    //    password = new Password("ABCabc123");
  }

  @Test void constructorNull()
  {
    //    another way to show the message
    IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
        () -> new Password(null));
    assertEquals("Password must have at least 6 characters", ex.getMessage());

    //    one way
    assertThrows(IllegalArgumentException.class, () -> new Password(null));
  }

  @Test void constructorLength5()
  {
    assertThrows(IllegalArgumentException.class, () -> new Password("12345"));
  }

  @Test void constructorLength6()
  {
    //    assertDoesNotThrow(() -> new Password("ABab12"));

    //    another way
    password = new Password("ABab12");
    assertDoesNotThrow(() -> new Password("ABab12"));
    assertEquals("ABab12", password.getPassword());

  }

  @Test void constructorLength9()
  {
    assertDoesNotThrow(() -> new Password("ABCdef123"));
  }

  @Test void constructorZeroUpperCase()
  {
    assertThrows(IllegalArgumentException.class, () -> new Password("abc123"));
  }

  @Test void constructorZeroLowerCase()
  {
    assertThrows(IllegalArgumentException.class, () -> new Password("ABC123"));
  }

  @Test void constructorZeroDigit()
  {
    assertThrows(IllegalArgumentException.class, () -> new Password("ABcdef"));
  }

  @Test void constructorUnderScore()
  {
    assertDoesNotThrow(() -> new Password("Ab_cd1234"));
  }

  @Test void constructorHyphen()
  {
    assertDoesNotThrow(() -> new Password("Ab-cd1234"));
  }

  @Test void constructorUnderScoreAndHyphen()
  {
    assertDoesNotThrow(() -> new Password("Ab-cd-123"));
  }

  @Test void constructorSpecialCh()
  {
    assertThrows(IllegalArgumentException.class, () -> new Password("ABcd12$"));
  }

  @Test void constructorOnlySpecialCh()
  {
    assertThrows(IllegalArgumentException.class, () -> new Password("@£$€&(+"));

  }
}
