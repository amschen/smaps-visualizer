/**
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.smaps;

import java.util.ArrayList;
import java.util.List;

/**
 * Takes in the data from the smaps file upload and analyzes/converts it into useful structures.
 */
class Analyzer {
  // Holds all regions of the smaps dump.
  static List<Region> regions = new ArrayList<Region>();

  /* Set the list of regions in this class so it can be accessed by multiple charts/visualizations.
   */
  static void makeRegionList(String filePathname) {
    regions = FileParser.parseRegionList(filePathname);
    return;
  }

  /* Return the list of regions. */
  static List<Region> getRegionList() {
    return regions;
  }
}