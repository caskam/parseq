/*
 * Copyright 2012 LinkedIn, Inc
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

package com.linkedin.parseq;

/**
 * The task log provides a facility for logging task events.
 *
 * @author Chris Pettitt (cpettitt@linkedin.com)
 */
public interface TaskLog
{
  /**
   * Logs that a task has been started.
   *
   * @param task the task that started
   */
  void logTaskStart(Task<?> task);

  /**
   * Logs that a task has finished.
   *
   * @param task the task that finished
   */
  void logTaskEnd(Task<?> task);
}