package epam.tddjunit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
	class RemoveATest {
		
		/* TODO list for my feature
		 * 1. ABCD => BCD
		 * 2. AACD => CD
		 * 3. BACD => BCD
		 * 4. BBAA => BBAA
		 * 5. AABAA => BAA
		 * 6. AA => ""
		 * 7. "" => "" 
		 */

		RemoveA removeChars;
		
		@BeforeEach
		void setUp() {
			removeChars = new RemoveA();
		}
		
		@Test
		void testRemove1() {
			assertEquals("BCD", removeChars.remove("ABCD"));
		}
		
		@Test
		void testRemove2() {
			assertEquals("CD", removeChars.remove("AACD"));
		}
		
		@Test
		void testRemove3() {
			assertEquals("BCD", removeChars.remove("BACD"));
		}
		
		@Test
		void testRemove4() {
			assertEquals("BBAA", removeChars.remove("BBAA"));
		}
		
		@Test
		void testRemove5() {
			assertEquals("BAA", removeChars.remove("AABAA"));
		}
		
		@Test
		void testRemove6() {
			assertEquals("", removeChars.remove("AA"));
		}
		
		@Test
		void testRemove7() {
			assertEquals("", removeChars.remove(""));
		}

}
