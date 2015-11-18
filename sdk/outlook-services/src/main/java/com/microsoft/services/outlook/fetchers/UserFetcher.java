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
 * The type  User
 */
public class UserFetcher extends OrcEntityFetcher<User,UserOperations> 
                                     implements Readable<User> {

     /**
     * Instantiates a new UserFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public UserFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, User.class, UserOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public UserFetcher addParameter(String name, Object value) {
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
    public UserFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    
     /**
     * Gets subscriptions.
     *
     * @return the subscriptions
     */
    public OrcCollectionFetcher<Subscription, SubscriptionFetcher, SubscriptionCollectionOperations> getSubscriptions() {
        return new OrcCollectionFetcher<Subscription, SubscriptionFetcher, SubscriptionCollectionOperations>("Subscriptions", this, Subscription.class, SubscriptionCollectionOperations.class);
    }

    /**
     * Gets subscription.
     *
     * @return the subscription
     */
    public SubscriptionFetcher getSubscription(String id){
         return new OrcCollectionFetcher<Subscription, SubscriptionFetcher, SubscriptionCollectionOperations>("Subscriptions", this, Subscription.class, SubscriptionCollectionOperations.class).getById(id);
    }

     /**
     * Gets messages.
     *
     * @return the messages
     */
    public OrcCollectionFetcher<Message, MessageFetcher, MessageCollectionOperations> getMessages() {
        return new OrcCollectionFetcher<Message, MessageFetcher, MessageCollectionOperations>("Messages", this, Message.class, MessageCollectionOperations.class);
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public MessageFetcher getMessage(String id){
         return new OrcCollectionFetcher<Message, MessageFetcher, MessageCollectionOperations>("Messages", this, Message.class, MessageCollectionOperations.class).getById(id);
    }

     /**
     * Gets joined groups.
     *
     * @return the joined groups
     */
    public OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations> getJoinedGroups() {
        return new OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations>("JoinedGroups", this, Group.class, GroupCollectionOperations.class);
    }

    /**
     * Gets joined group.
     *
     * @return the joined group
     */
    public GroupFetcher getJoinedGroup(String id){
         return new OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations>("JoinedGroups", this, Group.class, GroupCollectionOperations.class).getById(id);
    }

     /**
     * Gets mail folders.
     *
     * @return the mail folders
     */
    public OrcCollectionFetcher<MailFolder, MailFolderFetcher, MailFolderCollectionOperations> getMailFolders() {
        return new OrcCollectionFetcher<MailFolder, MailFolderFetcher, MailFolderCollectionOperations>("MailFolders", this, MailFolder.class, MailFolderCollectionOperations.class);
    }

    /**
     * Gets mail folder.
     *
     * @return the mail folder
     */
    public MailFolderFetcher getMailFolder(String id){
         return new OrcCollectionFetcher<MailFolder, MailFolderFetcher, MailFolderCollectionOperations>("MailFolders", this, MailFolder.class, MailFolderCollectionOperations.class).getById(id);
    }
     /**
     * Gets calendar.
     *
     * @return the calendar
     */
    public CalendarFetcher getCalendar() {
        return new CalendarFetcher("Calendar", this);
    }

     /**
     * Gets calendars.
     *
     * @return the calendars
     */
    public OrcCollectionFetcher<Calendar, CalendarFetcher, CalendarCollectionOperations> getCalendars() {
        return new OrcCollectionFetcher<Calendar, CalendarFetcher, CalendarCollectionOperations>("Calendars", this, Calendar.class, CalendarCollectionOperations.class);
    }

    /**
     * Gets calendar.
     *
     * @return the calendar
     */
    public CalendarFetcher getCalendar(String id){
         return new OrcCollectionFetcher<Calendar, CalendarFetcher, CalendarCollectionOperations>("Calendars", this, Calendar.class, CalendarCollectionOperations.class).getById(id);
    }

     /**
     * Gets calendar groups.
     *
     * @return the calendar groups
     */
    public OrcCollectionFetcher<CalendarGroup, CalendarGroupFetcher, CalendarGroupCollectionOperations> getCalendarGroups() {
        return new OrcCollectionFetcher<CalendarGroup, CalendarGroupFetcher, CalendarGroupCollectionOperations>("CalendarGroups", this, CalendarGroup.class, CalendarGroupCollectionOperations.class);
    }

    /**
     * Gets calendar group.
     *
     * @return the calendar group
     */
    public CalendarGroupFetcher getCalendarGroup(String id){
         return new OrcCollectionFetcher<CalendarGroup, CalendarGroupFetcher, CalendarGroupCollectionOperations>("CalendarGroups", this, CalendarGroup.class, CalendarGroupCollectionOperations.class).getById(id);
    }

     /**
     * Gets calendar view.
     *
     * @return the calendar view
     */
    public OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations> getCalendarView() {
        return new OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("CalendarView", this, Event.class, EventCollectionOperations.class);
    }

    /**
     * Gets calendar view.
     *
     * @return the calendar view
     */
    public EventFetcher getCalendarView(String id){
         return new OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("CalendarView", this, Event.class, EventCollectionOperations.class).getById(id);
    }

     /**
     * Gets events.
     *
     * @return the events
     */
    public OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations> getEvents() {
        return new OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("Events", this, Event.class, EventCollectionOperations.class);
    }

    /**
     * Gets event.
     *
     * @return the event
     */
    public EventFetcher getEvent(String id){
         return new OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("Events", this, Event.class, EventCollectionOperations.class).getById(id);
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
     * Gets contact folders.
     *
     * @return the contact folders
     */
    public OrcCollectionFetcher<ContactFolder, ContactFolderFetcher, ContactFolderCollectionOperations> getContactFolders() {
        return new OrcCollectionFetcher<ContactFolder, ContactFolderFetcher, ContactFolderCollectionOperations>("ContactFolders", this, ContactFolder.class, ContactFolderCollectionOperations.class);
    }

    /**
     * Gets contact folder.
     *
     * @return the contact folder
     */
    public ContactFolderFetcher getContactFolder(String id){
         return new OrcCollectionFetcher<ContactFolder, ContactFolderFetcher, ContactFolderCollectionOperations>("ContactFolders", this, ContactFolder.class, ContactFolderCollectionOperations.class).getById(id);
    }
     /**
     * Gets photo.
     *
     * @return the photo
     */
    public PhotoFetcher getPhoto() {
        return new PhotoFetcher("Photo", this);
    }

}
