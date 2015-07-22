package me.skylertyler.skylerpgm.match;

import java.util.List;

import com.google.common.collect.Lists;

import me.skylertyler.skylerpgm.match.state.MatchState;
import me.skylertyler.skylerpgm.module.Module;

public class Match {

	public final int id;
    public final MatchState state;
    // not to sure if this works ? ;/
	private List<Class<? extends Module>> modules;

	public Match(int id) {
		this.modules = Lists.newArrayList();
		this.id = id;
		this.state = MatchState.LOADING;
	}

	public int getID() {
		return this.id;
	}

	public MatchState getState() {
		return this.state;
	}
	
	
	/** initialize the modules */
	public void init(){
	}
	
	
	public List<Class<? extends Module>> getModules(){
		return this.modules;
	}
}
