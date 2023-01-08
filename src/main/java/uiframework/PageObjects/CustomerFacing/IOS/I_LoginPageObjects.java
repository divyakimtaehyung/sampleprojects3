package uiframework.PageObjects.CustomerFacing.IOS;

import com.iexceed.uiframework.core.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uiframework.DomainObjects.Utility;

import java.util.List;

public class I_LoginPageObjects extends TestBase{

	WebDriver driver = TestBase.getDriver();


	//Login page Objects
	@FindBy(xpath = "//*[@id='cfplog__Login__el_txt_5_txtcnt']")
	WebElement loginPageTitle;
	@FindBy(xpath = "//*[@id='cfplog__Login__userId']")
	WebElement languageButton;
	@FindBy(xpath = "//*[@id='cfplog__Login__langChangeDD_div']/ul/li")
	List<WebElement> languageList;
	@FindBy(xpath = "//*[@id='cfplog__Login__userId']")
	WebElement loginEmailID;
	@FindBy(xpath = "//*[@id='cfplog__Login__pswd']")
	WebElement loginPassword;
	@FindBy(xpath = "//*[@id='cfplog__Login__element_button_1']")
	WebElement loginButton;
	@FindBy(xpath = "//*[@id='cfplog__Login__signUpLink']")
	WebElement signUplink;

	//Signup Page Objects
	@FindBy(xpath = "//*[@id='cfpsgn__SignUp__emailId']")
	WebElement signUpEmailId;
	@FindBy(xpath = "//*[@id='cfpsgn__SignUp__mobCode']")
	WebElement signUpMobileCode;
	@FindBy(xpath = "//*[@id='select2-cfpsgn__SignUp__mobCode-container']")
	WebElement signUPMobileCodeText;
	@FindBy(xpath = "//*[@id='cfpsgn__SignUp__mobileNum']")
	WebElement signUpMobileNumber;
	@FindBy(xpath = "//*[@id='cfpsgn__SignUp__signUpBtn']")
	WebElement signUpButton;

	//OTP Page Objects
	@FindBy(xpath = "//*[@id='cfpotp__OTPScreen__OTP']")
	WebElement otpField;
	@FindBy(xpath = "//*[@id='cfpotp__OTPScreen__ResendOtp']")
	WebElement otpResendLink;
	@FindBy(xpath = "//*[@id='cfpotp__OTPScreen__Verify']")
	WebElement otpVerifyButton;

	//Change Password Screen Objects
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__oldPassword']")
	WebElement oldPassword;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__newPassword']")
	WebElement newPassword;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__confirmPassword']")
	WebElement confirmPassword;

	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__element_button_2']")
	WebElement confirmPasswordButton;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__oldPassword_ERR_TEXT']")
	WebElement oldPasswordMessage;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__Old_Password_Validate_Row']")
	WebElement oldPasswordValidationMessage;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__newPassword_ERR_TEXT']")
	WebElement newPasswordMessage;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__confirmPassword_ERR_TEXT']")
	WebElement confirmPasswordMessage;
	@FindBy(xpath = "//*[@id='cfplog__ChangePassword__el_txt_6']")
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


	private final Utility utilities;

	public I_LoginPageObjects(){
		PageFactory.initElements(driver,this);
		utilities = new Utility();
	}


	public void selectLanguage(String language) throws Exception {
		if (language.equalsIgnoreCase("english")){
			utilities.listSelectionByData(languageButton,languageList,"en");
		}else {
			utilities.listSelectionByData(languageButton,languageList,"ar");
			utilities.click(languageButton);
			utilities.waitForElementTextVisible(loginPageTitle,"مرحبًا بكم في Appzillon مصرف");
		}
	}


    public void setLoginEmailID(String value) throws Exception {
		utilities.sendKeys(loginEmailID,value);
	}

	public void setLoginPassword(String value) throws Exception {
		utilities.sendKeys(loginPassword,value);
	}

	public void clickLoginButton() throws Exception {
		utilities.click(loginButton);
	}

	public void clickSignUplink() throws Exception {
		utilities.click(signUplink);
	}

