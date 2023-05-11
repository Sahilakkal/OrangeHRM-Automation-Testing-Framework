package Test_pkg;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Actions.Actions_ADMIN_Job;
import Test_Base.testBase_OrangeHRM;
import UI_elements.UI_ADMIN_JobPageHRM;

public class Test_ADMIN_JobPageHRM extends testBase_OrangeHRM {

	Actions_ADMIN_Job actions_Job;
	UI_ADMIN_JobPageHRM ui_Job;

	@BeforeClass
	public void navigateToJobPage() throws Exception {
		Test_ADMIN_userManagementPageHRM test_Admin=new Test_ADMIN_userManagementPageHRM();
		test_Admin.navigateToAdminModule();		
		actions_Job=new Actions_ADMIN_Job();
		ui_Job=new UI_ADMIN_JobPageHRM();		
		actions_Job.a_ClickJobTitles();
	}
	
	@Test(priority=0)
	public void checkVisiblity() {
		boolean actual=ui_Job.JobButton_DropDown().isDisplayed();
		assertTrue(actual);
	}

	@Test(priority=0)
	public void Validate_JobTitlePageLoadsSuccessfully() {
		boolean actual=ui_Job.jobTitles_Text().isDisplayed();
		assertTrue(actual);
	}

	@Test(priority=1)
	public void Validate_UserableToSelectAllRecords() throws InterruptedException {
		actions_Job.a_ClickJobTitlesCheckbox();
		boolean actual=ui_Job.deleteSelectedButton_JobTitles().isDisplayed();
		assertTrue(actual);
	}

	@Test(priority=2,dependsOnMethods ="Validate_UserableToSelectAllRecords")
	public void Validate_UserableToDeSelectAllRecords() throws InterruptedException {
		actions_Job.a_ClickJobTitlesCheckbox();
		String actual=ui_Job.recordsFoundText_JobTitles().getText();
		assertTrue(actual.contains("Found"));
	}

	@Test(priority=3)
	public void Validate_AddButtonJobTitles_Functionality() {
		actions_Job.a_ClickAddButtonJobTitles();
		boolean actual=ui_Job.addJobTitlesPage_Text().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=4,dependsOnMethods = "Validate_AddButtonJobTitles_Functionality")
	public void Validate_CancelButtonAddJobTitle_functionality() {
		actions_Job.a_CancelButtonAddJobTitle();
		boolean actual=ui_Job.jobTitles_Text().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=5)
	public void Validate_UserAbleToAddJobTitle() throws InterruptedException {
		actions_Job.a_ClickAddButtonJobTitles();
		actions_Job.a_addjobTitle();
		
	}
	
	@Test(priority=6)
	public void deleteJobTitle() throws InterruptedException {
		actions_Job.a_deleteJobTitle();
		String actual=ui_Job.toastMessage().getText();
		assertFalse(actual.contains("Failed"));
		
	}
	
	@Test(priority=7)
	public void Validate_DeleteFunctionalityWithTrashIcon() {
		actions_Job.a_deletewithTrashIcon();
		String actual=ui_Job.toastMessage().getText();
		assertFalse(actual.contains("Failed"));
	}
	
	@Test(priority=8)
	public void Validate_PayGradesPageLoadsSuccessfully() {
		actions_Job.a_clickPayGradesButton();
		boolean actual=ui_Job.payGradesText_PayGradesSection().isDisplayed();
		assertTrue(actual);
	}
	
//	@Test(priority=9)
//	public void Validate_nameCheckbox_Functionality() {
//		actions_Job.a_clickNameCheckbox_PayGradesSection();
//		boolean actual=ui_Job.deleteSelectedButton_JobTitles().isDisplayed();
//		assertTrue(actual);
//	}
	
//	@Test(priority=10)
//	public void Validate_deselectnameChechBox() {
//		actions_Job.a_clickNameCheckbox_PayGradesSection();
//		String actual=ui_Job.recordsFoundText_JobTitles().getText();
//		assertTrue(actual.contains("Found"));
//	}
	
