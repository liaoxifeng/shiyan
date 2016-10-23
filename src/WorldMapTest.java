import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WorldMapTest {

	public static char worldmap[][];
	public static WorldMap worldMap=new WorldMap();
	@Before
	public void setUp() throws Exception {
		//worldmap=worldMap.getworldmap();
	}

	
	@Test
	public void testGetNextStatus() {
		System.out.println("第六行，第七列的细胞周围有"+worldMap.GetNextStatus(6, 7)+"个细胞");
		System.out.println("第四行，第一列的细胞周围有"+worldMap.GetNextStatus(4, 1)+"个细胞");
		System.out.println("第五行，第九列的细胞周围有"+worldMap.GetNextStatus(5, 9)+"个细胞");
		System.out.println("第九行，第十五列的细胞周围有"+worldMap.GetNextStatus(9, 15)+"个细胞");
		System.out.println("第九行，第十五列的细胞周围有"+worldMap.GetNextStatus(6, 16)+"个细胞");
		worldMap.ChangeStatus();
		worldmap=worldMap.getworldmap();
		System.out.println("0表示死细胞，1表示活细胞");
		System.out.println("下一状态(6,7)细胞的情况为"+worldmap[6][7]);
		System.out.println("下一状态(4,1)细胞的情况为"+worldmap[4][1]);
		System.out.println("下一状态(5,9)细胞的情况为"+worldmap[5][9]);
		System.out.println("下一状态(9,15)细胞的情况为"+worldmap[9][15]);
		System.out.println("下一状态(6,16)细胞的情况为"+worldmap[6][16]);
		
		
	}

}
