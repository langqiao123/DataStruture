package org.langqiao.linear.intf;

import java.util.Iterator;

import org.langqiao.exception.InvalidNodeException;
import org.langqiao.exception.OutOfBoundaryException;

/**
 * 连接表接口
 * @author YMY
 *
 */
public interface LinkedList {

	//获取线性表的大小
	public int getSize();
	//如果线性表为空返回true，反之则返回false
	public boolean isEmpty();
	//返回第一个节点
	public Node first() throws OutOfBoundaryException;
	//返回最后一个节点
	public Node last() throws OutOfBoundaryException;
	//获取指定节点之后的节点
	public Node getNext(Node p) throws InvalidNodeException,OutOfBoundaryException;
	//获取指定节点之前的节点
	public Node getPre(Node p) throws InvalidNodeException,OutOfBoundaryException;
	//将e作为第一个元素插入连接表，并返回e所在的节点
	public Node insertFirst(Object e);
	//将e作为最后一个元素插入连接表，并返回e所在的节点
	public Node insertLast(Object e);
	//将e作为插入到节点p之前，并返回e所在的节点
	public Node insertBefore(Node p,Object e) throws InvalidNodeException;
	//将e作为插入到节点p之后，并返回e所在的节点
	public Node insertAfter(Node p,Object e) throws InvalidNodeException;
	//删除指定位置的元素，并返回之
	public Node remove(Node p) throws InvalidNodeException;
	//删除首元素，并返回之
	public Node removeFirst() throws InvalidNodeException;
	//删除尾元素，并返回之
	public Node removeLast() throws InvalidNodeException;
	//用e替换链接表中指定位置的元素，并返回被替换的元素
	public Node replace(Node p,Object e);
	//元素迭代器
	public Iterator elements();
}
