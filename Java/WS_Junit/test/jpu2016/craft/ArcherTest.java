package jpu2016.craft;

import org.junit.jupiter.api.BeforeEach;

import jpu2016.hero.Human;

public class ArcherTest extends CraftTest {
	@Override
	@BeforeEach
	public void setUp() {
		this.craft = new Archer(new Human());
	}
}