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

WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxPlatformType'), 
    GlobalVariable.PlatformType)

WebUI.comment('PlatformType1')

if (Integer.parseInt(GlobalVariable.PlatformType.toString()).equals(1)) {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxType'), 
        GlobalVariable.Type)

    if (Integer.parseInt(GlobalVariable.Type.toString()).equals(1)) {
        WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxOperatorName'), 
            GlobalVariable.OperatorName)

        if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(1)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName1'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(2)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName2'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(3)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName3'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(4)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName4'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(5)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName5'), 
                GlobalVariable.ProviderName)
        } else {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName6'), 
                GlobalVariable.ProviderName)
        }
    } else if (Integer.parseInt(GlobalVariable.Type.toString()).equals(2)) {
        WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxOperatorName'), 
            GlobalVariable.OperatorName)

        if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(1)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName1'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(2)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName2'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(3)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName3'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(4)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName4'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(5)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName5'), 
                GlobalVariable.ProviderName)
        } else {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName6'), 
                GlobalVariable.ProviderName)
        }
    } else if (Integer.parseInt(GlobalVariable.Type.toString()).equals(4)) {
        WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxOperatorName4(DestopWeb)'), 
            GlobalVariable.OperatorName)

        WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProvidername(DestopWebTik)'), 
            GlobalVariable.ProviderName)
    } else {
    }
} else if (Integer.parseInt(GlobalVariable.PlatformType.toString()).equals(2)) {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxType'), 
        GlobalVariable.Type)

    if (Integer.parseInt(GlobalVariable.Type.toString()).equals(1)) {
        WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxOperatorName'), 
            GlobalVariable.OperatorName)

        if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(1)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName1'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(2)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName2'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(3)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName3'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(4)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName4'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(5)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName5'), 
                GlobalVariable.ProviderName)
        } else {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName6'), 
                GlobalVariable.ProviderName)
        }
    } else if (Integer.parseInt(GlobalVariable.Type.toString()).equals(2)) {
        WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxOperatorName'), 
            GlobalVariable.OperatorName)

        if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(1)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName1'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(2)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName2'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(3)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName3'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(4)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName4'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(5)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName5'), 
                GlobalVariable.ProviderName)
        } else {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName6'), 
                GlobalVariable.ProviderName)
        }
    } else if (Integer.parseInt(GlobalVariable.Type.toString()).equals(4)) {
        WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxOperatorName4(Mobile)'), 
            GlobalVariable.OperatorName)

        if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(1)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProvidername(DestopWebTik)'), 
                GlobalVariable.ProviderName)
        } else {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName(MobileBPJS)'), 
                GlobalVariable.ProviderName)
        }
    } else {
    }
} else {
    WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxType'), 
        GlobalVariable.Type)

    if (Integer.parseInt(GlobalVariable.Type.toString()).equals(1)) {
        WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxOperatorName'), 
            GlobalVariable.OperatorName)

        if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(1)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName1'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(2)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName2'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(3)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName3'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(4)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName4'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(5)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName5'), 
                GlobalVariable.ProviderName)
        } else {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName6'), 
                GlobalVariable.ProviderName)
        }
    } else if (Integer.parseInt(GlobalVariable.Type.toString()).equals(2)) {
        WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxOperatorName'), 
            GlobalVariable.OperatorName)

        if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(1)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName1'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(2)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName2'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(3)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName3'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(4)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName4'), 
                GlobalVariable.ProviderName)
        } else if (Integer.parseInt(GlobalVariable.OperatorName.toString()).equals(5)) {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName5'), 
                GlobalVariable.ProviderName)
        } else {
            WebUI.selectOptionByIndex(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/txtBoxProviderName6'), 
                GlobalVariable.ProviderName)
        }
    } else {
    }
}

WebUI.click(findTestObject('01_DESKTOP/0105_Admin/010514_DigitalProductManagement/01051405_ProductDigitalManagement/btnSearch'))

