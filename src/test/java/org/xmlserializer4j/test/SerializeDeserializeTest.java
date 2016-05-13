package org.xmlserializer4j.test;
import org.junit.Test;
import org.xmlserializer4j.XMLSerializer;
import org.xmlserializer4j.test.model.TestObject;

import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'Martin' at '12-5-16 19:53' with Gradle 2.11
 *
 * @author Martin, @date 12-5-16 19:53
 */
public class SerializeDeserializeTest {
	
    @Test public void testSerializeDeserialize() {
    	
    	// Create test object
    	Object original = TestObject.getInstance(3);
    	
    	// Create serializer & serialize test object
		XMLSerializer xmlSerializer = new XMLSerializer();
		xmlSerializer.serialize(original);
		
		// Deserialize object
		Object deserialized = xmlSerializer.deserialize();
		
		// Check if original & deserialized object are equal
		assertEquals(original, deserialized);
    }
}
