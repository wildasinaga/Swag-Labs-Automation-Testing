import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name (17)'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password (17)'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password (17)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_ADD TO CART (9)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_ADD TO CART (9)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/path (4)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_CHECKOUT (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_first-name'), 'saad')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_last-name'), 'sdsaf')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postal-code'), 'fdsaf')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_CANCEL_btn_primary cart_button'))

