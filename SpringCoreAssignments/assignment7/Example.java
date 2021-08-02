package com.assignment7;

import org.springframework.beans.factory.annotation.Value;

public class Example 
{
	@Value("#{34+21}")
	private int a;
	@Value("#{99+99+98}")
	private int b;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Example [a=" + a + ", b=" + b + "]";
	}

}
