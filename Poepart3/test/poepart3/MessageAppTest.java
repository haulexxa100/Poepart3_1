/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poepart3;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class MessageAppTest {
    
    public MessageAppTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sendMessage method, of class MessageApp.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        String recipient = "";
        String messageText = "";
        MessageApp.sendMessage(recipient, messageText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeMessage method, of class MessageApp.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        String recipient = "";
        String messageText = "";
        MessageApp.storeMessage(recipient, messageText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disregardMessage method, of class MessageApp.
     */
    @Test
    public void testDisregardMessage() {
        System.out.println("disregardMessage");
        String messageText = "";
        MessageApp.disregardMessage(messageText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displaySenderAndRecipient method, of class MessageApp.
     */
    @Test
    public void testDisplaySenderAndRecipient() {
        System.out.println("displaySenderAndRecipient");
        List<String> expResult = null;
        List<String> result = MessageApp.displaySenderAndRecipient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findLongestSentMessage method, of class MessageApp.
     */
    @Test
    public void testFindLongestSentMessage() {
        System.out.println("findLongestSentMessage");
        Object expResult = null;
        Object result = MessageApp.findLongestSentMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByMessageId method, of class MessageApp.
     */
    @Test
    public void testSearchByMessageId() {
        System.out.println("searchByMessageId");
        String id = "";
        String expResult = "";
        String result = MessageApp.searchByMessageId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByRecipient method, of class MessageApp.
     */
    @Test
    public void testSearchByRecipient() {
        System.out.println("searchByRecipient");
        String recipient = "";
        List<String> expResult = null;
        List<String> result = MessageApp.searchByRecipient(recipient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteByHash method, of class MessageApp.
     */
    @Test
    public void testDeleteByHash() {
        System.out.println("deleteByHash");
        String hash = "";
        String expResult = "";
        String result = MessageApp.deleteByHash(hash);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayReport method, of class MessageApp.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        List<String> expResult = null;
        List<String> result = MessageApp.displayReport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
