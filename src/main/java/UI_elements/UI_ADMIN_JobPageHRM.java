package UI_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.testBase_OrangeHRM;

public class UI_ADMIN_JobPageHRM extends testBase_OrangeHRM {

	@FindBy(xpath="//span[text()='Job ']")
	WebElement JobButton_DropDown;

	@FindBy(xpath = "//a[text()='Job Titles']")
	WebElement jobTitles_dropDownList;

	@FindBy(xpath = "//h6[text()='Job Titles']")
	WebElement jobTitles_Text;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]")
	WebElement checkbox_JobTitles;

	@FindBy(xpath = "//button[@type='button'][text()=' Delete Selected ']")
	WebElement deleteSelectedButton_JobTitles;

	@FindBy(xpath="//button[@type='button'][text()=' Add ']")
	WebElement AddButton_JobTitles;

	@FindBy(xpath = "//h6[text()='Add Job Title']")
	WebElement addJobTitlesPage_Text;

	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span'])[1]")
	WebElement recordsFoundText_JobTitles;

	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement jobTitle_AddJobTitleSection;

	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'][@placeholder='Type description here']")
	WebElement jobDescription_AddJobTitleSection;

	@FindBy(xpath="//input[@type='file']")
	WebElement jobspecificationdoc_AddJobTitleSection;

	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'][@placeholder='Add note']")
	WebElement addNote_AddJobTitleSection;

	@FindBy(xpath = "//button[@type='button'][text()=' Cancel ']")
	WebElement cancelButton_AddJobTitleSection;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton_AddJobTitleSection;

	@FindBy(xpath="//div[text()='SDET']/../../div/div/div/label/span/i")
	WebElement tickButtonSDET;

	@FindBy(xpath = "//button[text()=' Yes, Delete ']")
	WebElement yesDeleteButton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']/i")
	WebElement deleteJobTitleButton;

	@FindBy(xpath = "//div[@id='oxd-toaster_1']")
	WebElement toastMessage;

	@FindBy(xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]/i")
	WebElement firstRecord_Delete;

	@FindBy(xpath = "//a[text()='Pay Grades']")
	WebElement payGrades_dropDownList;

	@FindBy(xpath = "//h6[text()='Pay Grades']")
	WebElement payGradesText_PayGradesSection;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]")
	WebElement checkbox_Name_PayGradesSection;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary'][text()=' Add ']")
	WebElement addButton_PayGradesSection;

	@FindBy(xpath = "//h6[text()='Add Pay Grade']")
	WebElement addPayGradeText;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement name_AddPayGradeSection;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton_AddPayGradeSection;

	@FindBy(xpath = "//button[@type='button'][text()=' Cancel ']")
	WebElement cancelButton_AddPayGradeSection;

	@FindBy(xpath = "//h6[text()='Edit Pay Grade']")
	WebElement editPayGradetext;

	@FindBy(xpath = "//h6[text()='Currencies']/../button")
	WebElement addCurrenciesButton;

	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	WebElement selectCurrency_DropDown;

	@FindBy(xpath = "//div[@role='option']/span[text()='CAD - Canadian Dollar']")
	WebElement CADCurrency_DropDownList;

	@FindBy(xpath = "//label[text()='Minimum Salary']/..//../div[2]/input")
	WebElement minimumSalary_currencysection;

	@FindBy(xpath = "//label[text()='Maximum Salary']/..//../div[2]/input")
	WebElement maximumSalary_currencySection;

	@FindBy(xpath = "(//button[@type='button'][text()=' Cancel '])[2]")
	WebElement cancelButton_CurrencySection;

	@FindBy(xpath = "(//button[text()=' Save '])[2]")
	WebElement submitButton_AddCurrency;

	@FindBy(xpath = "//div[text()='Sahil']/../../div/div/div/label/span/i")
	WebElement tickButton_sahil;

	@FindBy(xpath = "//a[text()='Employment Status']")
	WebElement employmentStatus_dropDownList;

	@FindBy(xpath="//h6[text()='Employment Status']")
	WebElement employmentStatusText;

	@FindBy(xpath = "//h6[text()='Add Employment Status']")
	WebElement addEmploymentStatus_Text;
	
	@FindBy(xpath = "//div[text()='Sahil']")
	WebElement sahilText;
	
	@FindBy(xpath = "//a[text()='Work Shifts']")
	WebElement workShifts_dropDownList;
	
	@FindBy(xpath = "//h6[text()='Work Shifts']")
	WebElement workShifts_text;


	public UI_ADMIN_JobPageHRM() {
		PageFactory.initElements(driver, this);
	}

	public WebElement JobButton_DropDown() {
		return JobButton_DropDown;	
	}
	
	public WebElement workShifts_text() {
		return workShifts_text;	
	}
	
	public WebElement workShifts_dropDownList() {
		return workShifts_dropDownList;	
	}
	
	public WebElement sahilText() {
		return sahilText;	
	}

	public WebElement addEmploymentStatus_Text() {
		return addEmploymentStatus_Text;	
	}

	public WebElement employmentStatusText() {
		return employmentStatusText;	
	}

	public WebElement employmentStatus_dropDownList() {
		return employmentStatus_dropDownList;	
	}

	public WebElement tickButton_sahil() {
		return tickButton_sahil;	
	}

	public WebElement submitButton_AddCurrency() {
		return submitButton_AddCurrency;	
	}

	public WebElement cancelButton_CurrencySection() {
		return cancelButton_CurrencySection;	
	}

	public WebElement maximumSalary_currencySection() {
		return maximumSalary_currencySection;	
	}
	public WebElement minimumSalary_currencysection() {
		return minimumSalary_currencysection;	
	}

	public WebElement CADCurrency_DropDownList() {
		return CADCurrency_DropDownList;	
	}

	public WebElement selectCurrency_DropDown() {
		return selectCurrency_DropDown;	
	}

	public WebElement addCurrenciesButton() {
		return addCurrenciesButton;	
	}

	public WebElement editPayGradetext() {
		return editPayGradetext;	
	}


	public WebElement cancelButton_AddPayGradeSection() {
		return cancelButton_AddPayGradeSection;	
	}

	public WebElement submitButton_AddPayGradeSection() {
		return submitButton_AddPayGradeSection;	
	}

	public WebElement name_AddPayGradeSection() {
		return name_AddPayGradeSection;	
	}

	public WebElement addPayGradeText() {
		return addPayGradeText;	
	}
	public WebElement addButton_PayGradesSection() {
		return addButton_PayGradesSection;	
	}

	public WebElement checkbox_Name_PayGradesSection() {
		return checkbox_Name_PayGradesSection;	
	}

	public WebElement payGradesText_PayGradesSection() {
		return payGradesText_PayGradesSection;	
	}

	public WebElement payGrades_dropDownList() {
		return payGrades_dropDownList;	
	}

	public WebElement firstRecord_Delete() {
		return firstRecord_Delete;	
	}


	public WebElement toastMessage() {
		return toastMessage;	
	}

	public WebElement deleteJobTitleButton() {
		return deleteJobTitleButton;	
	}
	public WebElement yesDeleteButton() {
		return yesDeleteButton;	
	}

	public WebElement tickButtonSDET() {
		return tickButtonSDET;	
	}

	public WebElement submitButton_AddJobTitleSection() {
		return submitButton_AddJobTitleSection;	
	}

	public WebElement cancelButton_AddJobTitleSection() {
		return cancelButton_AddJobTitleSection;	
	}

	public WebElement addNote_AddJobTitleSection() {
		return addNote_AddJobTitleSection;	
	}

	public WebElement jobspecificationdoc_AddJobTitleSection() {
		return jobspecificationdoc_AddJobTitleSection;	
	}

	public WebElement jobDescription_AddJobTitleSection() {
		return jobDescription_AddJobTitleSection;	
	}

	public WebElement jobTitle_AddJobTitleSection() {
		return jobTitle_AddJobTitleSection;	
	}

	public WebElement recordsFoundText_JobTitles() {
		return recordsFoundText_JobTitles;	
	}

	public WebElement addJobTitlesPage_Text() {
		return addJobTitlesPage_Text;	
	}

	public WebElement AddButton_JobTitles() {
		return AddButton_JobTitles;	
	}

	public WebElement jobTitles_dropDownList() {
		return jobTitles_dropDownList;
	}

	public WebElement jobTitles_Text() {
		return jobTitles_Text;
	}

	public WebElement checkbox_JobTitles() {
		return checkbox_JobTitles;
	}

	public WebElement deleteSelectedButton_JobTitles() {
		return deleteSelectedButton_JobTitles;
	}

}
