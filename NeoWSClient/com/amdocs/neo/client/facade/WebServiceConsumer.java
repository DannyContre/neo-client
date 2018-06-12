package com.amdocs.neo.client.facade;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.client.urlconnection.HTTPSProperties;

public class WebServiceConsumer {

	String apiUri;

	public WebServiceConsumer(String apiUri) {
		this.apiUri = apiUri;
	}

	public String executeHttpsGET(String queryPath) {
		final ClientConfig config = new DefaultClientConfig();

		try {
			config.getProperties().put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES, new HTTPSProperties(
					SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER, SSLUtil.getInsecureSSLContext()));
		} catch (Exception e) {
			System.out.println(e);
		}

		final Client client = Client.create(config);
		final WebResource resource = client.resource(this.apiUri + "?" + queryPath);
		return resource.get(String.class);
	}

	private static class SSLUtil {
		protected static SSLContext getInsecureSSLContext() throws KeyManagementException, NoSuchAlgorithmException {
			final TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(final java.security.cert.X509Certificate[] arg0, final String arg1)
						throws CertificateException {
				}

				public void checkServerTrusted(final java.security.cert.X509Certificate[] arg0, final String arg1)
						throws CertificateException {
				}

			} };

			final SSLContext sslcontext = SSLContext.getInstance("SSL");
			sslcontext.init(null, trustAllCerts, new java.security.SecureRandom());
			return sslcontext;
		}
	}
}