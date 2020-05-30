
public class PersonFactory {

  public ChatRoom chatRoom;


  public PersonFactory(ChatRoom chatRoom) {

    this.chatRoom = chatRoom;
  }


  public Person createPerson(String name) {
    return new Person(name, chatRoom);

  }


}
