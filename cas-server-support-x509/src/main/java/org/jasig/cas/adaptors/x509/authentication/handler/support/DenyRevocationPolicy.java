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
package org.jasig.cas.adaptors.x509.authentication.handler.support;

import java.security.GeneralSecurityException;


public final class DenyRevocationPolicy implements RevocationPolicy<Void> {

    /**
     * Policy application throws GeneralSecurityException to stop execution of
     * whatever process invoked application of this policy.
     *
     * @param nothing SHOULD be null; ignored in all cases.
     * 
     * @throws GeneralSecurityException Thrown in all cases.
     *
     * @see org.jasig.cas.adaptors.x509.authentication.handler.support.RevocationPolicy#apply(java.lang.Object)
     */
    public void apply(final Void nothing) throws GeneralSecurityException {
        throw new GeneralSecurityException("Aborting since DenyRevocationPolicy is in effect.");
    }

}
