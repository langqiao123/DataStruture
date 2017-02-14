package org.langqiao.linear.intf;

public interface List {

	//获取线性表的大小
	public int getSize();
	//如果线性表为空返回true，反之则返回false
	public boolean isEmpty();
	//判断线性表中是否包含指定元素
	public boolean contains(Object o);
	//判断知指定元素在线性表中的位置
	public int indexOf(Object o);
	//指定位置插入指定元素
	public void insert(int i,Object e)throws ArrayIndexOutOfBoundsException;
	//将元素e插入到obj之前
	public boolean insertBefore(Object obj, Object e);
	//将元素e插入到obj之后
	public boolean insertAfter(Object obj, Object e);
	//删除线性表中位置为i的元素，并返回之
	public Object remove(int i);
	//删除线性表中第一个与e相同的元素
	public boolean remove(Object e);
	//用e替换线性表中位置为i的元素，并返回原数据
	public Object replace(int i,Object e);
	//获取线性表中位置为i的元素
	public Object get(int i);
}
