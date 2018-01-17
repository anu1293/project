package CoreJava;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Linked HashMap implementation
 */
 
public class LHMapImpl  {
private Node[] array;
private int size=20;
private Node lastAddedNode=null;
private Node firstAddedNode=null;
private Node currentNode=firstAddedNode;
public LHMapImpl()
{
array=new Node[size];	
}

public Integer add(int key,int value)
{	
	int pos=key%size;	
	Node node=new Node(key,value);
	if(lastAddedNode==null)				// condition to check is element being added is first element
	{
		array[pos]=node;
		lastAddedNode=node;
		firstAddedNode=node;
		currentNode=firstAddedNode;
	}
	else if(array[pos]==null)		// if not first element then check if index element is hashed is free, if free then put element there
	{
		array[pos]=node;
		node.before=lastAddedNode; // update 'before' attribite of node with 'lastadded' node and vice versa to keep track of insertion order of nodes
		lastAddedNode.after=node;   
		lastAddedNode=node;   // update 'lastaddednode' with newly added node
	}
	else
	{	   // if index is not free
		Node temp=array[pos];   
		while(temp.next!=null) // traverse the list at that index till the end and add the node in the last and update 'before' attribite of 
			temp=temp.next;    // of newly added node and update lastaddednode with new node
		temp.next=node;
		temp=null;
		node.before=lastAddedNode;
		lastAddedNode.after=node;
		lastAddedNode=node;
		
	}
		
return key;	
}

public boolean delete(int key)
{
	int pos=key%size;
	Node temp=array[pos];
	if(temp==null)   // if no such node with the given key  is present
		return false;
	else if(temp.key==key) // if node is present as first element of list at that index, update  'before'
	{						// and 'after' attributes accordingly, update 'lastaddednode' and 'firstaddednode' and delete that node
		Node ttemp=temp.before;
		if(ttemp!=null){
		ttemp.after=temp.after;
		temp.after.before=ttemp;}
		array[pos]=temp.next;
		if(temp==lastAddedNode)
			lastAddedNode=temp.before;
		if(temp==firstAddedNode)
			{firstAddedNode=null;
			
			}
		temp=null;
		
	}
	else{//if node is present somewhere within the linkedlist, traverse till the node before the node to be deleted,
	while(temp.next!=null && temp.next.key!=key) // update 'before' and 'after' attributes accordingly and 'lastaddednode' as well
		temp=temp.next;						// now delete the node 
		if(temp.next==null)
			return false;
		Node ttemp=temp.next;
		if(ttemp==lastAddedNode)
			lastAddedNode=ttemp.before;
		
		temp.next=ttemp.next;
		ttemp.before.after=ttemp.after;
		ttemp.after.before=ttemp.before;
		
		ttemp=null;
	
	}
return true;	
}

public Integer get(int key)
{					// go to hashed index of the node using the key, traverse the linkedlist until the node with same key is 
int pos=key%size;	// found, return the value at that node
Node temp=array[pos];
if(temp==null)
	return null;
else{
	
	while(temp!=null && temp.key!=key)
	{
		temp=temp.next;
	}
	
	if(temp==null)
		return null;
	return temp.value;
}



}




	
}
