package jp.mixi.android.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by Hideyuki.Kikuma on 15/08/25.
 */
@RunWith(RobolectricGradleTestRunner.class)
@org.robolectric.annotation.Config(constants = BuildConfig.class)
public class ConfigTest {

	private static final int DEFAULT_CONNECTION_TIMEOUT = 20000;
	private static final int DEFAULT_SOCKET_TIMEOUT = 20000;

	@Test
	public void defaultConfig() {
		Config config = new Config();
		assertThat(config.selector, is(Config.APPLICATION));
		assertThat(config.clientId, is(nullValue()));
		assertThat(config.connectionTimeout, is(DEFAULT_CONNECTION_TIMEOUT));
		assertThat(config.socketTimeout, is(DEFAULT_SOCKET_TIMEOUT));
		assertThat(config.version, is(BuildConfig.VERSION_NAME));
	}
}