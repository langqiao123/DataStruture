package org.langqiao.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class combination {
	public static final char[] CHARS = {'1','2','2','3','4','5'};
	public static TreeSet<Integer> treeSet = new TreeSet<>();
	
	public static void main(String[] args) {
		List<Character> charsList = new ArrayList<>();
		for(int i=0;i<CHARS.length;i++){
			charsList.add(CHARS[i]);
		}
		combination_data(charsList,new StringBuffer());
		System.out.println("treeset的大小为："+treeSet.size());
		for(int r : treeSet){
			System.out.println(r);
		}
	}
	
	public static void combination_data(List<Character> chars,StringBuffer sb){
		//递归出口条件
		if(chars == null || chars.size()==0){
			return;
		}
		
		if(chars.size() == 1){
			sb.append(chars.get(0));
			treeSet.add(Integer.parseInt(sb.toString()));
			return;
		}
		for(int i=0;i<chars.size();i++){
			ArrayList<Character> newCharsList = new ArrayList<>(chars);
			newCharsList.remove(i);
			StringBuffer sb1 = new StringBuffer(sb);
			sb1.append(chars.get(i));
			combination_data(newCharsList, sb1);
		}
	}

}
