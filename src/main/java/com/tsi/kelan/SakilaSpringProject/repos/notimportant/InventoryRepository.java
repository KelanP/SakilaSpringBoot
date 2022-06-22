package com.tsi.kelan.SakilaSpringProject.repos.notimportant;

import com.tsi.kelan.SakilaSpringProject.entities.more.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}