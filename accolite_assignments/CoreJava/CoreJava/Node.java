package CoreJava;

public class Node {
int key,value;
Node next,before,after;

public Node(int key,int value)
{
this.key=key;
this.value=value;
next=before=after=null;
}
}
