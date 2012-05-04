/*
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.ticket;

import org.jasig.cas.authentication.Authentication;
import org.jasig.cas.authentication.principal.Service;

public interface ServiceTicket extends Ticket {

    /** Prefix generally applied to unique ids generated by UniqueIdGenenerator. */
    String PREFIX = "ST";

    /**
     * Retrieve the service this ticket was given for.
     * 
     * @return the server.
     */
    Service getService();

    /**
     * Determine if this ticket was created at the same time as a
     * TicketGrantingTicket.
     * 
     * @return true if it is, false otherwise.
     */
    boolean isFromNewLogin();

    boolean isValidFor(Service service);

    /**
     * Method to grant a TicketGrantingTicket from this service to the
     * authentication. Analogous to the ProxyGrantingTicket.
     * 
     * @param id The unique identifier for this ticket.
     * @param authentication The Authentication we wish to grant a ticket for.
     * @return The ticket granting ticket.
     */
    TicketGrantingTicket grantTicketGrantingTicket(String id,
        Authentication authentication, ExpirationPolicy expirationPolicy);
}
