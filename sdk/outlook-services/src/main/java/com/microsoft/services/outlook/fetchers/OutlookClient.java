
/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Corporation. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/

package com.microsoft.services.outlook.fetchers;

import com.microsoft.services.outlook.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.DependencyResolver;

/**
 * The type OutlookClient.
 */
public class OutlookClient extends BaseOrcContainer {

     /**
     * Instantiates a new OutlookClient.
     *
     * @param url the url
     * @param resolver the resolver
     */
    public OutlookClient(String url, DependencyResolver resolver) {
        super(url, resolver);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public OutlookClient addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public OutlookClient addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

     /**
     * Gets User.
     *
     * @return the User
     */
    public OrcCollectionFetcher<User, UserFetcher, UserCollectionOperations> getUsers() {
        return new OrcCollectionFetcher<User, UserFetcher, UserCollectionOperations>("Users", this, User.class,UserCollectionOperations.class);
    }
     /**
     * Gets Group.
     *
     * @return the Group
     */
    public OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations> getGroups() {
        return new OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations>("Groups", this, Group.class,GroupCollectionOperations.class);
    }
     /**
     * Gets Me.
     *
     * @return the Me
     */
    public UserFetcher getMe() {
        return new UserFetcher("Me", this);
    }
}