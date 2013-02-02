package egeo.live;

import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;
import oauth.signpost.exception.OAuthException;

public class Auth {

	private final CommonsHttpOAuthProvider provider;
	private final CommonsHttpOAuthConsumer consumer;

	public Auth() {
		consumer = new CommonsHttpOAuthConsumer(
				IEgeoConstants.OAUTH_CONSUMER_KEY,
				IEgeoConstants.OAUTH_CONSUMER_SECRET);

		provider = new CommonsHttpOAuthProvider(
				IEgeoConstants.OAUTH_REQUEST_URL,
				IEgeoConstants.OAUTH_ACCESS_URL,
				IEgeoConstants.OAUTH_AUTHORIZE_URL);

	}

	/**
	 * Returns a URL to display to the user. When the user has approved, he will
	 * be redirected to the callback URL which will contain the oauth_verifier
	 * which then is passed to {@link #retrieveAccessToken(String)}.
	 * 
	 * @param callbackUrl
	 * @param monitor
	 * @return
	 * @throws OAuthException
	 */
	public String retrieveRequestToken(String callbackUrl)
			throws OAuthException {
		return provider.retrieveRequestToken(consumer, callbackUrl);
	}

	public void retrieveAccessToken(String verifier) throws OAuthException {
		provider.retrieveAccessToken(consumer, verifier);
	}

	public String getToken() {
		return consumer.getToken();
	}
}
