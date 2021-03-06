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
package nl.xillio.gitbreakers.procrastimaster.server.repositories;

import nl.xillio.gitbreakers.procrastimaster.server.model.entity.BaseEntity;
import nl.xillio.gitbreakers.procrastimaster.server.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Date;
import java.util.Optional;

@NoRepositoryBean
public interface AbstractRepository<T extends BaseEntity> extends CrudRepository<T, Integer> {
    Optional<T> findTopByCreatedByOrderByCreatedOnDesc(User user);

    Optional<T> findTopByCreatedOnBetweenAndCreatedBy(Date start, Date end, User creator);
}
