package headfirst.chap02;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoteTest {

	@Test
	public void test() {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);

	}

}
