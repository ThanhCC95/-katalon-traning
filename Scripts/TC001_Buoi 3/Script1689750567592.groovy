import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Data
def email = 'thanhcc@firegroup.io'
def password = 'mNYXkrMlhhos9VTJILxjoQ=='
def email_list = new String[2]
 email_list[0] = "thanhcc1@firegroup.io"
 email_list[1] = "thanhcc@firegroup.io"
 def account_map=[
	 				account1:[
						 email :"thanhcc@firegroup.io",
						 password: "mNYXkrMlhhos9VTJILxjoQ"],
					 account2:[
						 email :"thanhcc1@firegroup.io",
						 password:"mNYXkrMlhhos9VTJILxjoQ=="]]
 
// for (def i = 0 ; i<=5 ;i++ ) {
//	 
// }
 
 
def input_email(def txt_email,def email) {
	WebUI.sendKeys(txt_email,email)
}



def input_password(def txt_password,password) {
	WebUI.sendKeys(txt_password,password)
}
 
WebUI.openBrowser('https://auto2023.myshopify.com/account/login')
WebUI.maximizeWindow()
input_email(txt_email,'thanhcc@firegroup.io')
input_password(txt_password,'mNYXkrMlhhos9VTJILxjoQ')
//WebUI.click(btn_login)
//WebUI.sendKeys(txt_email, account_map.account1.email)
//WebUI.setEncryptedText(txt_password, account_map.account2.password)
WebUI.click(btn_signin)
WebUI.takeScreenshot('srceenshot.png')
WebUI.closeBrowser()