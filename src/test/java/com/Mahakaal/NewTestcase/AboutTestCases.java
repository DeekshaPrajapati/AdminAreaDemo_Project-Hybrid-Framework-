package com.Mahakaal.NewTestcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Mahakaal.pages.AboutPage;
//import com.Mahakaal.pages.DonationMoneyOnlinePage;
import com.Mahakaal.pages.HomePage;
import com.Mahakaal.utility.PropertyReader;

import javabase.JavaBase;

public class AboutTestCases extends JavaBase
{
	
	HomePage home = PageFactory.initElements(driver,HomePage.class);
	AboutPage About =PageFactory.initElements(driver,AboutPage.class);
@Test	
public void AboutMenuBar() throws InterruptedException {
		
		home.click_AboutLink();
		About.click_History();
		home.click_AboutLink();
		About.click_Temple();
		home.click_AboutLink();
		About.click_AartiVideo();
		home.click_AboutLink();
		About.click_TempleTrust();
		home.click_AboutLink();
		About.click_PurohitPujari();
		home.click_AboutLink();
		About.click_Contact();
		home.click_AboutLink();
		About.click_Suggestions();
		
		}
	}