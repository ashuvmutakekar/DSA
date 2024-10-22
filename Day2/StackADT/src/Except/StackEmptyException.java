package Except;

public class StackEmptyException extends Exception{
String str;
public StackEmptyException(String str) {
	this.str=str;
}
}
