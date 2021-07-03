package com.jaz21026nbp.Repository;

import com.jaz21026nbp.Model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NBPRepository extends JpaRepository<Entry, Long> {
}
