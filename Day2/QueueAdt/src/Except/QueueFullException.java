package Except;

public class QueueFullException extends Exception{
String str;
public QueueFullException(String str) {
	this.str=str;
}
}
