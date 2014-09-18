package com.nfl.test;

import org.testng.annotations.Test;

import com.espn.test.ObjRepoAndFunc;
import com.espn.test.ScriptBase;

public class TestNFL extends ScriptBase {
	
	ObjRepoAndFunc obj = new ObjRepoAndFunc(driver);
	
	@Test
	public void mainTest(){
		obj.mouseHoverNFL();
		obj.clickScores();
		
	}

}
