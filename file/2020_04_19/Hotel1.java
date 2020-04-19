package demo;import java.util.Random;
import java.util.jar.Attributes.Name;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "格林豪泰苏州火车站南广场拙政园商务酒店";
		String room = "大床房";
		hotel(name,room);
		Random random = new Random();
		System.out.println("订单号为："+random.nextInt(10000));
	}
	public static void hotel(String name, String room ) {
		String[] hotel01 = {"格林豪泰苏州火车站南广场拙政园商务酒店","江苏省苏州市姑苏区人民路2156号","大床房","189","161","20"};
		String[] hotel02 = {"格林豪泰苏州火车站南广场拙政园商务酒店","江苏省苏州市姑苏区人民路2156号","标间","169","149","10"};
		String[] hotel03 = {"格林豪泰苏州火车站南广场拙政园商务酒店","江苏省苏州市姑苏区人民路2156号","豪华双床房","209","190","30"};
		String[] hotel1 = {"格雅苏州工业园区金鸡湖东方之门酒店","江苏省苏州工业园区星海街169号","豪华双床房","399","339","20"};
		String[] hotel2 = {"格林豪泰苏州漕湖工业园智选酒店","江苏省苏州市相城区黄畦路3号","高级大床房","189","161","10"};
		if (name.equals("格林豪泰苏州火车站南广场拙政园商务酒店")) {
			System.out.println(hotel01[0]+"地址为："+hotel01[1]);
			if (room.equals("大床房")) {
				System.out.println("门市价："+hotel01[3]+"元 会员价："+hotel01[4]+"元 代金券："+hotel01[5]+"元");
			}
			if (room.equals("标间")) {
				System.out.println("门市价："+hotel02[3]+"元 会员价："+hotel02[4]+"元 代金券："+hotel02[5]+"元");
			}
			if (room.equals("豪华双床房")) {
				System.out.println("门市价："+hotel03[3]+" 会员价："+hotel03[4]+"元 代金券："+hotel03[5]+"元");
			}
		}
		if (name.equals("格雅苏州工业园区金鸡湖东方之门酒店")) {
			System.out.println(hotel1[0]+"地址为："+hotel1[1]);
			if (room.equals("豪华双床房")) {
				System.out.println("门市价："+hotel1[3]+"元 会员价："+hotel1[4]+"元 代金券："+hotel01[5]+"元");
			}
		}
		if (name.equals("格林豪泰苏州漕湖工业园智选酒店")) {
			System.out.println(hotel2[0]+"地址为："+hotel2[1]);
			if (room.equals("高级大床房")) {
				System.out.println("门市价："+hotel2[3]+"元 会员价："+hotel2[4]+"元 代金券："+hotel01[5]+"元");
			}
		}
	}

}