	@Test(priority=11)
	public void Validate_AddButtonFunctionality_PayGrade() {
		actions_Job.a_clickAddButton_PayGradeSection();
		boolean actual=ui_Job.addPayGradeText().isDisplayed();
		assertTrue(actual);
		
	}
	
	@Test(priority=12)
	public void Validate_CancelButtonFunctionality_AddPayGradeSection() {
		actions_Job.a_ClickCancelButtonaddPayGrade();
		boolean actual=ui_Job.payGradesText_PayGradesSection().isDisplayed();
		assertTrue(actual);
	}
	
	
	@Test(priority=13 )
	public void a_Validate_addPayGrade_Functionality() {
		actions_Job.a_addPayGrade();
		boolean actual=ui_Job.editPayGradetext().isDisplayed();
		assertTrue(actual);
	}
	
//	@Test(priority=14)
//	public void a_Validate_CancelButtonAddCurrency_Functionality() throws InterruptedException {
//		actions_Job.a_ClickCancelButtonaddCurrency();
//		boolean actual=ui_Job.cancelButton_CurrencySection().isDisplayed();
//		assertFalse(actual);
//	}
	
	@Test(priority=15)
	public void a_Validate_AddCurrency_Functionality() {
		actions_Job.a_AddCurrency();
		boolean actual=ui_Job.recordsFoundText_JobTitles().isDisplayed();
		assertTrue(actual);
		
	}
	
	@Test (priority=16)
	public void vaidate_DeleteCurrencyRecord_Functionality() throws InterruptedException {
		actions_Job.a_deleteCurrency();
		String actual=ui_Job.toastMessage().getText();
		assertFalse(actual.contains("Failed"));
	}
	
	@Test(priority=17)
	public void Validate_employmentStatusPageLoadSuccessfully() {
		actions_Job.a_ClickEmploymentStatus();
		boolean actual=ui_Job.employmentStatusText().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=18)
	public void Validate_AddButtoonES_Functionality() {
		actions_Job.a_ClickAdd_ES();
		boolean actual=ui_Job.addEmploymentStatus_Text().isDisplayed();
		assertTrue(actual);
	}
	
	
	@Test(priority=19)
	public void Validate_CancelButton_ES_Functionality() {
		
		actions_Job.a_CancelButtonClickES();
		boolean actual=ui_Job.employmentStatusText().isDisplayed();
		assertTrue(actual);
	}
	
	@Test(priority=20)
	public void Validate_AdminAbleToAddEmpStatus() throws InterruptedException {
		actions_Job.a_addEmpStatus();
		Thread.sleep(6000);
		boolean actual=ui_Job.sahilText().isDisplayed();
		assertTrue(actual);
		
	}
	
	@Test(priority=21)
	public void Validate_SelectESCheckbox_Functionality() {
		actions_Job.a_ClickESChechkbox();
		boolean actual=ui_Job.deleteSelectedButton_JobTitles().isDisplayed();
		assertTrue(actual);
		
		
	}
	
	
	@Test(priority=22)
	public void Validate_DeselectESCheckbox_Functionality() {
		actions_Job.a_ClickESChechkbox();
		String actual=ui_Job.recordsFoundText_JobTitles().getText();
		assertTrue(actual.contains("Found"));
		
		
	}
	
	@Test(priority=23)
	public void Validate_DeleteEmpStatus_Functionality_WithCheckbox() throws InterruptedException {
		actions_Job.a_DeleteES_WithCheckbox();
		String actual=ui_Job.toastMessage().getText();
		assertFalse(actual.contains("Failed"));
	}
	
//	@Test(priority=24)
//	public void Validate_WorkShiftsPageLoadsSuccessfully() {
//		actions_Job.a_ClickWorkShiftButton();
//		boolean actual=ui_Job.workShifts_text().isDisplayed();
//		assertTrue(actual);
//		
//	}
	
//	@Test(priority=25)
//	public void  
	@AfterClass
	public void shut() throws InterruptedException {
		terminate();
	}


}
