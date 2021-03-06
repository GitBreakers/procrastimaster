/**
 * Copyright (C) 2017 Xillio GitBreakers (GitBreakers@xillio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.xillio.gitbreakers.procrastimaster.server.model.entity;

import javax.persistence.Entity;
import java.util.Date;

/**
 * This class represents the post every working team member creates at the end of the day, telling the other team
 * members what they have been working on today.
 *
 * @author Thomas Biesaart
 */
@Entity
public class Update extends BaseEntity {
    private String todayIHave;
    private String todayIHaveNot;
    private Date nextDay;

    public String getTodayIHave() {
        return todayIHave;
    }

    public void setTodayIHave(String todayIHave) {
        this.todayIHave = todayIHave;
    }

    public String getTodayIHaveNot() {
        return todayIHaveNot;
    }

    public void setTodayIHaveNot(String todayIHaveNot) {
        this.todayIHaveNot = todayIHaveNot;
    }

    public Date getNextDay() {
        return nextDay;
    }

    public void setNextDay(Date nextDay) {
        this.nextDay = nextDay;
    }
}
