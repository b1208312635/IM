package com.yrw.im.connector.service.rest;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.yrw.im.common.domain.po.Offline;
import com.yrw.im.common.rest.AbstractRestService;

import java.util.List;

/**
 * Date: 2019-05-28
 * Time: 00:18
 *
 * @author yrw
 */
public class ConnectorRestService extends AbstractRestService<ConnectorRestClient> {

    @Inject
    public ConnectorRestService(@Assisted String url) {
        super(ConnectorRestClient.class, url);
    }

    public List<Offline> offlines(String token) {
        return doRequest(() -> restClient.pollOfflineMsg(token).execute());
    }
}
