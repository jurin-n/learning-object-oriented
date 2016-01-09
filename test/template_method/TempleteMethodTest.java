package template_method;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class TempleteMethodTest {

	@Test
	public void test() {
		TempleteMethod sut = new TempleteMethod();
		
		String s = sut.process("create","あんあん");
		assertThat(s, is("return from create!!"));
	}

	@Test
	public void test2() {
		TempleteMethod sut = new TempleteMethod();
		
		String s = sut.process("create","あんあん","いんいん","うんうん");
		assertThat(s, is("return from create!!"));
	}
	@Test
	public void test3() {
		TempleteMethod sut = new TempleteMethod();
		
		String s = sut.process("create","あんあん","いんいん","うんうん",777777777);
		assertThat(s, is("return from create!!"));
	}
	
	@Test
	public void test4() {
		TempleteMethod sut = new TempleteMethod();
		
		String s = sut.process("create");
		assertThat(s, is("return from create!!"));
	}
}
