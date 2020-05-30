public class Person {

  public String name;
  public ChatRoom chatRoom;

  public Person(String name, ChatRoom chatRoom) {
    this.name = name;
    this.chatRoom = chatRoom;
  }



  public void send(String message) {
    chatRoom.writeMessage(name, message);
  }



}
