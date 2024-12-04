package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class TaskListPage {
	      //create customer
	@FindBy (xpath="//div[text()='Add New']")
	private WebElement addnewBtn;
	@FindBy (xpath="//div[text()='+ New Customer']")
	private WebElement newcustBtn;
	@FindBy (id="customerLightBox_nameField")
	private WebElement custnameTbx;
	@FindBy (id="customerLightBox_descriptionField")
	private WebElement custdescTbx;
	@FindBy (xpath="//button[contains(text(),'Select an active customer')]")
	private WebElement custDropdown;
	@FindBy (linkText="Our Company")
	private WebElement ourcompany;
	@FindBy (xpath="//span[text()='Create Customer']")
	private WebElement cretecustBtn;
	@FindBy (xpath="//a[text()='All Customers']/../../div[@class='title ellipsis']")
	private WebElement createcustHeading;
	     //delete customer
	@FindBy (xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchTF;
	@FindBy (xpath="//span[@class='highlightToken']/../../div[@class='editButton available']")
	private WebElement setting;
	@FindBy (xpath="(//div[@class='actions'])[1]")
	private WebElement actionBtn;
	@FindBy (xpath="//div[@style='display: inline-block;']")
	private WebElement deleteBtn;
	@FindBy (id="customerPanel_deleteConfirm_submitTitle")
	private WebElement dltPermanent;
	      //create project
	@FindBy (xpath="//div[text()='+ New Project']")
	private WebElement newProBtn;
	@FindBy (id="projectPopup_projectNameField")
	private WebElement cstDropdown;
	@FindBy (linkText="Media Agency")
	private WebElement mediaAgeBtn;
	@FindBy (id="projectPopup_projectDescriptionField")
	private WebElement proDescription;
	@FindBy (xpath="//span[text()='Create Project']")
	private WebElement createProjectBtn;
	@FindBy (xpath="//a[text()='All Customers']/../../div[@class='title ellipsis']")
	private WebElement titleText ;
	       //delete project
	@FindBy (xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement textField;
	@FindBy (xpath="//span[@class='highlightToken']/../../div[3][@class='editButton available']")
	private WebElement deProSetting;
	@FindBy (xpath="(//div[@class='action'])[3]")
	private WebElement proActionBtn;
	@FindBy (xpath="(//div[text()='Delete'])[3]")
	private WebElement proDeleteBtn;
	@FindBy (id="projectPanel_deleteConfirm_submitTitle")
	private WebElement proDltPermanent;
	

	public WebElement getProDltPermanent() {
		return proDltPermanent;
	}

	public WebElement getProActionBtn() {
		return proActionBtn;
	}

	public WebElement getProDeleteBtn() {
		return proDeleteBtn;
	}

	public WebElement getTextField() {
		return textField;
	}

	public WebElement getDeProSetting() {
		return deProSetting;
	}

	public WebElement getTitleText() {
		return titleText;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getProDescription() {
		return proDescription;
	}

	public WebElement getCstDropdown() {
		return cstDropdown;
	}

	public WebElement getMediaAgeBtn() {
		return mediaAgeBtn;
	}

	public WebElement getNewProBtn() {
		return newProBtn;
	}

	public WebElement getSearchTF() {
		return searchTF;
	}

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getActionBtn() {
		return actionBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getDltPermanent() {
		return dltPermanent;
	}

	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewBtn() {
		return addnewBtn;
	}

	public WebElement getNewcustBtn() {
		return newcustBtn;
	}

	public WebElement getCustnameTbx() {
		return custnameTbx;
	}

	public WebElement getCustdescTbx() {
		return custdescTbx;
	}

	public WebElement getCustDropdown() {
		return custDropdown;
	}

	public WebElement getOurcompany() {
		return ourcompany;
	}

	public WebElement getCretecustBtn() {
		return cretecustBtn;
	}

	public WebElement getCreatecustHeading() {
		return createcustHeading;
	}
	
	
	

}
