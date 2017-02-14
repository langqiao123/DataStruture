package org.langqiao.stackqueue.app;

/**
 * 迷宫单元类
 * @author YMY
 *
 */
public class Cell {
	private int x = 0;	//	单元所在的行
	private int y = 0;	//单元所在的列
	private char c = '\u0000';	//'1'是墙,'0'是路
	private boolean visited = false;	//是否访问过
	
	public Cell(int x,int y,char c,boolean visited){
		this.x = x;
		this.y = y;
		this.c = c;
		this.visited = visited;
	}
}
