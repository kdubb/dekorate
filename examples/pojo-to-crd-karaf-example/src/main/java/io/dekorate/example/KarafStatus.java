/**
 * Copyright 2018 The original authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
**/

package io.dekorate.example;

import io.dekorate.crd.annotation.PrinterColumn;
import io.dekorate.crd.annotation.StatusReplicas;

public class KarafStatus {

  @PrinterColumn
  private boolean running;

  @PrinterColumn
  private long uptime;

  @StatusReplicas
  private int replicas;

  public long getUptime() {
    return this.uptime;
  }

  public void setUptime(long uptime) {
    this.uptime = uptime;
  }

  public boolean getRunning() {
    return this.running;
  }

  public void setRunning(boolean running) {
    this.running = running;
  }

  public int getReplicas() {
    return this.replicas;
  }

  public void setReplicas(int replicas) {
    this.replicas=replicas;
  }

}
