package com.ifgov.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.ifgov.shared.SubscriptionDto;

@RemoteServiceRelativePath("ifgov")
public interface IfGovService extends RemoteService {

	String getData(Double lat, Double lon);

	void subscribe(SubscriptionDto subscriptionDto);

}
