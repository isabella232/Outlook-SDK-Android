

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
import com.microsoft.services.orc.http.*;
import com.microsoft.services.orc.serialization.JsonSerializer;
import static com.microsoft.services.orc.core.Helpers.*;

/**
 * The type ReferenceAttachmentCollectionOperations
 */
public class ReferenceAttachmentCollectionOperations extends AttachmentCollectionOperations{

    /**
     * Instantiates a new ReferenceAttachmentCollectionOperations.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
    public ReferenceAttachmentCollectionOperations(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public ReferenceAttachmentCollectionOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public ReferenceAttachmentCollectionOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }
}
