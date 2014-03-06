// Copyright (C) 2013 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.acceptance.rest.change;

import com.google.gerrit.reviewdb.client.Change;
import com.google.gerrit.server.change.ChangeJson.LabelInfo;

import java.util.List;
import java.util.Map;

public class ChangeInfo {
  String id;
  String project;
  String branch;
  List<ChangeMessageInfo> messages;
  Change.Status status;
  public Boolean starred;
  Map<String, LabelInfo> labels;
}