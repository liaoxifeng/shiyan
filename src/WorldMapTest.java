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
		System.out.println("�����У������е�ϸ����Χ��"+worldMap.GetNextStatus(6, 7)+"��ϸ��");
		System.out.println("�����У���һ�е�ϸ����Χ��"+worldMap.GetNextStatus(4, 1)+"��ϸ��");
		System.out.println("�����У��ھ��е�ϸ����Χ��"+worldMap.GetNextStatus(5, 9)+"��ϸ��");
		System.out.println("�ھ��У���ʮ���е�ϸ����Χ��"+worldMap.GetNextStatus(9, 15)+"��ϸ��");
		System.out.println("�ھ��У���ʮ���е�ϸ����Χ��"+worldMap.GetNextStatus(6, 16)+"��ϸ��");
		worldMap.ChangeStatus();
		worldmap=worldMap.getworldmap();
		System.out.println("0��ʾ��ϸ����1��ʾ��ϸ��");
		System.out.println("��һ״̬(6,7)ϸ�������Ϊ"+worldmap[6][7]);
		System.out.println("��һ״̬(4,1)ϸ�������Ϊ"+worldmap[4][1]);
		System.out.println("��һ״̬(5,9)ϸ�������Ϊ"+worldmap[5][9]);
		System.out.println("��һ״̬(9,15)ϸ�������Ϊ"+worldmap[9][15]);
		System.out.println("��һ״̬(6,16)ϸ�������Ϊ"+worldmap[6][16]);
		
		
	}

}
