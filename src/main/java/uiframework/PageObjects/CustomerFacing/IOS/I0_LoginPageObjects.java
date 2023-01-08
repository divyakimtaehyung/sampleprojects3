package uiframework.PageObjects.CustomerFacing.IOS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uiframework.MobileUtility.IOSUtility;

import java.io.IOException;
import java.util.List;

import static com.iexceed.uiframework.appium.PcloudyConnection.appiumDriver;

public class I0_LoginPageObjects {


	//Login page Objects
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
	WebElement loginPageTitle;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField")
	WebElement languageButton;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[18]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	List<WebElement> languageList;

	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	WebElement loginEmailID;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	WebElement loginPassword;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[11]/XCUIElementTypeOther/XCUIElementTypeButton")
	WebElement loginButton;
	@FindBy(xpath = "//*[@name='Hyperlink']")
	WebElement signUplink;

	//Signup Page Objects
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]")
	WebElement signUpTitle;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	WebElement signUpEmailId;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	WebElement signUpMobileCode;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	WebElement signUpMobileCode1;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[18]/XCUIElementTypeOther/XCUIElementTypeSearchField")
	WebElement signUPMobileCodeSearch;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[18]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	WebElement signUPMobileCodeText;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	WebElement signUpMobileNumber;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[11]/XCUIElementTypeOther/XCUIElementTypeButton")
	WebElement signUpButton;

	//OTP Page Objects
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
	WebElement otpPageTitle;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	WebElement otpField;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeButton")
	WebElement otpResendLink;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[13]/XCUIElementTypeOther/XCUIElementTypeButton")
	WebElement otpVerifyButton;

	//Change Password Screen Objects
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
	WebElement changePasswordScreen;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	WebElement oldPassword;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	WebElement newPassword;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[12]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	WebElement confirmPassword;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[13]/XCUIElementTypeOther/XCUIElementTypeButton")
	WebElement confirmPasswordButton;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[11]/XCUIElementTypeOther/XCUIElementTypeButton")
	WebElement confirmPasswordButton1;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[11]/XCUIElementTypeOther/XCUIElementTypeButton")
	WebElement confirmPasswordButton2;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeStaticText")
	WebElement oldPasswordMessage;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeStaticText")
	WebElement oldPasswordValidationMessage;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[11]/XCUIElementTypeOther/XCUIElementTypeStaticText")
	WebElement newPasswordMessage;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[13]/XCUIElementTypeOther/XCUIElementTypeStaticText")
	WebElement confirmPasswordMessage;
	@FindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[13]/XCUIElementTypeOther/XCUIElementTypeStaticText")
	WebElement confirmPasswordDistinctMessage;



	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__MiniEightDigit']")
	WebElement eightCharValidation;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__UpperCase']")
	WebElement upperCaseValidation;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__LowerCase']")
	WebElement lowerCaseValidation;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__OneNumber']")
	WebElement oneNumberValidation;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__SpecialCharacter']")
	WebElement specialCharacterValidation;


	private final IOSUtility utilities;

	public I0_LoginPageObjects(){
		PageFactory.initElements(appiumDriver,this);
		utilities = new IOSUtility();
	}

	public void selectLanguage(String language) throws Exception {
		if (language.equalsIgnoreCase("english")){
			utilities.listSelection(languageButton,languageList,"English");
		}else {
			utilities.listSelection(languageButton,languageList,"عربي");
			utilities.click(languageButton);
			utilities.assertMessage(loginPageTitle,"مرحبًا بكم في Appzillon مصرف");
		}
	}

	public void verifyLoginPage() throws Exception {
		utilities.waitForElement(loginEmailID);
	}


    public void setLoginEmailID(String value) throws Exception {
		utilities.sendKeys(loginEmailID,value);
	}

	public void setLoginPassword(String value) throws Exception {
		utilities.sendKeys(loginPassword,value);
	}

	public void clickLoginButton() throws Exception {
		utilities.tapByElement(loginButton);
	}

	public void clickSignUplink() throws Exception {
		utilities.tapByElement(signUplink);
	}

	public void verifySignUpPage() {
		utilities.waitForElement(signUpEmailId);
	}

	public void setSignUpEmailId(String value) throws Exception {
		utilities.waitForElement(signUpEmailId);
		try {
			utilities.waitForTextVisible(signUpMobileCode);
		}catch (Exception e){
			utilities.waitForTextVisible(signUpMobileCode1);
		}
		utilities.sendKeys(signUpEmailId,value);
	}

	public void selectSignUpMobileCode(String value) throws Exception {
		try {
			utilities.tapByElement(signUpMobileCode);
			utilities.sendKeys(signUPMobileCodeSearch,value);
			utilities.enterClick(signUPMobileCodeSearch);
		}catch (Exception e){
			//		utilities.tapByElement(signUPMobileCodeText);
//		utilities.selectFromDropDown(signUPMobileCodeText,value);
//		utilities.selectTagSelection(signUpMobileCode,value);
		}
	}

	public void setSignUpMobileNumber(String value) throws Exception {
		utilities.sendKeys(signUpMobileNumber,value);
	}

	public void clickSignUpButton() throws Exception {
		utilities.tapByElement(signUpButton);
	}

	public void setOtpField(String value) throws Exception {
		utilities.waitForElement(otpField);
		utilities.sendKeys(otpField,value);
	}

	public void clickOtpResendLink() throws Exception {
		utilities.tapByElement(otpResendLink);
	}

	public void clickOtpVerifyButton() throws Exception {
		utilities.tapByElement(otpVerifyButton);
	}

	public void clickChangeConfirmButton(String status) throws Exception {
		if (status.equalsIgnoreCase("valid data")){
			utilities.tapByElement(confirmPasswordButton);
		}else if (status.equalsIgnoreCase("no data")){
			utilities.tapByElement(confirmPasswordButton1);
		}else {
			utilities.tapByElement(confirmPasswordButton);
		}
	}


	public void setOldPassword(String value) throws Exception {
		utilities.sendKeys(oldPassword,value);
	}

	public void setNewPassword(String value) throws Exception {
		utilities.sendKeys(newPassword,value);
	}

	public void setConfirmPasswordButton(String value) throws Exception {
		utilities.sendKeys(confirmPassword,value);
	}

	public void assertEightDigitValidation(String value) {
//		if (value.equals("error"))
//			utilities.assertClassName(eightCharValidation,"err");
//		else
//			utilities.assertClassName(eightCharValidation,"suc");
	}

	public void assertUpperCaseValidation(String value){
//		if (value.equals("error"))
//			utilities.assertClassName(upperCaseValidation,"err");
//		else
//			utilities.assertClassName(upperCaseValidation,"suc");
	}

	public void assertLowerCaseValidation(String value) {
//		if (value.equals("error"))
//			utilities.assertClassName(lowerCaseValidation,"err");
//		else
//			utilities.assertClassName(lowerCaseValidation,"suc");
	}

	public void assertOneNumberValidation(String value)  {
//		if (value.equals("error"))
//			utilities.assertClassName(oneNumberValidation,"err");
//		else
//			utilities.assertClassName(oneNumberValidation,"suc");
	}

	public void assertSpecialCharacterValidation(String value) {
//		if (value.equals("error"))
//			utilities.assertClassName(specialCharacterValidation,"err");
//		else
//			utilities.assertClassName(specialCharacterValidation,"suc");
	}

	public void verifyChangePasswordScreen() throws IOException {
		utilities.waitForElement(oldPassword);
	}

	public void verifyOtpScreen() {
		utilities.waitForElement(otpField);
	}


	public void validateSuccessMessageBox(String message) throws Exception {
		utilities.validateSuccessMessageBox(message);
	}

    public boolean validateEmail(String email) {
		return utilities.checkSameTextEnteredPresent(signUpEmailId,email);
    }

	public boolean validateMobileNumber(String mobileNumber) {
		return utilities.checkSameTextEnteredPresent(signUpMobileNumber,mobileNumber);
	}

	public boolean validateCountryCode(String mobileCode) throws Exception {
		utilities.waitForSeconds(2);
		return utilities.checkSameTextEnteredPresent(signUpMobileCode,mobileCode);
	}

	public void validateOldPasswordMessage(String message) {
		utilities.assertMessage(oldPasswordMessage,message);
	}

	public void validateNewPasswordMessage(String message) {
		utilities.assertMessage(newPasswordMessage,message);
	}

	public void validateConfirmPasswordMessage(String message) {
		utilities.assertMessage(confirmPasswordMessage,message);
	}

	public void validatePasswordPolicies(String policy) {
		assertEightDigitValidation(policy);
		assertUpperCaseValidation(policy);
		assertLowerCaseValidation(policy);
		assertOneNumberValidation(policy);
		assertSpecialCharacterValidation(policy);
	}

	public void validateInvalidOldPassword(String message1) {
		utilities.assertMessage(oldPasswordValidationMessage,message1);
	}

	public void validateInvalidConfirmPassword(String message3) {
		utilities.assertMessage(confirmPasswordDistinctMessage,message3);
	}

	public void validateErrorMessageBox(String message) throws Exception {
//		utilities.validateErrorMessageBox(message);
	}

	public void acceptAlertMessages() {
		utilities.acceptPermissionMessage();
	}
}