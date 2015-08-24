package jp.mixi.android.sdk;

import android.os.Build;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Hideyuki.Kikuma on 15/08/25.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class ConstantsTest {
	private static final String AGENT_PROPERTY_NAME = "http.agent";
	private static final String AGENT_PROPERTY_VALUE = "testAgent";

	@BeforeClass
	public static void testSetUp() {
		System.getProperties().setProperty(AGENT_PROPERTY_NAME, AGENT_PROPERTY_VALUE);
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testSUPPORTED_SDK_VERSION() throws Exception {
		assertThat(Constants.SUPPORTED_SDK_VERSION, is(Build.VERSION_CODES.FROYO));
	}

	@Test
	public void testVERSION() throws Exception {
		assertThat(Constants.VERSION, is(BuildConfig.VERSION_NAME));
	}

	@Test
	public void testUSER_AGENT() throws Exception {
		assertThat(Constants.USER_AGENT, is(AGENT_PROPERTY_VALUE + " mixi-Android-SDK/" + BuildConfig.VERSION_NAME));

	}

}
