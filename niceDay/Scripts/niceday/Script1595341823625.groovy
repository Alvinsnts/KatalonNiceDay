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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\alvin\\OneDrive\\Desktop\\nicedayapk\\niceday.apk', true)

Mobile.tap(findTestObject('Niceday/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('Niceday/android.widget.TextView0 - Login'), 0)

Mobile.setText(findTestObject('Niceday/android.widget.EditText0 - Email Address'), 'qa+candidate@sense-os.nl', 0)

Mobile.setText(findTestObject('Niceday/android.widget.EditText0 - Password'), 'Password@12345', 0)

Mobile.tap(findTestObject('Niceday/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Niceday/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Niceday/android.view.ViewGroup0 (6)'), 0)

Mobile.setText(findTestObject('Niceday/android.widget.EditText0 - Search for a professional'), 'kurnia therapist', 0)

Mobile.tap(findTestObject('Niceday/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Niceday/android.view.ViewGroup0 (7)'), 0)

Mobile.tap(findTestObject('Niceday/android.widget.Button() - OK'), 0)

Mobile.getText(findTestObject('Niceday/android.widget.TextView0 - Connection request has been sent'), 0)

Mobile.getText(findTestObject('Niceday/android.widget.TextView0 - Your connection request will be accepted shortly. From the moment that you are connected, your data will be shared with your professional! We will notify you when this happens. Meanwhile, why dont you check out your trackers? '), 0)

Mobile.closeApplication()
