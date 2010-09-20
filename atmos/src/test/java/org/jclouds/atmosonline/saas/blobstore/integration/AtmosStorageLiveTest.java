/**
 *
 * Copyright (C) 2010 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.jclouds.atmosonline.saas.blobstore.integration;

import static org.testng.Assert.assertEquals;

import org.jclouds.blobstore.integration.internal.BaseBlobLiveTest;
import org.testng.annotations.Test;

/**
 * 
 * @author Adrian Cole
 */
@Test(groups = { "live" }, testName = "emcsaas.AtmosStorageLiveTest")
public class AtmosStorageLiveTest extends BaseBlobLiveTest {
   protected void checkMD5(String container, String name, byte[] md5) {
      // atmos does not support content-md5 yet
      assertEquals(context.getBlobStore().blobMetadata(container, name).getContentMetadata().getContentMD5(), null);
   }
}