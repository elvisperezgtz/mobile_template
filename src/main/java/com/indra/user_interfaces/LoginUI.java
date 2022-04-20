package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target USERNAME = Target.the("campo usuario")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc='test-Usuario']"))
            .locatedForIOS(By.xpath("//foo[]"));

    public static final Target PASSWORD = Target.the("campo password")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc='test-Contrase\u00F1a']"))
            .locatedForIOS(By.xpath("//foo[]"));

    public static final Target LOGIN = Target.the("boton login")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"))
            .locatedForIOS(By.xpath("//foo[]"));

    public static final Target WINDOW = Target.the("WINDOW")
            .locatedBy("//android.widget.ScrollView[@content-desc='test-Login']/android.view.ViewGroup");

    public static final Target STANDARD_USER = Target.the("WINDOW")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-standard_user']/android.widget.TextView");

    public static final Target SCROLL = Target.the("SCROLL")
            .locatedBy("//android.widget.ScrollView[@content-desc='test-Login']");


}
