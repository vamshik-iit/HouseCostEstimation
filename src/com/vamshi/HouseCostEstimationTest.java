/*
 * @author KUSA VAMSHI
 * 
 */

/*
 *This is unit test case to verify  HouseCostEstimation program
 * Inputs for this is :
 * First input: material grade (0=low standard material  1=above standard material
 *  2= high standard)
 */

package com.vamshi;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class HouseCostEstimationTest {
	@Test
	void testCostEstimation() {
		HouseCostEstimation i=new HouseCostEstimation();
		assertEquals(750000,i.costEstimation(2,300,'Y'));
		}
}
