
public enum ChatBot {
  INSTANCE;

  private static final String FORBIDDEN_WORD = "cat";

  public static void checkForForbiddenWord(String name, String message, ChatRoom chatRoom) {

    if (message.equals(FORBIDDEN_WORD)) {
      chatRoom.remove(name);
      System.out.println("'" + FORBIDDEN_WORD + "'" + " is forbidden for this chat room");
    }

  }

}
