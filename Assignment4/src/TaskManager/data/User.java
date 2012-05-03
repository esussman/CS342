package TaskManager.data;

public class User
{
  String username;
  //FIXME change to enum
  int status;

  public User(String username, int status)
  {
    this.username = username;
    this.status = status;
  }
  public String toString()
  {
    String ret = "Username " + username + " Status = " + status;
    return ret;
  }
}
