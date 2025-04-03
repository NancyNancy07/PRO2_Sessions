package via.pro2.json.model;

public class Message
{
  private Student student;
  private String message;

  public Message(Student student, String message)
  {
    this.student = student;
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public Student getStudent()
  {
    return student;
  }

  @Override public String toString()
  {
    return "Message: " + message;
  }
}
