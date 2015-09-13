package test;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest
{
	@Test
	public void testAnagram()
	{
		AnagramImpl al = new AnagramImpl();
		assertTrue(al.areAnagrams("ZZYZX", "X y ZZZ"));
		assertTrue(al.areAnagrams("postmaster", "stamp store"));
		assertTrue(al.areAnagrams("a telescope", "to see place"));
	}

}
