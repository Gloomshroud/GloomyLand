package com.gloomshroud.gloomyland;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame {
	
	public static final String version = " (v0.1)";
	public static final String gameName = "Gloomy Land" + version;
	public static final int menu = 0;
	public static final int play = 1;
	
	
	public Game(String gameName) {
		super(gameName);
		this.addState(new Menu(menu));
		this.addState(new Play());
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(menu);
	}
	
	public static void main(String[] args) {
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(new Game(gameName));
			appgc.setDisplayMode(640, 480, false);
			appgc.start();
		} catch (SlickException e) {
			
			e.printStackTrace();
		}
	}

	

}
