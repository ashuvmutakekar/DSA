package Except;

public class StackFullException extends Exception{
String str;
public StackFullException(String str) {
	this.str=str;
}
}
