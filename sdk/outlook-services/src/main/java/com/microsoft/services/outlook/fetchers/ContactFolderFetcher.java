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
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  ContactFolder
 */
public class ContactFolderFetcher extends OrcEntityFetcher<ContactFolder,ContactFolderOperations> 
                                     implements Readable<ContactFolder> {

     /**
     * Instantiates a new ContactFolderFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public ContactFolderFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, ContactFolder.class, ContactFolderOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ContactFolderFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }
	
	/**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ContactFolderFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    
     /**
     * Gets contacts.
     *
     * @return the contacts
     */
    public OrcCollectionFetcher<Contact, ContactFetcher, ContactCollectionOperations> getContacts() {
        return new OrcCollectionFetcher<Contact, ContactFetcher, ContactCollectionOperations>("Contacts", this, Contact.class, ContactCollectionOperations.class);
    }

    /**
     * Gets contact.
     *
     * @return the contact
     */
    public ContactFetcher getContact(String id){
         return new OrcCollectionFetcher<Contact, ContactFetcher, ContactCollectionOperations>("Contacts", this, Contact.class, ContactCollectionOperations.class).getById(id);
    }

     /**
     * Gets child folders.
     *
     * @return the child folders
     */
    public OrcCollectionFetcher<ContactFolder, ContactFolderFetcher, ContactFolderCollectionOperations> getChildFolders() {
        return new OrcCollectionFetcher<ContactFolder, ContactFolderFetcher, ContactFolderCollectionOperations>("ChildFolders", this, ContactFolder.class, ContactFolderCollectionOperations.class);
    }

    /**
     * Gets child folder.
     *
     * @return the child folder
     */
    public ContactFolderFetcher getChildFolder(String id){
         return new OrcCollectionFetcher<ContactFolder, ContactFolderFetcher, ContactFolderCollectionOperations>("ChildFolders", this, ContactFolder.class, ContactFolderCollectionOperations.class).getById(id);
    }

}
