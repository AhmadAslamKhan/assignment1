
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {


	@Test
	void test1() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.display();
		
		stack.top();
		
		assertEquals(5,stack.pop());	
		assertEquals(4,stack.pop());	
		assertEquals(3,stack.pop());	
		
		stack.display();
		
		stack.pop();
		stack.pop();
		
		stack.pop();
		stack.top();
	}


	@Test
	void test2() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.display();
		
		stack.top();
		
		assertNotEquals(6,stack.pop());	
		assertNotEquals(7,stack.pop());	
		assertNotEquals(8,stack.pop());	
		assertNotEquals(9,stack.pop());	
		assertNotEquals(10,stack.pop());	
		
		stack.display();
		
		stack.pop();
		stack.top();
			
	}

	@Test
	void test3() {
		Stack stack = new Stack();
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		
		stack.display();
		
		stack.top();
		
		assertTrue(1<stack.pop());	
		assertTrue(2<stack.pop());	
		assertTrue(3<stack.pop());	
		assertTrue(4<stack.pop());	
		assertTrue(5<stack.pop());	
		
		stack.display();
		
		stack.pop();
		stack.top();
			
	}


	@Test
	void test4() {
		Stack stack = new Stack();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		stack.display();
		
		stack.top();
		
		assertFalse(5>stack.pop());	
		assertFalse(4>stack.pop());	
		assertFalse(3>stack.pop());	
		assertFalse(2>stack.pop());	
		assertFalse(1>stack.pop());
		
		stack.display();	
		
		stack.pop();
		stack.top();
			
	}


	@Test
	void test5() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.display();
		
		stack.top();
		
		assertNotNull(stack);	

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.display();
		
		stack.pop();
		stack.top();
			
	}

	
	@Test
	void test6() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.display();
		
		stack.top();
		
		assertSame(5,stack.pop());	
		assertSame(4,stack.pop());	
		assertSame(3,stack.pop());	
		
		stack.display();
		
		stack.pop();
		stack.top();
			
	}


	@Test
	void test7() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.display();
		
		stack.top();
		
		assertNotSame(6,stack.pop());	
		assertNotSame(7,stack.pop());	
		assertNotSame(8,stack.pop());	
		assertNotSame(9,stack.pop());	
		assertNotSame(10,stack.pop());	
		
		stack.display();
		
		stack.pop();
		stack.top();
			
	}
	
	@Test
	void test8() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		stack.display();
		
		stack.top();
		
		assertEquals(5,stack.top());
		
		stack.pop();
		stack.top();
	}


	@Test
	void test9() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.display();
		
		stack.top();
		
		assertEquals(5,stack.getSize());
		
		stack.pop();
		stack.top();
	}

	@Test
	void test10() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.display();
		
		assertNotEquals(4,stack.top());
		
		stack.pop();
		stack.top();
	}

	@Test
	void test11() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.display();
		
		stack.top();
		
		assertNotEquals(4,stack.getSize());
		
		stack.pop();
		stack.top();
	}

}
