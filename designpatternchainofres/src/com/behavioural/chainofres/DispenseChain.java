package com.behavioural.chainofres;

public interface DispenseChain {
	
void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);
}
