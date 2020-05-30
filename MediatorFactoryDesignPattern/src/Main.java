public class Main {

  public static void main(String[] args) {

    ChatRoom chatRoom = new ChatRoom();
    PersonFactory factory = new PersonFactory(chatRoom);


    Person p1 = factory.createPerson("FirstUser");
    Person p2 = factory.createPerson("SecontUser");
    Person p3 = factory.createPerson("ThirdUser");

    chatRoom.joinRoom(p1);
    chatRoom.joinRoom(p2);
    chatRoom.joinRoom(p3);

    p1.send("My first message");
    p2.send("addBot");
    p3.send("cat");
    p3.send("asfasdadssafdasfdfdvdfbdbdgbg");
    p2.send("abvvvv");
    p1.send("My second message");
    p2.send("cat");
    p1.send("cat");
    p1.send("final message");


  }

}