	public void setSignUpEmailId(String value) throws Exception {
		utilities.waitForElement(signUpEmailId);
		utilities.waitForTextVisible(signUpMobileCode);
		utilities.sendKeys(signUpEmailId,value);
	}

	public void selectSignUpMobileCode(String value) throws Exception {
		utilities.selectTagSelection(signUpMobileCode,value);
	}

	public void setSignUpMobileNumber(String value) throws Exception {
		utilities.sendKeys(signUpMobileNumber,value);
	}

	public void clickSignUpButton() throws Exception {
		utilities.click(signUpButton);
	}

	public void setOtpField(String value) throws Exception {
		utilities.waitForElement(otpField);
		utilities.sendKeys(otpField,value);
	}

	public void clickOtpResendLink() throws Exception {
		utilities.click(otpResendLink);
	}

	public void clickOtpVerifyButton() throws Exception {
		utilities.click(otpVerifyButton);
	}

	public void clickChangeConfirmButton() throws Exception {
		utilities.click(confirmPasswordButton);
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
		if (value.equals("error"))
			utilities.assertClassName(eightCharValidation,"err");
		else
			utilities.assertClassName(eightCharValidation,"suc");
	}

	public void assertUpperCaseValidation(String value){
		if (value.equals("error"))
			utilities.assertClassName(upperCaseValidation,"err");
		else
			utilities.assertClassName(upperCaseValidation,"suc");
	}

	public void assertLowerCaseValidation(String value) {
		if (value.equals("error"))
			utilities.assertClassName(lowerCaseValidation,"err");
		else
			utilities.assertClassName(lowerCaseValidation,"suc");
	}

	public void assertOneNumberValidation(String value)  {
		if (value.equals("error"))
			utilities.assertClassName(oneNumberValidation,"err");
		else
			utilities.assertClassName(oneNumberValidation,"suc");
	}

	public void assertSpecialCharacterValidation(String value) {
		if (value.equals("error"))
			utilities.assertClassName(specialCharacterValidation,"err");
		else
			utilities.assertClassName(specialCharacterValidation,"suc");
	}

	public void verifyChangePasswordScreen() throws Exception {
		utilities.webViewConverter();
		utilities.waitForElement(oldPassword);
	}

	public void verifyOtpScreen() {
		utilities.waitForElement(otpField);
	}

	public void verifyLoginPage() {
		utilities.waitForElement(loginEmailID);
	}

	public void validateSuccessMessageBox(String message) throws Exception {
		utilities.validateSuccessMessageBox(message);
	}

    public void verifySignUpPage() throws Exception {
		utilities.webViewConverter();
		utilities.waitForElement(signUpEmailId);
    }

    public boolean validateEmail(String email) {
		return utilities.checkSameTextEnteredPresent(signUpEmailId,email);
    }

	public boolean validateMobileNumber(String mobileNumber) {
		return utilities.checkSameTextEnteredPresent(signUpMobileNumber,mobileNumber);
	}

	public boolean validateCountryCode(String mobileCode) throws Exception {
		utilities.waitForSeconds(2);
		return utilities.checkSameTextEnteredPresent(signUPMobileCodeText,mobileCode);
	}

	public void validateOldPasswordMessage(String message) {
		utilities.assertClassName(oldPasswordMessage,"err");
		utilities.assertMessage(oldPasswordMessage,message);
	}

	public void validateNewPasswordMessage(String message) {
		utilities.assertClassName(newPasswordMessage,"err");
		utilities.assertMessage(newPasswordMessage,message);
	}

	public void validateConfirmPasswordMessage(String message) {
		utilities.assertClassName(confirmPasswordMessage,"err");
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
		utilities.assertClassName(oldPasswordValidationMessage,"err");
		utilities.assertMessage(oldPasswordValidationMessage,message1);
	}

	public void validateInvalidConfirmPassword(String message3) {
		utilities.assertClassName(confirmPasswordDistinctMessage,"err");
		utilities.assertMessage(confirmPasswordDistinctMessage,message3);
	}

	public void validateErrorMessageBox(String message) throws Exception {
		utilities.validateErrorMessageBox(message);
	}

	public void acceptAlertMessages() throws Exception {
		utilities.acceptPermissionMessage();
		utilities.webViewConverter();
	}
}