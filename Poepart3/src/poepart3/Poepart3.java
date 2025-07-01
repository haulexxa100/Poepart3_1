/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart3;


public class Poepart3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}



public class Poepart3.java {

    public static List<Message> sentMessages = new ArrayList<>();
    public static List<String> disregardedMessages = new ArrayList<>();
    @SuppressWarnings("NonPublicExported")
    public static List<Message> storedMessages = new ArrayList<>();
    public static List<String> messageHashes = new ArrayList<>();
    public static List<String> messageIds = new ArrayList<>();

    public static void sendMessage(String recipient, String messageText) {
        Message msg = new Message(recipient, messageText);
        sentMessages.add(msg);
        messageHashes.add(msg.getHash());
        messageIds.add(msg.getId());
    }

    public static void storeMessage(String recipient, String messageText) {
        storedMessages.add(new Message(recipient, messageText));
    }

    public static void disregardMessage(String messageText) {
        disregardedMessages.add(messageText);
    }

    public static List<String> displaySenderAndRecipient() {
        List<String> output = new ArrayList<>();
        for (Message msg : sentMessages) {
            output.add("Sender ID: " + msg.getId() + ", Recipient: " + msg.getRecipient());
        }
        return output;
    }
    
public String getLongestMessage(List<Message> sentMessages) {
    if (sentMessages == null || sentMessages.isEmpty()) {
        return "";
    }

    Message longest = sentMessages.get(0);
    for (Message msg : sentMessages) {
        if (msg != null && msg.getMessage() != null) {
            if (msg.getMessage().length() > longest.getMessage().length()) {
                longest = msg;
            }
        }
    }

    return (String) longest.getMessage();
}

    public static String searchByMessageId(String id) {
        for (Message msg : sentMessages) {
            if (msg.getId().equals(id)) {
                return "Recipient: " + msg.getRecipient() + ", Message: " + msg.getMessage();
            }
        }
        return "Message ID not found.";
    }

    public static List<String> searchByRecipient(String recipient) {
        List<String> results = new ArrayList<>();
        for (Message msg : sentMessages) {
            if (msg.getRecipient().equals(recipient)) {
                results.add((String) msg.getMessage());
            }
        }
        for (Message msg : storedMessages) {
            if (msg.getRecipient().equals(recipient)) {
                results.add((String) msg.getMessage());
            }
        }
        return results;
    }

    public static String deleteByHash(String hash) {
        for (Message msg : sentMessages) {
            if (msg.getHash().equals(hash)) {
                sentMessages.remove(msg);
                messageHashes.remove(hash);
                messageIds.remove(msg.getId());
                return "Message \"" + msg.getMessage() + "\" successfully deleted.";
            }
        }
        return "Message not found.";
    }

    public static List<String> displayReport() {
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        List<String> report = new ArrayList<>();
        for (Message msg : sentMessages) {
            report.add(msg.toString());
        }
        /*return report;*/
        return (null);
}

    private static class Message {

        public Message(String recipient, String messageText) {
        }

        private String getHash() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getId() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getRecipient() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Object getMessage() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    /*}
    MessageAppTest.java (JUnit 5)
    
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    
    import java.util.List;
    
    import static org.junit.jupiter.api.Assertions.*;*/

public class MessageAppTest {

    void setup() {
        MessageApp.sentMessages.clear();
        MessageApp.storedMessages.clear();
        MessageApp.disregardedMessages.clear();
        MessageApp.messageHashes.clear();
        MessageApp.messageIds.clear();

        // Test Data
        MessageApp.sendMessage("‪+27834557896‬", "Did you get the cake?");
        MessageApp.storeMessage("‪+27838884567‬", "Where are you? You are late! I have asked you to be on time.");
        MessageApp.disregardMessage("Yohoooo, I am at your gate.");
        MessageApp.sendMessage("0838884567", "It is dinner time !");
    }

    /*@Test*/
    void testSentMessagesContent() {
        List<String> messages = MessageApp.displaySenderAndRecipient();
        assertEquals(2, messages.size());
        assertTrue(messages.get(0).contains("‪+27834557896‬"));
        assertTrue(messages.get(1).contains("0838884567"));
    }

    /*@Test*/
    void testFindLongestMessage() {
        String longest = (String) MessageApp.findLongestSentMessage();
        assertEquals("It is dinner time !", longest);
    }
        
        
    /*@Test*/
    void testSearchByMessageId() {
        String result = MessageApp.searchByMessageId("0838884567");
        assertTrue(result.contains("Recipient: 0838884567"));
        assertTrue(result.contains("It is dinner time !"));
    }

    /*@Test*/
    void testSearchByRecipient() {
        List<String> messages = MessageApp.searchByRecipient("‪+27838884567‬");
        assertEquals(1, messages.size());
        assertEquals("Where are you? You are late! I have asked you to be on time.", messages.get(0));
    }


    void testDeleteByHash() {
        MessageApp.sendMessage("‪+27838884567‬", "Ok, I am leaving without you.");
        String hashToDelete = MessageApp.sentMessages.get(2).getHash();
        String response = MessageApp.deleteByHash(hashToDelete);
        assertTrue(response.contains("successfully deleted"));
        assertEquals(2, MessageApp.sentMessages.size());
    }


    void testDisplayReport() {
        List<String> report = MessageApp.displayReport();
        assertEquals(2, report.size());
        assertTrue(report.get(0).contains("Hash:"));
        assertTrue(report.get(1).contains("Recipient:"));
}
  
    private void assertTrue(boolean contains) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(int i, int size) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(String it_is_dinner_time_, String longest) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    

    }