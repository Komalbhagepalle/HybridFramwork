package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class PIMPage extends BaseClass {

	String employeeid;

	@FindBy(id = "btnAdd")
	WebElement addUser;

	@FindBy(id = "firstName")
	WebElement fName;

	@FindBy(id = "middleName")
	WebElement mName;

	@FindBy(id = "lastName")
	WebElement lName;

	@FindBy(id = "employeeId")
	WebElement employeeId;

	@FindBy(id = "btnSave")
	WebElement SaveOrEditButton;

	@FindBy(id = "empsearch_id")
	WebElement searchEmp;

	@FindBy(id = "searchBtn")
	WebElement searchButton;

	@FindBy(xpath = "//table[@id='resultTable']//td[1]")
	WebElement checkBox;

	@FindBy(id = "btnDelete")
	WebElement delete;

	@FindBy(xpath = "//p[text()='Delete records?']")
	WebElement deleteRecords;

	@FindBy(id = "dialogDeleteBtn")
	WebElement confirmDelete;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public void addNewUser(String fname, String mname, String lname) {
		addUser.click();
		fName.sendKeys(fname);
		mName.sendKeys(mname);
		lName.sendKeys(lname);
		employeeid = employeeId.getAttribute("value");
		SaveOrEditButton.click();
	}

	public String searchUser() {
		new HomePage().pimPageLink();
		searchEmp.sendKeys(employeeid);
		searchButton.click();
		checkBox.click();
		delete.click();
		String messsage = deleteRecords.getText();
		confirmDelete.click();
		return messsage;
	}

}
