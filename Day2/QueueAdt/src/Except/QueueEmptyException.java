package Except;

public class QueueEmptyException extends Exception{
String str;
public QueueEmptyException(String str) {
	this.str=str;
}
}
