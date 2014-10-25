package de.com.rost.simplegame.interfaces;

public interface GameLifecycle {
	
	void start();
	void stop();
	/*
	 * A default interface method is new to java 8 providing 
	 * pre-implemented program logic
	 */
	default void pause(){}

}
