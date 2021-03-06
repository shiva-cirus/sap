/*
 * Copyright © 2019 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.cdap.plugin.sap.odata;

import java.util.List;

/**
 * OData entity type metadata.
 */
public class EntityType {

  private final String name;
  private final List<PropertyMetadata> properties;

  public EntityType(String name, List<PropertyMetadata> properties) {
    this.name = name;
    this.properties = properties;
  }

  public String getName() {
    return name;
  }

  public List<PropertyMetadata> getProperties() {
    return properties;
  }
}
