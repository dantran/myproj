package com.mycomp.myproj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Ignore;
import org.junit.Test;

public class MyProjTest {

    @Test
    @Ignore
    public void test() throws IOException {

        File thinProperties = new File(System.getProperty("basedir", "./"), "target/classes/META-INF/thin.properties");

        Properties props = new Properties();
        props.load(new FileInputStream(thinProperties));



    }

}
