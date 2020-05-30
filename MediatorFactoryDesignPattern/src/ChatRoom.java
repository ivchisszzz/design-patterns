import java.util.ArrayList;
import java.util.List;


public class ChatRoom {

  public List<Person> people = new ArrayList<Person>();
  public boolean isChatBotActive;


  public ChatRoom() {

  }

  public void joinRoom(Person person) {
    String joinMsg = person.name + " joined the room";
    people.add(person);
    System.out.println(joinMsg);
  }

  public void remove(String source) {
    people.stream().filter(p -> p.name.equals(source)).findFirst().ifPresent(p -> {
      people.remove(p);
      System.out.println(p.name + " has been removed from the room!");
    });

  }

  public void writeMessage(String source, String message) {

    if (people.isEmpty()) {
      System.out.println("chatroom is empty");
      return;
    } else if (!people.stream().anyMatch(p -> p.name.equals(source))) {
      System.out.println("This person is not in the chatromm");
      return;
    }

    if (message.equals("addBot")) {
      isChatBotActive = true;
      System.out.println("ChatBot is activated");
      return;
    }
    System.out.println(source + " : " + message);

    isMessageForbidden(source, message, this);
  }

  public void isMessageForbidden(String name, String message, ChatRoom chatRoom) {
    if (isChatBotActive) {
      ChatBot.checkForForbiddenWord(name, message, this);
    }
  }



}
