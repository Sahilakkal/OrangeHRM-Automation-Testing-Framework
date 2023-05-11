package Actions;

import org.openqa.selenium.interactions.Actions;

import UI_elements.UI_ADMIN_JobPageHRM;

public class Actions_ADMIN_Job extends UI_ADMIN_JobPageHRM {

	UI_ADMIN_JobPageHRM ui_Job=new UI_ADMIN_JobPageHRM();
	
	Actions action= new Actions(driver);
	
	public void a_ClickJobTitles() {
		ui_Job.JobButton_DropDown().click();
		ui_Job.jobTitles_dropDownList().click();
	}
	
	public void a_ClickJobTitlesCheckbox() throws InterruptedException {
		ui_Job.checkbox_JobTitles().click();
		Thread.sleep(2000);
		
	}
	
	public void a_ClickAddButtonJobTitles() {
		ui_Job.AddButton_JobTitles().click();
	}
	
	public void a_CancelButtonAddJobTitle() {
		ui_Job.jobTitle_AddJobTitleSection().sendKeys("SDET");
		ui_Job.jobDescription_AddJobTitleSection().sendKeys("Automate the test cases");
		ui_Job.jobspecificationdoc_AddJobTitleSection().sendKeys("C:\\Users\\sakkal\\Desktop\\admin.jfif");
		ui_Job.addNote_AddJobTitleSection().sendKeys("Must have knowledge of Selenium/Cypress");
		ui_Job.cancelButton_AddJobTitleSection().click();
	}
	
	public void a_addjobTitle() throws InterruptedException {
		ui_Job.jobTitle_AddJobTitleSection().sendKeys("SDET");
		ui_Job.jobDescription_AddJobTitleSection().sendKeys("Automate the test cases");
		ui_Job.jobspecificationdoc_AddJobTitleSection().sendKeys("C:\\Users\\sakkal\\Desktop\\admin.jfif");
		ui_Job.addNote_AddJobTitleSection().sendKeys("Must have knowledge of Selenium/Cypress");
		Thread.sleep(3000);
		ui_Job.submitButton_AddJobTitleSection().click();
	}
	
	public void a_deleteJobTitle() throws InterruptedException {
		ui_Job.tickButtonSDET().click();
		Thread.sleep(1000);
		action.moveToElement(ui_Job.deleteJobTitleButton()).click().perform();
		Thread.sleep(1000);

		ui_Job.yesDeleteButton().click();
	}
	
	public void a_deletewithTrashIcon() {
		action.moveToElement(ui_Job.firstRecord_Delete()).click().perform();
		ui_Job.yesDeleteButton().click();
	}
	
	public void a_clickPayGradesButton() {
	    ui_Job.JobButton_DropDown().click();
	    ui_Job.payGrades_dropDownList().click();
	}
	
	public void a_clickNameCheckbox_PayGradesSection() {
		ui_Job.checkbox_Name_PayGradesSection().click();
	}
	
	public void a_clickAddButton_PayGradeSection() {
		ui_Job.addButton_PayGradesSection().click();
	}
	
	public void a_ClickCancelButtonaddPayGrade() {
		
		ui_Job.cancelButton_AddPayGradeSection().click();
	}
	
	public void a_addPayGrade() {
		ui_Job.addButton_PayGradesSection().click();
		ui_Job.name_AddPayGradeSection().sendKeys("Sahil");
		ui_Job.submitButton_AddPayGradeSection().click();	
	}
	
	public void a_ClickCancelButtonaddCurrency() throws InterruptedException {
		ui_Job.addCurrenciesButton().click();
		ui_Job.selectCurrency_DropDown().click();
		ui_Job.CADCurrency_DropDownList().click();
		ui_Job.minimumSalary_currencysection().sendKeys("10000");
		ui_Job.maximumSalary_currencySection().sendKeys("20000");
		Thread.sleep(2000);
		ui_Job.cancelButton_CurrencySection().click();
	}
	
	public void a_AddCurrency() {
		ui_Job.addCurrenciesButton().click();
		ui_Job.selectCurrency_DropDown().click();
		ui_Job.CADCurrency_DropDownList().click();
		ui_Job.minimumSalary_currencysection().sendKeys("10000");
		ui_Job.maximumSalary_currencySection().sendKeys("20000");
		ui_Job.submitButton_AddCurrency().click();
		
	}
	
	public void a_deleteCurrency() throws InterruptedException {
		a_clickPayGradesButton();
		ui_Job.tickButton_sahil().click();
		action.moveToElement(ui_Job.deleteJobTitleButton()).click().perform();
		Thread.sleep(1000);

		ui_Job.yesDeleteButton().click();
	}
	
	public void a_ClickEmploymentStatus() {
		ui_Job.JobButton_DropDown().click();
		ui_Job.employmentStatus_dropDownList().click();
	}
	
	public void a_ClickAdd_ES() {
		ui_Job.addButton_PayGradesSection().click();
	}
	
	public void a_CancelButtonClickES() {
		ui_Job.name_AddPayGradeSection().sendKeys("Working Full Time");
		ui_Job.cancelButton_AddPayGradeSection().click();
		
		
	}
	
	public void a_addEmpStatus() {
		a_ClickAdd_ES();
		ui_Job.name_AddPayGradeSection().sendKeys("Sahil");
		ui_Job.submitButton_AddPayGradeSection().click();

		
	}
	
	public void a_DeleteES_WithCheckbox() throws InterruptedException {
		ui_Job.tickButton_sahil().click();
		action.moveToElement(ui_Job.deleteJobTitleButton()).click().perform();
		Thread.sleep(1000);

		ui_Job.yesDeleteButton().click();
	}
	
	public void a_ClickESChechkbox() {
		a_clickNameCheckbox_PayGradesSection();
		
	}
	
	public void a_ClickWorkShiftButton() {
		ui_Job.workShifts_dropDownList().click();
		
	}

}
