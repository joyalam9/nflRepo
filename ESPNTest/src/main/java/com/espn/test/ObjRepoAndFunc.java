package com.espn.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ObjRepoAndFunc {
	
	WebDriver driver;
	
	//constructor which is used for holding the driver argument.
	public ObjRepoAndFunc(WebDriver driver){
		
		//"this" keyword is used to avoid the conflict between two driver variables which are the same name.
		this.driver = driver;
		
		//"PageFactory" is used for page object model.
		PageFactory.initElements(driver, this);
		
	}
	
	//element is located using "FindBy" annotation
	@FindBy (how = How.NAME, using = "&lpos=sitenavdefault&lid=sitenav_nfl")
	WebElement NFL;
	
	@FindBy (how = How.NAME, using = "&lpos=sitenavdefault&lid=nfl_scores")
	WebElement scores;
	
	//function associated corresponding element
	public void mouseHoverNFL(){
		// "Actions" interface is using in order to do "mouse hover" action
		Actions action = new Actions(driver);
		action.moveToElement(NFL).perform();
		
	} 
	
	//this method will click the "Scores" webelement.
	public void clickScores(){
		scores.click();
		//String variable for expected page title.
		String expectedPTitle = "NFL Football Scores - NFL Scoreboard - ESPN - ESPN";
		//String variable for actual page title using "getTitle()" METHOD.
		String actualPTitle = driver.getTitle();
		//it will print actual page title.
		System.out.println(actualPTitle);
		//assertion for page title.
		Assert.assertEquals(expectedPTitle, actualPTitle);
	}

}
