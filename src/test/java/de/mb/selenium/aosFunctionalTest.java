package de.mb.selenium;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;

@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin={"junit:junitResult.xml"},
                features= {"src/test/java/de/mb/selenium/"})

public class aosFunctionalTest {

}

