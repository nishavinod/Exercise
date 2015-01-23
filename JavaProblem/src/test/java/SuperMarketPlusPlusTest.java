import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class SuperMarketPlusPlusTest {

	private List<Item> expectedItemValuesAfterUpdate;

	private void initializeTestDataSet() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item("Thermal Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Chicken", 5, 7));
		items.add(new Item("Sulfuras", 0, 80));
		items.add(new Item("Backstage Passes", 15, 20));
		items.add(new Item("Ginger Cake", 3, 6));

		expectedItemValuesAfterUpdate = new ArrayList<Item>();
		expectedItemValuesAfterUpdate.add(new Item("Thermal Vest", 9, 19));
		expectedItemValuesAfterUpdate.add(new Item("Aged Brie", 1, 1));
		expectedItemValuesAfterUpdate.add(new Item("Chicken", 4, 6));
		expectedItemValuesAfterUpdate.add(new Item("Sulfuras", 0, 80));
		expectedItemValuesAfterUpdate.add(new Item("Backstage Passes", 14, 21));
		expectedItemValuesAfterUpdate.add(new Item("Ginger Cake", 2, 5));

		SuperMarketPlusPlus.items = items;

	}

	@Before
	public void setUp() {
		initializeTestDataSet();
	}

	@Test
	public void test_TheTruth() {

		SuperMarketPlusPlus.updateQuality();
		int i = 0;
		for (Item item : SuperMarketPlusPlus.items) {
			System.out.println(item.getName());
			System.out.println(expectedItemValuesAfterUpdate.get(i).getName());
			assertEquals(expectedItemValuesAfterUpdate.get(i).getQuality(),
					item.getQuality());
			assertEquals(expectedItemValuesAfterUpdate.get(i++).getSellIn(),
					item.getSellIn());

		}
	}

}
