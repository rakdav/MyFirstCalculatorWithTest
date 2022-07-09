package com.example.myfirstcalculator;

import static org.junit.Assert.*;

import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.manipulation.Ordering;
import org.mockito.Mockito;
import static org.hamcrest.CoreMatchers.is;

public class UriValidatorTest {
    public static final String NOTHING = "Nothing";
    public static final String URL = "URL";
    public static final String FILE = "File";
    UriValidator uriValidator;
    Context mockContext;
    @Before
    public void setUp() throws Exception {
        mockContext = Mockito.mock(Context.class);
        Mockito.when(mockContext.getString(R.string.nothing)).thenReturn("Nothing");
        Mockito.when(mockContext.getString(R.string.url)).thenReturn("URL");
        Mockito.when(mockContext.getString(R.string.file)).thenReturn("File");
        uriValidator = new UriValidator(mockContext);
    }
    @Test
    public void validate() throws Exception {
        assertThat(uriValidator.validate("http://google.com"), is(URL));
        assertThat(uriValidator.validate("file://sdcard/DCIM/img001.jpg"), is(FILE));
        assertThat(uriValidator.validate("bla-bla-bla"), is(NOTHING));
    }
    @After
    public void tearDown() throws Exception {
    }
}