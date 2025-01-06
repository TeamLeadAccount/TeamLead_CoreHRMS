package com.Hrms.pages;

import org.openqa.selenium.By;

import com.Hrms.utils.CommonUtils;

public class PIMPage{
	// Web locators

	private final static By by_pim = By.xpath("//li[@id='pim']");
	private final static By by_addEmp = By.xpath("//*[@id='pim']/ul/li[2]/a");
	private final static By by_firstName = By.xpath("//input[@id='txtEmpFirstName']");
	private final static By by_lastName = By.xpath("//input[@id='txtEmpLastName']");
	private final static By by_iframe = By.xpath("//iframe[@id='rightMenu']");
	private final static By by_save = By.xpath("//input[@id='btnEdit']");
	private final static By by_back = By.xpath("//input[@class='backbutton']");
	private final static By by_empName = By.xpath("//a[contains(text(),'ksai')]");
	private final static By by_search_by = By.xpath("//select[@id='loc_code']");
	private final static By by_search_for = By.xpath("//input[@id='loc_name']");
	private final static By by_search = By.xpath("//input[@class='plainbtn']"); 
	private final static By by_edit = By.xpath("//input[@name='EditMain']");
	private final static By by_mstatus = By.xpath("//select[@id='cmbMarital']");
	private final static By by_save_edit = By.xpath("//input[@id='btnEditPers']");
	private final static By by_checkBox_delete = By.xpath("//input[@value='0002']");
	private final static By by_delete = By.xpath("//input[@value='Delete']");
	private final static By by_delete_message = By.xpath("//span[@class='failure']");
	
	// Getter/Setter Helping functions
	public static void clickOnElement() throws Exception {
		CommonUtils.clickElement(getPim());
	}
	
	public static By getPim() throws Exception {
		return by_pim;
	}
	
	public static By getAddEmp() throws Exception {
		return by_addEmp;
	}
	
	public static By getFirstName() throws Exception {
		return by_firstName;
	}
	
	public static By getLastName() throws Exception {
		return by_lastName;
	}
	
	public static By getFrame() throws Exception {
		return by_iframe;
	}
	
	public static By getSave() throws Exception {
		return by_save;
	}
	
	public static By getBackButton() throws Exception {
		return by_back;
	}
	
	public static By getEmpName() throws Exception {
		return by_empName;
	}
	
	public static By getSearchBy() throws Exception {
		return by_search_by;
	}
	
	public static By getSearchFor() throws Exception {
		return by_search_for;
	}
	
	public static By getSearch() throws Exception {
		return by_search;
	}
	
	public static By getEdit() throws Exception {
		return by_edit;
	}
	public static By getmstatus() throws Exception {
		return by_mstatus;
	}
	
	public static By getEditSave() throws Exception {
		return by_save_edit;
	}
	
	public static By getCheckbox_delete() throws Exception {
		return by_checkBox_delete;
	}
	
	public static By getDelete() throws Exception {
		return by_delete;
	}
	
	
	public static By getDeleteMessage() throws Exception {
		return by_delete_message;
	}
}
