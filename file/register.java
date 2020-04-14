package com.wj.demo;

/**
 * 
 * @author wj
 * @date 2020年4月14日
 */



public class register {
	public static void main(String[] args) {
		reg();
	}
	public static void reg() {
		int i = 1;//i表示挂号次数
		if (i < 4) {
			double time = 12.00;//预约挂号时间
			double time1 = 12.00;//已经预约挂号时间
			if (time == time1) {
				System.out.println("这个时间段已经有人挂号，您可以选择其他时间段！");
				
			} else {
				System.out.println("预约挂号成功！");
				
			}
		}
		if (i >= 4) {
			System.out.println("您不能再进行挂号，您已经进入黑名单");
		}
	}
}
